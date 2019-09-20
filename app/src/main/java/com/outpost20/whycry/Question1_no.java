package com.outpost20.whycry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Question1_no extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.question1_no);

        //Animations
        //Pop open intro
        Animation pop_open = AnimationUtils.loadAnimation(this, R.anim.pop_open);
        pop_open.reset();

        TextView intro = findViewById(R.id.intro);
        intro.clearAnimation();
        intro.startAnimation(pop_open);

        //ImageView exclamationpoint = findViewById(R.id.exclamationpoint);
        //exclamationpoint.clearAnimation();
        //exclamationpoint.startAnimation(pop_open);

        //Pop open tip
        Animation pop_open2 = AnimationUtils.loadAnimation(this, R.anim.pop_open2);
        pop_open2.reset();

        TextView tip_header = findViewById(R.id.tip_header);
        tip_header.clearAnimation();
        tip_header.startAnimation(pop_open2);

        TextView tipbox = findViewById(R.id.tipbox);
        tipbox.clearAnimation();
        tipbox.startAnimation(pop_open2);

        ImageView hr = findViewById(R.id.hr);
        hr.clearAnimation();
        hr.startAnimation(pop_open2);

        ImageView tip_star = findViewById(R.id.tip_star);
        tip_star.clearAnimation();
        tip_star.startAnimation(pop_open2);

        TextView tip = findViewById(R.id.tip);
        tip.clearAnimation();
        tip.startAnimation(pop_open2);

        //Triangle_Yes - animate into frame
        Animation triangle_yes2 = AnimationUtils.loadAnimation(this, R.anim.triangle_yes2);
        triangle_yes2.reset();

        Button yes = findViewById(R.id.yes);
        yes.clearAnimation();
        yes.startAnimation(triangle_yes2);

        //Triangle_Yes_Text - animate into frame
        Animation triangle_yes_text2 = AnimationUtils.loadAnimation(this, R.anim.triangle_yes_text2);
        triangle_yes2.reset();

        TextView yes_text = findViewById(R.id.yes_text);
        yes_text.clearAnimation();
        yes_text.startAnimation(triangle_yes_text2);

        //Triangle_No - animate into frame
        Animation triangle_no2 = AnimationUtils.loadAnimation(this, R.anim.triangle_no2);
        triangle_no2.reset();

        Button no = findViewById(R.id.no);
        no.clearAnimation();
        no.startAnimation(triangle_no2);

        //Triangle_No_Text - animate into frame
        Animation triangle_no_text2 = AnimationUtils.loadAnimation(this, R.anim.triangle_no_text2);
        triangle_no_text2.reset();

        TextView no_text  = findViewById(R.id.no_text);
        no_text.clearAnimation();
        no_text.startAnimation(triangle_no_text2);
    }

    public void yes(View view) {
        //New Activity
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void no(View view) {
        //New Activity
        Intent intent = new Intent(this, Select.class);
        startActivity(intent);
    }

}

