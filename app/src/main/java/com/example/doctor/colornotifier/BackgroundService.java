package com.example.doctor.colornotifier;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class BackgroundService extends Service {

    @Override
    public void onCreate() {
        Log.d("BGService", " onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("BGService", " onStart");
        return START_NOT_STICKY;

    }

    @Override
    public IBinder onBind(Intent arg0) {
        Log.d("BGService" , "Service onBind");
        return null;
    }

        @Override
    public void onDestroy() {

        Log.d("BGService", "Service onDestroy");

    }

}
