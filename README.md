# Android Hello World

Aplikasi Android sederhana yang menampilkan "Hello World!".

## Build dengan GitHub Actions

Setiap push ke repository ini akan otomatis:
1. Build APK di GitHub Actions (RAM 7GB, gratis)
2. Upload APK ke TFT (Temporary File Transfer)
3. Kirim download link ke Discord

## Setup

### Prerequisites
- Java 17+
- Android SDK (optional, hanya untuk development lokal)

### GitHub Secrets yang Diperlukan

Tambahkan di **Settings → Secrets and variables → Actions**:

1. `TFT_API_KEY` - API key untuk upload ke TFT
2. `DISCORD_WEBHOOK` - Discord webhook URL untuk notifikasi

### Local Build (Optional)

```bash
# Build debug APK
./gradlew assembleDebug

# Output: app/build/outputs/apk/debug/app-debug.apk
```

## Tech Stack

- **Language**: Kotlin
- **Min SDK**: Android 7.0 (API 24)
- **Target SDK**: Android 14 (API 34)
- **Build Tool**: Gradle 8.2
- **Java**: 17

## GitHub Actions Workflow

Workflow otomatis berjalan saat:
- Push ke branch `master` atau `main`
- Pull request
- Manual trigger (workflow_dispatch)

**Build time**: ~2-3 menit

## Download APK

Setelah build selesai, kamu akan dapat:
1. Notifikasi di Discord dengan download link
2. Download dari TFT (valid 24 jam)
3. Download dari GitHub Actions Artifacts (valid 90 hari)

## File Structure

```
android-test-project/
├── .github/
│   └── workflows/
│       └── android.yml          # GitHub Actions workflow
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/helloworld/
│   │       │   └── MainActivity.kt
│   │       ├── res/
│   │       │   └── values/
│   │       │       └── strings.xml
│   │       └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
│   └── wrapper/
├── build.gradle.kts
├── settings.gradle.kts
└── gradlew
```

## License

Public Domain