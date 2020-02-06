package com.example.anrdemo;

import androidx.annotation.NonNull;

public class CrashHandler implements Thread.UncaughtExceptionHandler {

    private Thread.UncaughtExceptionHandler mOriginalHandler;

    public CrashHandler() {
        mOriginalHandler = Thread.getDefaultUncaughtExceptionHandler();
    }

    @Override
    public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
        e.printStackTrace();
        if (mOriginalHandler != null) {
            mOriginalHandler.uncaughtException(t, e);
        }
    }
}
