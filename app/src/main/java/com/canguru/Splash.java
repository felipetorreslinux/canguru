package com.canguru;

import android.app.Activity;
import android.content.Context;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class Splash extends Activity {

    ImageView imageview_logo_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_splash);

        imageview_logo_splash = (ImageView) findViewById(R.id.imageview_logo_splash);
        animation_logo(imageview_logo_splash);

    }

    public void animation_logo(ImageView imageView){
        ScaleAnimation animation = new ScaleAnimation(0,1,0,1);
        animation.setDuration(350);
        animation.setFillAfter(true);
        animation.setFillEnabled(true);
        imageView.setAnimation(animation);
        animation.start();
    }

}
