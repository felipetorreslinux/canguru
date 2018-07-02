package com.canguru.Views;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import com.canguru.R;

public class View_Login extends Activity {

    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_login);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        videoview = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_intro);
        videoview.setVideoURI(uri);
        videoview.start();

    }

}
