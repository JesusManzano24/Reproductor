package com.jesusmanzano.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button play_pause;
    MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        play_pause=(Button)findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this,R.raw.n1);
        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.pause();
                    Toast.makeText(MainActivity2.this,"Pausa", Toast.LENGTH_SHORT).show();
                }
                else{
                    mp.start();
                    Toast.makeText(MainActivity2.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}