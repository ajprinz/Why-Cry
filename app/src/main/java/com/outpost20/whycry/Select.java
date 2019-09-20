package com.outpost20.whycry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);

        //Animations
        //Pop open intro
        Animation pop_open = AnimationUtils.loadAnimation(this, R.anim.pop_open);
        pop_open.reset();

        TextView intro = findViewById(R.id.intro);
        intro.clearAnimation();
        intro.startAnimation(pop_open);

        //Pop open question
        Animation pop_open2 = AnimationUtils.loadAnimation(this, R.anim.pop_open2);
        pop_open2.reset();

        TextView question1 = findViewById(R.id.question1);
        question1.clearAnimation();
        question1.startAnimation(pop_open2);

        TextView question2 = findViewById(R.id.question2);
        question2.clearAnimation();
        question2.startAnimation(pop_open2);

        TextView question3 = findViewById(R.id.question3);
        question3.clearAnimation();
        question3.startAnimation(pop_open2);

        TextView question4 = findViewById(R.id.question4);
        question4.clearAnimation();
        question4.startAnimation(pop_open2);

        TextView question5 = findViewById(R.id.question5);
        question5.clearAnimation();
        question5.startAnimation(pop_open2);

        TextView question6 = findViewById(R.id.question6);
        question6.clearAnimation();
        question6.startAnimation(pop_open2);

        TextView question7 = findViewById(R.id.question7);
        question7.clearAnimation();
        question7.startAnimation(pop_open2);

        TextView question8 = findViewById(R.id.question8);
        question8.clearAnimation();
        question8.startAnimation(pop_open2);

        TextView question9 = findViewById(R.id.question9);
        question9.clearAnimation();
        question9.startAnimation(pop_open2);
    }

    public void question1(View view) {
        Intent intent = new Intent(this, Question1.class);
        startActivity(intent);
    }

    public void question2(View view) {
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }

    public void question3(View view) {
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }

    public void question4(View view) {
        Intent intent = new Intent(this, Question4.class);
        startActivity(intent);
    }

    public void question5(View view) {
        Intent intent = new Intent(this, Question5.class);
        startActivity(intent);
    }

    public void question6(View view) {
        Intent intent = new Intent(this, Question6.class);
        startActivity(intent);
    }

    public void question8(View view) {
        Intent intent = new Intent(this, Question8.class);
        startActivity(intent);
    }

    public void question9(View view) {
        Intent intent = new Intent(this, Question9.class);
        startActivity(intent);
    }

    public void question11(View view) {
        Intent intent = new Intent(this, Question11.class);
        startActivity(intent);
    }


}
