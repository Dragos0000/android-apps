package com.example.android.snookerpointkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int pointsPlayerOne = 0;
    int pointsPlayerTwo = 0;
    int framesPlayerOne = 0;
    int framesPlayerTwo = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * buttons methods for Player One.
     */
    public void addOnePoint(View view) {
        pointsPlayerOne = pointsPlayerOne + 1;
        displayForPlayerOne(pointsPlayerOne);
    }

    public void addTwoPoints(View view) {
        pointsPlayerOne = pointsPlayerOne + 2;
        displayForPlayerOne(pointsPlayerOne);
    }

    public void addThreePoints(View view) {
        pointsPlayerOne = pointsPlayerOne + 3;
        displayForPlayerOne(pointsPlayerOne);
    }

    public void addFourPoints(View view) {
        pointsPlayerOne = pointsPlayerOne + 4;
        displayForPlayerOne(pointsPlayerOne);
    }

    public void addFivePoints(View view) {
        pointsPlayerOne = pointsPlayerOne + 5;
        displayForPlayerOne(pointsPlayerOne);
    }

    public void addSixPoints(View view) {
        pointsPlayerOne = pointsPlayerOne + 6;
        displayForPlayerOne(pointsPlayerOne);
    }

    public void addSevenPoints(View view) {
        pointsPlayerOne = pointsPlayerOne + 7;
        displayForPlayerOne(pointsPlayerOne);
    }

    /**
     * buttons methods for Player Two.
     */
    public void addOnePointPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 1;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    public void addTwoPointsPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 2;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    public void addThreePointsPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 3;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    public void addFourPointsPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 4;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    public void addFivePointsPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 5;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    public void addSixPointsPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 6;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    public void addSevenPointsPlayerTwo(View view) {
        pointsPlayerTwo = pointsPlayerTwo + 7;
        displayForPlayerTwo(pointsPlayerTwo);
    }

    /**
     * Reset buttons methods .
     */
    public void resetPoints(View view) {
        pointsPlayerOne = 0;
        pointsPlayerTwo = 0;
        displayForPlayerOne(0);
        displayForPlayerTwo(0);
    }

    public void resetFrames(View view) {
        framesPlayerOne = 0;
        framesPlayerTwo = 0;
        displayFramesPlayerOne(0);
        displayFramesPlayerTwo(0);
    }

    public void resetAll(View view) {
        pointsPlayerOne = 0;
        pointsPlayerTwo = 0;
        framesPlayerOne = 0;
        framesPlayerTwo = 0;
        displayFramesPlayerOne(0);
        displayFramesPlayerTwo(0);
        displayForPlayerOne(0);
        displayForPlayerTwo(0);
    }

    /**
     * Calculate method for frames based on the points won by each player.
     */
    public void calculateFrames(View view) {
        if (pointsPlayerOne > pointsPlayerTwo) {
            framesPlayerOne = framesPlayerOne + 1;
            displayFramesPlayerOne(framesPlayerOne);
        } else if (pointsPlayerOne < pointsPlayerTwo) {
            framesPlayerTwo = framesPlayerTwo + 1;
            displayFramesPlayerTwo(framesPlayerTwo);
        } else {
            Toast.makeText(this, "you cannot have equal points at the end of the round....you did something wrong.Please reset and try again", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Displays total frames won for Player One.
     */

    public void displayFramesPlayerOne(int frames) {
        TextView framesView = (TextView) findViewById(R.id.player_one_frames);
        framesView.setText(String.valueOf(frames));
    }

    /**
     * Displays total frames won for Player Two.
     */
    public void displayFramesPlayerTwo(int frames) {
        TextView framesView = (TextView) findViewById(R.id.player_two_frames);
        framesView.setText(String.valueOf(frames));
    }

    /**
     * Displays the given points for Player One.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given points for Player Two.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_points);
        scoreView.setText(String.valueOf(score));
    }

}
