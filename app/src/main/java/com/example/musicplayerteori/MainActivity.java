package com.example.musicplayerteori;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button buttonStart, buttonStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.playy);
        buttonStop = findViewById(R.id.stopp);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }
    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.playy:

                startService(new Intent(this, servis.class));
                break;
            case R.id.stopp:
                stopService(new Intent(this, servis.class));
                break;
        }
    }
}