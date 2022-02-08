#!/bin/bash

PACKAGE="tpl.monitoring.template"
ACTIVITY="tpl.monitoring.template.ScreenSlidePagerActivity"

# Launch app
adb shell am start -n $PACKAGE/$ACTIVITY

# Wait few seconds to simulate user waiting
sleep 1

# Swipe left
adb shell input swipe 600 500 100 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe left
adb shell input swipe 600 500 100 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe left
adb shell input swipe 600 500 100 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe left
adb shell input swipe 600 500 100 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe right
adb shell input swipe 100 500 600 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe right
adb shell input swipe 100 500 600 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe right
adb shell input swipe 100 500 600 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Swipe right
adb shell input swipe 100 500 600 500 100

# Wait few seconds to simulate user waiting
sleep 1

# Back button (to pause/put the app in background)
adb shell input keyevent 4

# Wait few seconds to wait until report is sent
sleep 12