package com.jesusmanzano.reproductor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button play_pause;
    Button Monaco;
    Button NadieSabe;
    Button Fina;
    Button Hibiki;
    Button MR_OCTOBER;
    Button CYBERTRUCK;
    Button VOU_787;
    Button SEDA;
    Button GRACIAS_POR_NADA;
    MediaPlayer mp;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        play_pause = findViewById(R.id.play_pause);
        Monaco = findViewById(R.id.Monaco);
        NadieSabe =findViewById(R.id.NadieSabe1);
        Fina = findViewById(R.id.Fina);
        Hibiki = findViewById(R.id.Hibiki);
        MR_OCTOBER= findViewById(R.id.MR_OCTOBER);
        CYBERTRUCK= findViewById(R.id.CYBERTRUCK);
        VOU_787= findViewById(R.id.VOU_787);
        SEDA = findViewById(R.id.SEDA);
        GRACIAS_POR_NADA= findViewById(R.id.GRACIAS_POR_NADA);

        mp = MediaPlayer.create(this, R.raw.n1); //

        play_pause.setOnClickListener(v -> {
            if (isPlaying) {
                mp.pause();
                Toast.makeText(MainActivity2.this, "Pausa", Toast.LENGTH_SHORT).show();
            } else {
                mp.start();
                Toast.makeText(MainActivity2.this, "Play", Toast.LENGTH_SHORT).show();
            }
            isPlaying = !isPlaying; // Cambia el estado de reproducción
        });

        NadieSabe.setOnClickListener(v -> {
            mp.release(); // Libera la memoria de la canción anterior
            mp = MediaPlayer.create(MainActivity2.this, R.raw.n1);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true; // Establece el estado de reproducción
        });
        Monaco.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.monaco);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        Fina.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.fina);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        Hibiki.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.hibiki);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        MR_OCTOBER.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.mroctober);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        CYBERTRUCK.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.cybertruck);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        VOU_787.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.vou787);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        SEDA.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.seda);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });
        GRACIAS_POR_NADA.setOnClickListener(v -> {
            mp.release();
            mp = MediaPlayer.create(MainActivity2.this, R.raw.graciaspornada);
            mp.start();
            Toast.makeText(MainActivity2.this, "Reproduciendo otra canción", Toast.LENGTH_SHORT).show();
            isPlaying = true;
        });

    }
}