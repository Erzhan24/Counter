package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int score;
    String count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            count = savedInstanceState.getString("time");
            score = savedInstanceState.getInt("count");
            display(score);

    }}
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("time", count);
        outState.putInt("count", score);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void plus(View view) {

        score=score+1;
        display(score);
    }


    /**
     * Displays the given score for Team A.
     */
    public void display(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        count=String.format(Locale.getDefault(),"%04d",score);
        scoreView.setText(count);

    }

}