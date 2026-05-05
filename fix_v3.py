#!/usr/bin/env python3
"""批量修复反编译问题"""

import os
import re

BASE_DIR = "/app/data/所有对话/主对话/AIGallery-Android/app/src/main/java/com/google/ai/edge/gallery"

def get_default_return(sig):
    """根据方法签名确定默认返回值"""
    if 'void ' in sig:
        return None
    if ' boolean' in sig or 'Boolean' in sig:
        return 'return false;'
    if ' int' in sig or 'Integer' in sig:
        return 'return 0;'
    if ' long' in sig:
        return 'return 0L;'
    if ' float' in sig:
        return 'return 0.0f;'
    if ' double' in sig:
        return 'return 0.0;'
    if 'String' in sig:
        return 'return "";'
    if 'List<' in sig or 'ArrayList' in sig or 'MutableList' in sig:
        return 'return Collections.emptyList();'
    if 'Map<' in sig or 'HashMap' in sig or 'MutableMap' in sig:
        return 'return Collections.emptyMap();'
    if 'Set<' in sig or 'HashSet' in sig:
        return 'return Collections.emptySet();'
    return 'return null;'

def fix_file(filepath):
    """修复单个文件"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    original = content
    fixed = 0
    
    # 1. 修复 ?? xxx = xxx; 语法错误
    if '?? ' in content:
        content = content.replace('?? ', '')
        fixed += 1
    
    # 2. 修复 "Method dump skipped" 方法
    # 匹配整个方法块并替换
    
    while True:
        # 查找 "Method dump skipped" 所在的完整方法
        pattern = r'(public\s+(?:static\s+)?(?:final\s+)?[\w<>\[\],\s]+\s+\w+\s*\([^)]*\)\s*(?:throws\s+[\w,\s]+)?\s*\{[^}]*?\{[^}]*?Method dump skipped[^}]*?\{[^}]*?throw new UnsupportedOperationException\("Method decompiled[^}]*?\}\s*\})'
        
        match = re.search(pattern, content, re.DOTALL)
        if not match:
            break
        
        method_block = match.group(1)
        
        # 提取方法签名
        sig_match = re.search(r'(public\s+(?:static\s+)?(?:final\s+)?[\w<>\[\],\s]+\s+\w+\s*\([^)]*\))', method_block)
        if sig_match:
            sig = sig_match.group(1)
            default_ret = get_default_return(sig)
            
            if default_ret:
                replacement = f'{sig} {{\n        // Method dump skipped - placeholder implementation\n        {default_ret}\n    }}'
            else:
                replacement = f'{sig} {{\n        // Method dump skipped - placeholder implementation\n    }}'
            
            content = content[:match.start()] + replacement + content[match.end():]
            fixed += 1
        else:
            break
    
    if content != original:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
    
    return fixed

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
                print(f"Fixed {count} in {filepath}")
                total_fixed += count
        else:
            print(f"File not found: {filepath}")
    
    print("=" * 60)
    print(f"Total issues fixed: {total_fixed}")
    
    return total_fixed

if __name__ == '__main__':
    main()
