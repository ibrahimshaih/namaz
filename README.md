# namaz

PWA "Azkar" (утренние/вечерние зикры) + Capacitor-обёртка для Android.

## Структура

- `index.html`, `manifest.json`, `sw.js`, `icon-*.png` — исходный веб-код (единый источник).
- `www/` — копия веб-ассетов, которую использует Capacitor (`webDir`). После правок в корневых файлах копировать сюда же.
- `android/` — нативный Android-проект (Capacitor).
- `resources/icon.png` — исходник иконки для генерации нативных иконок/сплэшей.

## Разработка

```
# после изменения index.html / manifest.json / sw.js:
cp index.html manifest.json sw.js www/
npx cap sync android
```

## Сборка Android

Нужен JDK 17+ и Android SDK (переменная `ANDROID_HOME`).

```
cd android
./gradlew assembleDebug
```

APK: `android/app/build/outputs/apk/debug/app-debug.apk`

## Пересоздать иконки/сплэши

```
npx capacitor-assets generate --android --iconBackgroundColor '#0d0d0d' --iconBackgroundColorDark '#0d0d0d' --splashBackgroundColor '#0d0d0d' --splashBackgroundColorDark '#0d0d0d'
```
