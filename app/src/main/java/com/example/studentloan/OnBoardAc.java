package com.example.studentloan;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardAc extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String s1 = getString(R.string.s1);
        String s2 = getString(R.string.app_name);

        //ONE SLIDE
        addFragment(new Step.Builder().setTitle("How To Take Instant Loan")
                .setContent(s1)
                .setBackgroundColor(Color.parseColor("#00FFAB00")) // int background color
                .setDrawable(R.drawable.time) // int top drawable
                .setSummary("Cash Out, Come Here")
                .build());
        // 2ND SLIDE
        addFragment(new Step.Builder().setTitle("Rules And Regulation ")
                .setContent(s2)
                .setBackgroundColor(Color.parseColor("#00FFAB00")) // int background color
                .setDrawable(R.drawable.img) // int top drawable
                .setSummary("Only for Entertainment and help for society ")
                .build());
        // 3RD SLIDE
        addFragment(new Step.Builder().setTitle("Reward ")
                .setContent(s2)
                .setBackgroundColor(Color.parseColor("#00FFAB00")) // int background color
                .setDrawable(R.drawable.rreward) // int top drawable
                .setSummary("Earn rewards by connecting with friends ")
                .build());








    }

    @Override
    public void currentFragmentPosition(int position) {

    }
    @Override
    public void finishTutorial() {
        // Your implementation
        startActivity(new Intent(OnBoardAc.this,HomeActivity.class));
        finish();
    }
}
