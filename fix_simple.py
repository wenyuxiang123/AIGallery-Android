#!/usr/bin/env python3
"""处理单个文件 - 简化版"""
import sys
import re

filepath = sys.argv[1] if len(sys.argv) > 1 else "test.java"

with open(filepath, 'r', encoding='utf-8') as f:
    content = f.read()

original = content

# 修复 ?? 语法
content = content.replace('?? ', '')

# 替换: public ... Object invokeSuspend(...) { /* Method dump skipped */ throw ... }
# 模式: 方法签名 { /* 注释块 Method dump skipped */ throw ... }
def replace_match(m):
    sig = m.group(1)
    # 确定返回类型
    if 'void ' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n    }'
    if 'boolean' in sig or 'Boolean' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return false;\n    }'
    if 'int' in sig or 'Integer' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return 0;\n    }'
    if 'long' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return 0L;\n    }'
    if 'String' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return "";\n    }'
    if 'List' in sig or 'ArrayList' in sig or 'MutableList' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return Collections.emptyList();\n    }'
    if 'Map' in sig or 'HashMap' in sig or 'MutableMap' in sig:
        return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return Collections.emptyMap();\n    }'
    # 默认返回null (Object类型)
    return sig + ' {\n        // Method dump skipped - placeholder implementation\n        return null;\n    }'

# 匹配: public ... Object invokeSuspend(...) { /* Method dump skipped */ throw ... }
# 这里注释块是 /* ... */ 而不是 { ... }
pattern = r'(public\s+(?:static\s+)?(?:final\s+)?\s*\w+(?:<[^>]+>)?\s+(\w+)\s*\([^)]*\)\s*\{)\s*/\*[^*]*Method dump skipped[^*]*\*/\s*throw new UnsupportedOperationException[^;]*;'

content = re.sub(pattern, replace_match, content, flags=re.DOTALL)

if content != original:
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(content)
    print(f"Fixed: {filepath}")
else:
    print(f"No change: {filepath}")
