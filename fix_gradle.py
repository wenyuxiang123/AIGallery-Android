content = open('./AIGallery-Android/app/build.gradle').read()
old = """    packagingOptions {
        pickFirst '**/libLiteRt.so'
        pickFirst '**/libtensorflowlite_jni.so'
        pickFirst '**/libtensorflowlite_c.so'
        pickFirst '**/libtflite_jni.so'
    }"""
new = """    packaging {
        jniLibs {
            pickFirsts += ['**/*.so']
        }
    }"""
content = content.replace(old, new)
open('./AIGallery-Android/app/build.gradle', 'w').write(content)
print("Done")
