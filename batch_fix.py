#!/usr/bin/env python3
"""批量修复所有反编译问题文件"""
import os
import subprocess
import sys

BASE_DIR = "/app/data/所有对话/主对话/AIGallery-Android/app/src/main/java/com/google/ai/edge/gallery"
FIX_SCRIPT = "/app/data/所有对话/主对话/AIGallery-Android/fix_v4.py"

def get_default_return(sig):
    """根据方法签名确定默认返回值"""
    if 'void ' in sig:
        return None
    if 'boolean' in sig or 'Boolean' in sig:
        return 'return false;'
    if 'int ' in sig or 'Integer' in sig:
        return 'return 0;'
    if 'long ' in sig:
        return 'return 0L;'
    if 'float ' in sig:
        return 'return 0.0f;'
    if 'double ' in sig:
        return '0.0'
    if 'String' in sig:
        return 'return "";'
    if 'List' in sig or 'ArrayList' in sig or 'MutableList' in sig:
        return 'Collections.emptyList()'
    if 'Map' in sig or 'HashMap' in sig or 'MutableMap' in sig:
        return 'Collections.emptyMap()'
    if 'Set' in sig or 'HashSet' in sig:
        return 'Collections.emptySet()'
    return 'return null;'

def fix_single_file(filepath):
    """处理单个文件"""
    with open(filepath, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    
    original = ''.join(lines)
    new_lines = []
    i = 0
    fixed = 0
    
    while i < len(lines):
        line = lines[i]
        
        # 修复 ?? 语法
        if '?? ' in line:
            line = line.replace('?? ', '')
            fixed += 1
            new_lines.append(line)
            i += 1
            continue
        
        # 检测到 Method dump skipped
        if 'Method dump skipped' in line:
            # 回溯找到方法签名行（包含 {）
            sig_line_idx = None
            for j in range(i-1, max(0, i-20), -1):
                l = lines[j]
                if '{' in l and ('public ' in l or 'protected ' in l or 'private ' in l):
                    sig_line_idx = j
                    break
            
            if sig_line_idx is not None:
                sig = lines[sig_line_idx].rstrip()
                brace_pos = sig.find('{')
                new_sig = sig[:brace_pos+1]
                
                # 确定返回类型并生成新方法体
                ret_type = 'Object'
                if 'void ' in sig:
                    ret_type = 'void'
                elif 'boolean' in sig or 'Boolean' in sig:
                    ret_type = 'boolean'
                elif 'int ' in sig or 'Integer' in sig:
                    ret_type = 'int'
                elif 'long ' in sig:
                    ret_type = 'long'
                elif 'float ' in sig:
                    ret_type = 'float'
                elif 'double ' in sig:
                    ret_type = 'double'
                elif 'String' in sig:
                    ret_type = 'String'
                elif 'List' in sig or 'ArrayList' in sig or 'MutableList' in sig:
                    ret_type = 'List'
                elif 'Map' in sig or 'HashMap' in sig or 'MutableMap' in sig:
                    ret_type = 'Map'
                elif 'Set' in sig or 'HashSet' in sig:
                    ret_type = 'Set'
                
                # 生成返回语句
                if ret_type == 'void':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n        }'
                elif ret_type == 'boolean':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return false;\n        }'
                elif ret_type == 'int':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return 0;\n        }'
                elif ret_type == 'long':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return 0L;\n        }'
                elif ret_type == 'float':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return 0.0f;\n        }'
                elif ret_type == 'double':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return 0.0;\n        }'
                elif ret_type == 'String':
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return "";\n        }'
                elif ret_type in ('List', 'Map', 'Set'):
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return Collections.empty' + ret_type + '();\n        }'
                else:
                    new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return null;\n        }'
                
                # 添加新方法
                new_lines.append(new_body + '\n')
                
                # 跳过旧内容直到找到 } (结束方法)
                brace_count = 1
                j = sig_line_idx + 1
                while j < len(lines) and brace_count > 0:
                    brace_count += lines[j].count('{') - lines[j].count('}')
                    j += 1
                
                i = j
                fixed += 1
                continue
        
        new_lines.append(line)
        i += 1
    
    content = ''.join(new_lines)
    
    if content != original:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
        return fixed
    return 0

def main():
    os.chdir(BASE_DIR)
    
    # 获取文件列表
    result = subprocess.run(['grep', '-rl', 'Method dump skipped', '.'], 
                           capture_output=True, text=True, cwd=BASE_DIR)
    files = [f.strip() for f in result.stdout.strip().split('\n') if f.strip()]
    
    print(f"Found {len(files)} files with 'Method dump skipped'")
    print("=" * 60)
    
    total_fixed = 0
    for filepath in files:
        count = fix_single_file(filepath)
        if count > 0:
            print(f"Fixed {count} issue(s) in {filepath}")
            total_fixed += count
    
    print("=" * 60)
    print(f"Total issues fixed: {total_fixed}")
    return total_fixed

if __name__ == '__main__':
    main()
