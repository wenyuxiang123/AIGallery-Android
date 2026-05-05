#!/usr/bin/env python3
"""快速批量修复反编译问题"""

import os
import re
import subprocess

BASE_DIR = "/app/data/所有对话/主对话/AIGallery-Android/app/src/main/java/com/google/ai/edge/gallery"

def get_default_return(sig):
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
        return 'Collections.emptyList()'
    if 'Map<' in sig or 'HashMap' in sig or 'MutableMap' in sig:
        return 'Collections.emptyMap()'
    if 'Set<' in sig or 'HashSet' in sig:
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
        
        # 修复 ?? xxx = xxx; 语法错误
        if '?? ' in line:
            line = line.replace('?? ', '')
            fixed += 1
        
        new_lines.append(line)
        
        # 检测到 Method dump skipped
        if 'Method dump skipped' in line:
            # 回溯找到方法签名行
            method_sig = None
            brace_pos = -1
            for j in range(i-1, max(0, i-20), -1):
                l = lines[j]
                if 'public ' in l or 'protected ' in l or 'private ' in l:
                    m = re.search(r'((?:public|protected|private)\s+(?:static\s+)?(?:final\s+)?[\w<>\[\],\s]+\s+\w+\s*\([^)]*\))', l)
                    if m:
                        method_sig = m.group(1)
                        brace_pos = l.find('{')
                        if brace_pos >= 0:
                            new_lines[j] = l[:brace_pos+1] + '\n        // Method dump skipped - placeholder implementation'
                            default_ret = get_default_return(method_sig)
                            if default_ret:
                                new_lines[j] += '\n        ' + default_ret
                            new_lines[j] += '\n    }'
                            # 跳过到匹配的 }
                            brace_count = 1
                            for k in range(j+1, len(lines)):
                                brace_count += lines[k].count('{') - lines[k].count('}')
                                if brace_count <= 0:
                                    break
                            i = k + 1
                            fixed += 1
                            break
                    break
            if brace_pos < 0:
                i += 1
        else:
            i += 1
    
    content = ''.join(new_lines)
    content = content.replace('?? ', '')
    
    if content != original:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write(content)
    
    return fixed

# 获取文件列表
result = subprocess.run(['grep', '-rl', 'Method dump skipped', '.'], 
                       capture_output=True, text=True, cwd=BASE_DIR)
files = [f.strip() for f in result.stdout.strip().split('\n') if f.strip()]

print(f"Found {len(files)} files")
total = 0

for f in files:
    count = fix_single_file(f)
    if count > 0:
        print(f"Fixed {count} in {f}")
        total += count

print(f"\nTotal fixed: {total}")
