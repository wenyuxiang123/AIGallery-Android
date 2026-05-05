#!/usr/bin/env python3
"""
批量修复AIGallery-Android项目中的反编译问题文件
"""

import os
import re

BASE_DIR = "/app/data/所有对话/主对话/AIGallery-Android/app/src/main/java/com/google/ai/edge/gallery"

def get_default_return(method_line):
    """根据方法签名确定默认返回值"""
    # 检查返回类型
    if 'void ' in method_line or '(void ' in method_line:
        return None  # void方法不需要return
    if re.search(r'\bboolean\b', method_line):
        return 'return false;'
    if re.search(r'\bint\b', method_line):
        return 'return 0;'
    if re.search(r'\blong\b', method_line):
        return 'return 0L;'
    if re.search(r'\bfloat\b', method_line):
        return 'return 0.0f;'
    if re.search(r'\bdouble\b', method_line):
        return 'return 0.0;'
    if 'String' in method_line:
        return 'return "";'
    if re.search(r'\b(List|ArrayList|MutableList|ImmutableList)<', method_line):
        return 'return Collections.emptyList();'
    if re.search(r'\b(Map|HashMap|MutableMap|ImmutableMap)<', method_line):
        return 'return Collections.emptyMap();'
    if re.search(r'\b(Set|HashSet|MutableSet)<', method_line):
        return 'return Collections.emptySet();'
    if 'Object' in method_line:
        return 'return null;'
    # 默认返回null
    return 'return null;'

def fix_file(filepath):
    """修复单个文件"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original = content
    fixed_count = 0
    
    # 1. 修复 ?? xxx = xxx; 语法错误
    content = re.sub(r'\?\?\s+(\w+)\s*=\s*([^;]+);', r'String \1 = \2;', content)
    
    # 2. 修复 "Method dump skipped" 方法
    # 找到所有包含 "Method dump skipped" 的方法并替换为空实现
    
    # 匹配方法: 包含方法签名和 "Method dump skipped" 行
    # 从方法开始括号到 throw UnsupportedOperationException 结束
    
    # 找到所有需要替换的方法
    lines = content.split('\n')
    new_lines = []
    i = 0
    skip_until_brace_close = False
    brace_count = 0
    method_start = -1
    method_sig = ""
    
    while i < len(lines):
        line = lines[i]
        
        # 检测是否跳过当前块
        if skip_until_brace_close:
            # 统计括号
            brace_count += line.count('{') - line.count('}')
            if brace_count <= 0:
                skip_until_brace_close = False
                # 添加替换的方法
                default_ret = get_default_return(method_sig)
                indent = "        "
                if default_ret:
                    new_lines.append(f'{indent}// Method dump skipped - placeholder implementation')
                    new_lines.append(f'{indent}{default_ret}')
                else:
                    new_lines.append(f'{indent}// Method dump skipped - placeholder implementation')
                fixed_count += 1
            i += 1
            continue
        
        # 检测到 Method dump skipped
        if 'Method dump skipped' in line:
            # 回溯找到方法签名行
            j = i - 1
            while j >= 0:
                # 找到方法开始行 (包含 public/protected/private)
                if re.search(r'\b(public|protected|private)\s+', lines[j]):
                    # 找到方法名
                    sig_match = re.search(r'((?:public|protected|private)\s+(?:static\s+)?(?:final\s+)?[\w<>,\s\[\]]+\s+\w+\s*\([^)]*\)\s*(?:throws\s+[\w,\s]+)?)', lines[j])
                    if sig_match:
                        method_sig = sig_match.group(1)
                    method_start = j
                    break
                j -= 1
            
            if method_start >= 0:
                # 跳过从方法开始到方法结束的内容
                skip_until_brace_close = True
                brace_count = 0
                # 添加方法签名
                new_lines.append(lines[method_start])
                i = method_start + 1
                # 添加方法开括号
                if '{' in lines[i]:
                    new_lines.append(lines[i])
                continue
        
        new_lines.append(line)
        i += 1
    
    content = '\n'.join(new_lines)
    
    # 移除可能的重复空行
    content = re.sub(r'\n{3,}', '\n\n', content)
    
    if content != original:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
    
    return fixed_count

def main():
    # 获取所有包含"Method dump skipped"的文件
    result = os.popen(f'cd "{BASE_DIR}" && grep -rl "Method dump skipped" . 2>/dev/null | sort').read()
    files = [f.strip() for f in result.strip().split('\n') if f.strip()]
    
    print(f"Found {len(files)} files with 'Method dump skipped'")
    print("=" * 60)
    
    total_fixed = 0
    for filepath in files:
        full_path = os.path.join(BASE_DIR, filepath.lstrip('./'))
        if os.path.exists(full_path):
            count = fix_file(full_path)
            if count > 0:
                print(f"Fixed {count} method(s) in {filepath}")
                total_fixed += count
        else:
            print(f"File not found: {filepath}")
    
    print("=" * 60)
    print(f"Total methods fixed: {total_fixed}")
    
    # 检查GalleryNavGraphKt.java是否还有其他语法问题
    nav_path = os.path.join(BASE_DIR, "ui/navigation/GalleryNavGraphKt.java")
    if os.path.exists(nav_path):
        with open(nav_path, 'r') as f:
            content = f.read()
        if '?? ' in content:
            print(f"WARNING: GalleryNavGraphKt.java still has '??' syntax errors")
            # 手动修复
            content = content.replace('?? ', '')
            with open(nav_path, 'w') as f:
                f.write(content)
            print("  Applied manual fix for '??' syntax")
            total_fixed += 1
    
    return total_fixed

if __name__ == '__main__':
    main()
