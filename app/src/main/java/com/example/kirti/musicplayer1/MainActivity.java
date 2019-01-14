package com.example.kirti.musicplayer1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button play,pause,stop;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.btn_play);
        pause=findViewById(R.id.btn_pause);
        stop=findViewById(R.id.btn_stop);
    }
    @Override
   public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_play:

                mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);
                mediaPlayer.start();
                break;
            case R.id.btn_pause:
                break;
            case R.id.btn_stop:
                break;

        }
    }
}
