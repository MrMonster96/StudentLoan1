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
                .setBackgroundColor(Color.parseColor("#598AC6")) // int background color
                .setDrawable(R.drawable.onb1) // int top drawable
                .setSummary("Earn Daily using Refer your Friend")
                .build());
        // 2ND SLIDE
        addFragment(new Step.Builder().setTitle("Rules And ")
                .setContent(s2)
                .setBackgroundColor(Color.parseColor("#598AC6")) // int background color
                .setDrawable(R.drawable.ic_launcher_background) // int top drawable
                .setSummary("Only for Entertainment and help for society ")
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
