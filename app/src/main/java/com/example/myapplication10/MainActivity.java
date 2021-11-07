package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
VideoView videoView;
Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView  = (VideoView) findViewById(R.id.videoview);
        bt=findViewById(R.id.bt);
        bt.setOnClickListener(this);


    }
    private void show() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://apis.juhe.cn/").addConverterFactory(GsonConverterFactory.create()).build();
                itenerce itenerce = retrofit.create(itenerce.class);
                Response<JsonRootBean> response = null;
                try {
                    response = itenerce.shipin("hot_video", "10", "8e2ee158d9c71ce2398498bdaaa45807").execute();
                    JsonRootBean jsonRootBean = response.body();
                   shaw(jsonRootBean);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    private void shaw(JsonRootBean jsonRootBean) {
        Log.i("1",jsonRootBean.getResult().get(1).getShare_url());

    }

    @Override
    public void onClick(View v) {
        videoView.setVideoURI(Uri.parse("http://vjs.zencdn.net/v/oceans.mp4"));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this,"播放完成了",Toast.LENGTH_SHORT).show();
            }
        });

        videoView.start();

    }
}
