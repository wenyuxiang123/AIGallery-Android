# AIGallery Android

AIGallery 是 Google AI Edge Gallery 项目的 Android 客户端应用。这是一个基于 Jetpack Compose 和 TensorFlow Lite 的 AI 模型画廊应用。

## 项目结构

```
AIGallery-Android/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/google/ai/edge/gallery/  # Java 源文件 (872个)
│   │       ├── res/                              # 资源文件
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── gradle/
│   └── wrapper/
├── gradlew
├── gradlew.bat
├── build.gradle
├── settings.gradle
└── .gitignore
```

## 技术栈

- **UI**: Jetpack Compose
- **DI**: Hilt (Dagger)
- **Architecture**: MVVM with Clean Architecture
- **AI/ML**: TensorFlow Lite, LLM Runtime
- **Async**: Kotlin Coroutines
- **Navigation**: Jetpack Navigation Compose

## 构建说明

### 前置要求

- Android Studio Hedgehog (2023.1.1) 或更高版本
- JDK 17
- Android SDK API 35

### 使用 Android Studio 构建

1. 打开 Android Studio
2. 选择 "Open an existing project"
3. 选择 `AIGallery-Android` 目录
4. 等待 Gradle sync 完成
5. 点击 Run 或使用 Build > Build APK

### 使用命令行构建

```bash
# Linux/macOS
chmod +x gradlew
./gradlew assembleDebug

# Windows
gradlew.bat assembleDebug
```

### GitHub Actions 自动构建

项目已配置 GitHub Actions 工作流（`.github/workflows/android.yml`），每次推送到 `main` 分支时会自动构建 debug APK。

构建产物位于：
- `app/build/outputs/apk/debug/app-debug.apk`

## 依赖说明

主要依赖包括：
- AndroidX Core, AppCompat, Lifecycle
- Jetpack Compose UI & Material3
- Hilt for dependency injection
- Firebase Analytics & Cloud Messaging
- CameraX for camera functionality
- TensorFlow Lite / LLM Runtime

## 注意事项

⚠️ **已知问题（后续需要解决）**:

1. **R资源ID**: 反编译后 R 资源 ID 已内联为数字，需要还原
2. **类型混淆**: 部分混淆后的类型需要手动调整
3. **依赖版本**: 依赖版本可能需要根据实际情况微调

## 许可证

本项目基于反编译代码重建，仅供学习和研究使用。
