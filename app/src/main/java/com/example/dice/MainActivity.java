package com.example.dice;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
        TextView textView = (TextView) findViewById(R.id.diceText);
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textView.setText("You Rolled One");
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textView.setText("You Rolled Two");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textView.setText("You Rolled Three");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textView.setText("You Rolled Four");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textView.setText("You Rolled Five");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textView.setText("You Rolled Six");
                break;
        }
    }
}
