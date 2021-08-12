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

        Button oldCashMachineButton = (Button) findViewById(R.id.cashierButton);
        oldCashMachineButton.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.old_cash_machine);
            mp.start();
        });


        Button resfriadinhoButton = (Button) findViewById(R.id.resfriadinhoButton);
        resfriadinhoButton.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.resfriadinho_bolsonaro);
            mp.start();
        });


        Button reloadShotgun = (Button) findViewById(R.id.reloadShotgunButton);
        reloadShotgun.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.reload_shotgun);
            mp.start();
        });


        Button gripesinha = (Button) findViewById(R.id.gripesinhaButton);
        gripesinha.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.gripesinha_bolsonaro);
            mp.start();
        });

        Button shot = (Button) findViewById(R.id.shotAk47Button);
        shot.setOnClickListener(v -> {
            final MediaPlayer mp = MediaPlayer.create(v.getContext(),R.raw.shot_ak47);
            mp.start();
        });

    }
}