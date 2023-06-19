package com.example.myapplication.database;

import android.app.Application;

import androidx.room.Room;

public class MyApplication extends Application {

    private static MyApplication mApp;

    public static MyApplication getInstance() {
        return mApp;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
