package com.canguru;

import android.app.Activity;
import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash extends Activity {

    ImageView imageview_logo_splash;
    ProgressBar progress_bar_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_splash);

        imageview_logo_splash = (ImageView) findViewById(R.id.imageview_logo_splash);
        progress_bar_splash = (ProgressBar) findViewById(R.id.progress_bar_splash);
        animation_progress_bar(progress_bar_splash);

    }

    private void animation_progress_bar (ProgressBar progressBar){
        TranslateAnimation animation = new TranslateAnimation(0,0,500,0);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        animation.setFillEnabled(true);
        progressBar.setAnimation(animation);
        animation.start();
    }

}
