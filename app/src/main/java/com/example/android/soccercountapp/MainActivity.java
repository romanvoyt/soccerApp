package com.example.android.soccercountapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team1Goals = 0;
    int team2Goals = 0;

    int team1Reds = 0;
    int team1Yellows = 0;

    int team2Reds = 0;
    int team2Yellows = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goal1(View view){
        team1Goals++;
        displayScores1(team1Goals);
    }

    public void displayScores1(int num){
        TextView score = (TextView)findViewById(R.id.team1Scores);
        score.setText(String.valueOf(num));
    }

    public void incrReds1(View view){
        if(team1Reds < 11){
            team1Reds++;
        }
        displayRedCards1(team1Reds);

    }

    public void displayRedCards1(int num){
        TextView card = (TextView)findViewById(R.id.team1Reds);
        card.setText(String.valueOf(num));
    }

    public void incrYellows1(View view){
        if(team1Yellows < 22){
            team1Yellows++;
        }
        displayYellowCards1(team1Yellows);

    }

    public void displayYellowCards1(int num){
        TextView y = (TextView)findViewById(R.id.team1Yellows);
        y.setText(String.valueOf(num));
    }



    /*************************TEAM2****************************/

    public void goal2(View view){
        team2Goals++;
        displayScores2(team2Goals);
    }

    public void displayScores2(int num){
        TextView score = (TextView)findViewById(R.id.team2Scores);
        score.setText(String.valueOf(num));
    }

    public void incrReds2(View view){
        if(team2Reds < 11){
            team2Reds++;
        }
        displayRedCards2(team2Reds);

    }

    public void displayRedCards2(int num){
        TextView r = (TextView)findViewById(R.id.team2Reds);
        r.setText(String.valueOf(num));
    }

    public void incrYellows2(View view){
        if(team2Yellows < 22){
            team2Yellows++;
        }
        displayYellowCards2(team2Yellows);

    }

    public void displayYellowCards2(int num){
        TextView y = (TextView)findViewById(R.id.team2Yellows);
        y.setText(String.valueOf(num));
    }

    /****************************************************************/

    public void winner(View view){
        String win = "The winner is ";
        if(team1Goals>team2Goals){
            win = win + "Team1";
        }else if(team1Goals==team2Goals){
            win = "Friendship wins!";
        }
        else{
            win = win + "Team2";
        }
        displayWinner(win);

    }

    public void displayWinner(String name){
        TextView str = (TextView)findViewById(R.id.announcement);
        str.setText(name);
    }




    public void reset(View view){
        team1Goals = 0;
        team2Goals = 0;

        team1Reds = 0;
        team1Yellows = 0;

        team2Reds = 0;
        team2Yellows = 0;

        displayWinner("");

        displayRedCards1(team1Reds);
        displayYellowCards1(team1Yellows);
        displayRedCards2(team2Reds);
        displayYellowCards2(team2Yellows);
        displayScores2(team2Goals);
        displayScores1(team1Goals);
    }


}
