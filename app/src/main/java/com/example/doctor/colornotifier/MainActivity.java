package com.example.doctor.colornotifier;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Color Notifier", "onCreate");

        /*
        Button btnStart = (Button)findViewById(R.id.buttonStart);
        Button btnStop = (Button)findViewById(R.id.buttonStop);

        View.OnClickListener onclBtnStart = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), BackgroundService.class);
                startService(intent);

            }
        };
        btnStart.setOnClickListener(onclBtnStart);

        View.OnClickListener onclBtnStop = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), BackgroundService.class);
                stopService(intent);
                finish();

            }
        };
        btnStop.setOnClickListener(onclBtnStop);
*/
    }

}
