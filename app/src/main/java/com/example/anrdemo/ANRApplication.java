package com.example.anrdemo;

import android.app.Application;

public class ANRApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new CrashHandler());
    }
}
