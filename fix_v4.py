#!/usr/bin/env python3
"""处理单个文件 - 修复版"""
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
            elif 'String' in sig:
                ret_type = 'String'
            elif 'List' in sig or 'ArrayList' in sig or 'MutableList' in sig:
                ret_type = 'List'
            elif 'Map' in sig or 'HashMap' in sig or 'MutableMap' in sig:
                ret_type = 'Map'
            
            # 生成返回语句
            if ret_type == 'void':
                new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n        }'
            elif ret_type == 'boolean':
                new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return false;\n        }'
            elif ret_type == 'int':
                new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return 0;\n        }'
            elif ret_type == 'long':
                new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return 0L;\n        }'
            elif ret_type == 'String':
                new_body = new_sig + '\n            // Method dump skipped - placeholder implementation\n            return "";\n        }'
            elif ret_type in ('List', 'Map'):
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
    print(f"Fixed {fixed} issues in {filepath}")
else:
    print(f"No change: {filepath}")
