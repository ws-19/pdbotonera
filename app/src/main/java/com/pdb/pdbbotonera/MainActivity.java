package com.pdb.pdbbotonera;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button normalClapping = (Button) findViewById(R.id.normalClapping);
        normalClapping.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.normal_applause_short);
            mp.start();
        });


        Button applause = (Button) findViewById(R.id.applause);
        applause.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.audience_clapping_short);
            mp.start();
        });


        Button cashier = (Button) findViewById(R.id.cashier);
        cashier.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.cash_machine_loud);
            mp.start();
        });


        Button cockingGun = (Button) findViewById(R.id.cockingGun);
        cockingGun.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.shotgun_cocking);
            mp.start();
        });

        Button shot = (Button) findViewById(R.id.shotSingle);
        shot.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.disparo);
            mp.start();
        });

        Button machineGun = (Button) findViewById(R.id.machineGun);
        machineGun.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.metralla);
            mp.start();
        });

           Button resfriadinho = (Button) findViewById(R.id.resfriadinho);
        resfriadinho.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.resfriadinho_bolsonaro);
            mp.start();
        });

           Button drummer = (Button) findViewById(R.id.drummer);
        drummer.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.drum_tada);
            mp.start();
        });


    }
}