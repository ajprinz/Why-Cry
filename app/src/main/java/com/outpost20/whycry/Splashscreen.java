package com.outpost20.whycry;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.splashscreen);

        //Animations
        Animation fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_in.reset();

        ImageView op20 = findViewById(R.id.op20);
        op20.clearAnimation();
        op20.startAnimation(fade_in);

        //Go to main activity
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, 3000);


    }
}
