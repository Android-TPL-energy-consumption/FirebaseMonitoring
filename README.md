# MonitoringTemplate

This is a minimal application, only featuring a swipe container with 5 fragments. It is meant to be
cloned to study energy consumption of monitoring third-party libraries.

## Scenario

The `scenario.sh` script allows you to automatically browse through the application.

It will automatically launch the app, swipe through all 5 fragments, then swipe back to the first,
and finally, send app to background (simulating "back" button input).

To use it, make sure you have `adb` installed and an Android device with dev mode plugged-in.

## Credits

[https://github.com/rsain/Android-TPLs](https://github.com/rsain/Android-TPLs)