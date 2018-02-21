package com.rodgwizz.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Methods for Team A
    public void addthree(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void addtwo(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addone(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    //Methods for Team B
    public void addthreeB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void addtwoB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addoneB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    //Displays Scores for Team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
