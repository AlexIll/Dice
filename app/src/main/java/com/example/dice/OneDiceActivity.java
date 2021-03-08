package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class OneDiceActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_dice);

        imageViewDice = findViewById(R.id.image_view_dice);

        Button button = (Button) findViewById(R.id.buttonRoll);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        TextView textView = (TextView) findViewById(R.id.diceText);
        TextView textView2 = (TextView) findViewById(R.id.diceText2);
        textView2.setVisibility(View.INVISIBLE);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textView.setText("You Rolled a One");
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textView.setText("You Rolled a Two");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textView.setText("You Rolled a Three");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textView.setText("You Rolled a Four");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textView.setText("You Rolled a Five");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textView.setText("You Rolled a Six");
                break;
        }

    }
}