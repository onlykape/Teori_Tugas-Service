package com.example.musicplayerteori;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import android.widget.Toast;

public class servis extends Service {
    MediaPlayer myPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Successfully Created", Toast.LENGTH_LONG).show();
        myPlayer = MediaPlayer.create(this,R.raw.perindo);

    }
    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Service Berjalan, Sedang Memutar Musik", Toast.LENGTH_LONG).show();
        myPlayer.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Berhenti, Music Stopped", Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }
}