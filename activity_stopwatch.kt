<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"

    <!-- Add some background color -->
    android:background="#0F9D58"
    android:padding="16dp"
    tools:context="org.geeksforgeeks.stopwatch.StopwatchActivity">

    <TextView

        <!-- We will use text view "time_view" -->
        <!-- to display the number of seconds. -->
        android:id="@+id/time_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"

        <!-- These below attributes make the stopwatch -->
        <!-- timer nice and big. -->
        android:textAppearance="@android:style/TextAppearance.Large"
        android:textSize="56sp" />

    <Button
        <!-- This code is for the Start button.
        android:id="@+id/start_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="20dp"

        <!-- When it gets clicked, the Start button -->
        <!-- calls the onClickStart() method. -->
        android:onClick="onClickStart"
        android:text="@string/start" />
    <Button

        <!-- This code is for the Stop button. -->
        android:id="@+id/stop_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="8dp"

        <!-- When it gets clicked, the Stop button -->
        <!-- calls the onClickStop() method. -->
        android:onClick="onClickStop"
        android:text="@string/stop" />
    <Button

        <!-- This code is for Reset button. -->
        android:id="@+id/reset_button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="8dp"

        <!-- When it gets clicked, the Reset button -->
        <!-- calls the onClickReset() method. -->
        android:onClick="onClickReset"
        android:text="@string/reset" />
</LinearLayout>
