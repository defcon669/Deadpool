package com.example.deadpool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ImageView Apocalypse;
    private ImageView DeadPool;
    private TextView dropIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hookedonafeeling);
        mediaPlayer.start();

        Toast.makeText(getApplicationContext(), "Tap anywhere on the screen...",
                Toast.LENGTH_LONG).show();

        Apocalypse = (ImageView) findViewById(R.id.Apocalypse);
        DeadPool = (ImageView) findViewById(R.id.DeadPool);
        dropIn = (TextView) findViewById(R.id.dropIn);

        DeadPool.setVisibility(View.INVISIBLE);
        dropIn.setVisibility(View.INVISIBLE);

        Apocalypse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeadPool.setVisibility(View.VISIBLE);
                dropIn.setVisibility(View.VISIBLE);
            }
        });

        DeadPool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
    }
}