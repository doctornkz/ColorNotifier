package com.example.doctor.colornotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by doctor on 13.07.16.
 */
public class TelegramMessageReplyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Telegram Intent Detected.", Toast.LENGTH_LONG).show();

    }
}
