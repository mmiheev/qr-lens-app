# QR Lens

A simple and efficient QR code scanner application for Android, built with Kotlin using the [android-qr-scanner](https://github.com/mmiheev/android-qr-scanner) library.

## Quick start

### Prerequisites

- Android Studio Arctic Fox or newer
- Android SDK 24 (Android 7.0) or higher
- Device with camera or emulator

### Installation

1. Clone the repository:
```bash
git clone https://github.com/mmiheev/qr-lens-app.git
```

2. Open the project in Android Studio

3. Wait for Gradle synchronization to complete

4. Build and run the app on your device or emulator

## Usage

1. **Launch the app**: Open the application on your Android device
2. **Grant permissions**: Allow camera access when prompted
3. **Scan QR code**: Point your camera at a QR code
4. **Get results**: The app will automatically detect

## Technical Details

### Dependencies

Main project dependencies:

```gradle
dependencies {
    implementation 'com.github.mmiheev:android-qr-scanner:1.0.3'
    implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.6.0'
    implementation 'com.google.android.material:material:1.8.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
}
```

## Contributing

I welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Support

If you encounter any issues or have questions:

- Create an Issue in the repository
- Check existing Issues before creating a new one
- Provide detailed description of the problem
