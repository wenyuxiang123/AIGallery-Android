#!/usr/bin/env python3
"""处理单个文件 - 行操作版"""
import sys

filepath = sys.argv[1] if len(sys.argv) > 1 else "test.java"

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
        # 回溯找到方法签名行
        sig_line = None
        for j in range(i-1, max(0, i-20), -1):
            l = lines[j]
            if '{' in l and ('public ' in l or 'protected ' in l or 'private ' in l):
                sig_line = j
                break
        
        if sig_line is not None:
            # 获取原始签名
            sig = lines[sig_line].strip()
            # 截断到 {
            brace_pos = sig.find('{')
            new_sig = sig[:brace_pos+1]
            
            # 确定返回类型
            if 'void ' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n    }'
            elif 'boolean' in sig or 'Boolean' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return false;\n    }'
            elif 'int ' in sig or 'Integer' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return 0;\n    }'
            elif 'long ' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return 0L;\n    }'
            elif 'String' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return "";\n    }'
            elif 'List' in sig or 'ArrayList' in sig or 'MutableList' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return Collections.emptyList();\n    }'
            elif 'Map' in sig or 'HashMap' in sig or 'MutableMap' in sig:
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return Collections.emptyMap();\n    }'
            else:  # Object or other
                new_body = new_sig + '\n        // Method dump skipped - placeholder implementation\n        return null;\n    }'
            
            # 添加新内容
            new_lines.append(new_body)
            
            # 跳过旧内容直到找到 }
            brace_count = 1
            j = sig_line + 1
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
    print(f"Fixed {fixed} issues in {filepath}")
else:
    print(f"No change: {filepath}")
