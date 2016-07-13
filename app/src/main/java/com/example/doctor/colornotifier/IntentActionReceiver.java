package com.example.doctor.colornotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.widget.ImageView;
import android.widget.Toast;


public class IntentActionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Custom Intent Detected.", Toast.LENGTH_LONG).show();

    }

}
