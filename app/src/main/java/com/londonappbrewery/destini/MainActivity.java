package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mQuestionTextView;
    private Button mAnswer1;
    private Button mAnswer2;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mQuestionTextView = (TextView) findViewById(R.id.storyTextView);
        mAnswer1 = (Button) findViewById(R.id.buttonTop);
        mAnswer2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini ", "answer is presssed");
                if(mStoryIndex==1) {
                    mQuestionTextView.setText(R.string.T3_Story);
                    mAnswer1.setText(R.string.T3_Ans1);
                    mAnswer2.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
                else if(mStoryIndex==3){
                    mQuestionTextView.setText(R.string.T6_End);
                    mAnswer1.setVisibility(View.GONE);
                    mAnswer2.setVisibility(View.GONE);

                }
                else if(mStoryIndex==2){
                    mQuestionTextView.setText(R.string.T3_Story);
                    mAnswer1.setText(R.string.T3_Ans1);
                    mAnswer2.setText(R.string.T3_Ans2);
                    mStoryIndex=4;
                }
                else if(mStoryIndex==4){
                    mQuestionTextView.setText(R.string.T6_End);
                    mAnswer2.setVisibility(View.GONE);
                    mAnswer1.setVisibility(View.GONE);
                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destinity", "answer 2 is pressed");
                if (mStoryIndex == 1) {
                    mQuestionTextView.setText(R.string.T2_Story);
                    mAnswer1.setText(R.string.T2_Ans1);
                    mAnswer2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mQuestionTextView.setText(R.string.T4_End);
                   mAnswer2.setVisibility(View.GONE);
                   mAnswer1.setVisibility(View.GONE);
                }
                else if(mStoryIndex==3){
                    mQuestionTextView.setText(R.string.T5_End);
                    mAnswer2.setVisibility(View.GONE);
                    mAnswer1.setVisibility(View.GONE);
                    }
                    else if(mStoryIndex==4){
                    mQuestionTextView.setText(R.string.T5_End);
                    mAnswer1.setVisibility(View.GONE);
                    mAnswer2.setVisibility(View.GONE);
                }
            }
        });
    }

}