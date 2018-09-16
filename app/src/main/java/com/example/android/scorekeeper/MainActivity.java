package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int unitedGoal = 0;
    int unitedFoul = 0;
    int unitedCard = 0;
    int madridGoal = 0;
    int madridFoul = 0;
    int madridCard = 0;


    /**
     * Displays the goal for man utd.
     */

    public void displayGoalForManUtd(int score) {
        TextView scoreView =  findViewById(R.id.united_goal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the foul for man utd.
     */

    public void displayFoulForManUtd(int score) {
        TextView scoreView = findViewById(R.id.united_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the card for man utd.
     */

    public void displayCardForManUtd(int score) {
        TextView scoreView = findViewById(R.id.united_card);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the goal for madrid.
     */

    public void displayGoalForMadrid(int score) {
        TextView scoreView = findViewById(R.id.madrid_goal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the foul for madrid.
     */

    public void displayFoulForMadrid(int score) {
        TextView scoreView = findViewById(R.id.madrid_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the card for madrid.
     */

    public void displayCardForMadrid(int score) {
        TextView scoreView = findViewById(R.id.madrid_card);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalForManUtd(0);
        displayFoulForManUtd(0);
        displayCardForManUtd(0);
        displayGoalForMadrid(0);
        displayFoulForMadrid(0);
        displayCardForMadrid(0);
    }


    /*this method is called when the united goal button is clicked*/
    public void unitedGoalButton(View view) {
        unitedGoal = unitedGoal + 1;
        displayGoalForManUtd(unitedGoal);

    }


    /*this method is called when the united foul button is clicked*/
    public void unitedFoulButton(View view) {
        unitedFoul = unitedFoul + 1;
        displayFoulForManUtd(unitedFoul);

    }


    /*this method is called when the united card button is clicked*/
    public void unitedCardButton(View view) {
        unitedCard = unitedCard + 1;
        displayCardForManUtd(unitedCard);

    }


    /*this method is called when the madrid goal button is clicked*/
    public void madridGoalButton(View view) {
        madridGoal = madridGoal + 1;
        displayGoalForMadrid(madridGoal);

    }


    /*this method is called when the madrid foul button is clicked*/
    public void madridFoulButton(View view) {
        madridFoul = madridFoul + 1;
        displayFoulForMadrid(madridFoul);

    }


    /*this method is called when the madrid card button is clicked*/
    public void madridCardButton(View view) {
        madridCard = madridCard + 1;
        displayCardForMadrid(madridCard);

    }


    /* resets all scores  to 0*/
    public void resetScore(View view) {
        unitedGoal = 0;
        unitedFoul = 0;
        unitedCard = 0;
        madridGoal = 0;
        madridFoul = 0;
        madridCard = 0;

        displayGoalForManUtd(unitedGoal);
        displayFoulForManUtd(unitedFoul);
        displayCardForManUtd(unitedCard);
        displayGoalForMadrid(madridGoal);
        displayFoulForMadrid(madridFoul);
        displayCardForMadrid(madridCard);
    }
}

