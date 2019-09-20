package com.outpost20.whycry;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Handler;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //Animations
        Animation fade_in = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        fade_in.reset();

        ImageView background_image = findViewById(R.id.background_image);
        background_image.clearAnimation();
        background_image.startAnimation(fade_in);

        ImageView stars = findViewById(R.id.stars);
        stars.clearAnimation();
        stars.startAnimation(fade_in);

        ImageView branding = findViewById(R.id.branding);
        branding.clearAnimation();
        branding.startAnimation(fade_in);

        TextView tagline = findViewById(R.id.tagline);
        tagline.clearAnimation();
        tagline.startAnimation(fade_in);

        //Triangle_Start - animate into frame
        Animation triangle_yes2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.triangle_yes2);
        triangle_yes2.reset();

        Button start = findViewById(R.id.start);
        start.clearAnimation();
        start.startAnimation(triangle_yes2);

        //Triangle_Yes_Text - animate into frame
        Animation triangle_yes_text2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.triangle_yes_text2);
        triangle_yes2.reset();

        TextView start_text = findViewById(R.id.start_text);
        start_text.clearAnimation();
        start_text.startAnimation(triangle_yes_text2);

        //Triangle_Select - animate into frame
        Animation triangle_no2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.triangle_no2);
        triangle_no2.reset();

        Button select = findViewById(R.id.select);
        select.clearAnimation();
        select.startAnimation(triangle_no2);

        //Triangle_Select_Text - animate into frame
        Animation triangle_no_text2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.triangle_no_text2);
        triangle_no_text2.reset();

        TextView select_text  = findViewById(R.id.select_text);
        select_text.clearAnimation();
        select_text.startAnimation(triangle_no_text2);
    }


    public void start(View view) {

        //New Activity
        Intent intent = new Intent(this, Question1.class);
        startActivity(intent);

    }

    public void select(View view) {

        //New Activity
        Intent intent = new Intent(this, Select.class);
        startActivity(intent);

    }




}
