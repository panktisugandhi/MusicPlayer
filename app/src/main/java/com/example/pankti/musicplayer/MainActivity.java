package com.example.pankti.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button btn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ToggleButton TB = (ToggleButton) findViewById(R.id.tb);
        //btn = (Button) findViewById(R.id.button);
        //  btn1 = (Button) findViewById(R.id.button1);

        // final MediaPlayer md = MediaPlayer.create(MainActivity.this,R.raw.soch_na_shake);

//        final MediaPlayer[] md = {null};
//        final boolean[] flag = {false};
//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if(flag[0] ==false)
//                {
//                    md[0] = MediaPlayer.create(MainActivity.this,R.raw.soch_na_shake);
//                    md[0].start();
//                   btn.setText("Pause");
//                    flag[0] =true;
//                }
//                else if(md[0].isPlaying()&& flag[0] ==true)
//                {
//                    md[0].pause();
//                    btn.setText("Play");
//                    flag[0] =false;
//                }
//
//            }
//        });


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                    md.start();
//
//
//            }
//        });
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(md.isPlaying()){
//                    md.stop();
//                   // md.release();
//                   // MainActivity.this.finish();
//
//                }
//            }
//        });

        playSong();
    }

    public void playSong() {
        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.tb);
        ImageView imageView = (ImageView) findViewById(R.id.img);
        imageView.setImageResource(R.drawable.arijitsingh);
        mp = MediaPlayer.create(MainActivity.this, R.raw.soch_na_shake);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    mp.start();
                } else {
                    mp.pause();
                }
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (mp !=null) {
            mp.release();
            mp = null;
        }
    }
}