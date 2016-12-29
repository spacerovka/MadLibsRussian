	

The Android ActionBar has a couple of methods that can get a little confusing at times as to what their purpose is:

    setDisplayHomeAsUpEnabled(boolean showHomeAsUp)
    setHomeButtonEnabled(boolean enabled)
    setDisplayShowHomeEnabled(boolean showHome)

We’ll see how each differs from others.
setDisplayHomeAsUpEnabled(boolean showHomeAsUp)

This method makes the icon and title in the action bar clickable so that “up” (ancestral) navigation can be provided. This method will just make the icon and title pressable, but not actually add the functionality of navigating upwards. That has to be done by specifying the android:parentActivityName (takes the parent activity class name) on the activity in the manifest file.

It also adds a left-facing caret alongside the app icon.

More on Up (Ancestral) Navigation:

    http://developer.android.com/training/implementing-navigation/ancestral.html
    http://developer.android.com/training/design-navigation/ancestral-temporal.html

setHomeButtonEnabled