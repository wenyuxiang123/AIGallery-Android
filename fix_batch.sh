#!/bin/bash
# 批量修复"Method dump skipped"问题的shell脚本

BASE_DIR="/app/data/所有对话/主对话/AIGallery-Android/app/src/main/java/com/google/ai/edge/gallery"
cd "$BASE_DIR" || exit 1

echo "Finding all files with 'Method dump skipped'..."
files=$(grep -rl "Method dump skipped" . 2>/dev/null)
count=0

for filepath in $files; do
    echo "Processing: $filepath"
    
    # 使用sed进行替换
    # 1. 首先找到Method dump skipped那一行并标记
    # 2. 找到对应的方法签名行
    # 3. 提取返回类型并生成合适的空实现
    
    # 用Python来做复杂的处理
    python3 << PYTHON_EOF
import re
import os

filepath = "$filepath"
with open(filepath, 'r', encoding='utf-8') as f:
    content = f.read()

original = content

# 修复 ?? xxx = xxx; 语法错误
content = re.sub(r'\?\?\s+(\w+)\s*=\s*([^;]+);', r'String \1 = \2;', content)

# 找到所有包含"Method dump skipped"的方法
# 格式: 方法签名 { ... Method dump skipped ... throw ... }

def get_default_return(sig):
    """根据方法签名确定默认返回值"""
    if 'void ' in sig or '(void ' in sig:
        return None
    if re.search(r'\bboolean\b', sig):
        return 'return false;'
    if re.search(r'\bint\b', sig):
        return 'return 0;'
    if re.search(r'\blong\b', sig):
        return 'return 0L;'
    if re.search(r'\bfloat\b', sig):
        return 'return 0.0f;'
    if re.search(r'\bdouble\b', sig):
        return '0.0'
    if 'String' in sig:
        return 'return "";'
    if re.search(r'\b(List|ArrayList|MutableList)<', sig):
        return 'return Collections.emptyList();'
    if re.search(r'\b(Map|HashMap|MutableMap)<', sig):
        return 'Collections.emptyMap()'
    if re.search(r'\b(Set|HashSet)<', sig):
        return 'Collections.emptySet()'
    return 'return null;'

# 替换包含"Method dump skipped"的方法块
# 匹配: 从方法开始到throw UnsupportedOperationException结束

pattern = r'((?:public|protected|private)\s+(?:static\s+)?(?:final\s+)?[\w<>,\s\[\]]+\s+\w+\s*\([^)]*\)\s*(?:throws\s+[\w,\s]+)?\s*\{[^}]*?\{[^}]*?Method dump skipped.*?throw new UnsupportedOperationException\("Method decompiled[^"]*"\);[^}]*\})'

def replace_method(match):
    method_block = match.group(1)
    # 提取方法签名
    sig_match = re.search(r'((?:public|protected|private)\s+(?:static\s+)?(?:final\s+)?[\w<>,\s\[\]]+\s+\w+\s*\([^)]*\))', method_block)
    if sig_match:
        sig = sig_match.group(1)
        default_ret = get_default_return(sig)
        indent = "        "
        if default_ret:
            return f'{sig} {{\n{indent}// Method dump skipped - placeholder implementation\n{indent}{default_ret}\n    }}'
        else:
            return f'{sig} {{\n{indent}// Method dump skipped - placeholder implementation\n    }}'
    return method_block

content = re.sub(pattern, replace_method, content, flags=re.DOTALL)

if content != original:
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(content)
    print(f"  Fixed in {os.path.basename(filepath)}")

PYTHON_EOF
    
    count=$((count + 1))
done

echo "Processed $count files"
