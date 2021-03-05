package com.example.dice;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private ImageView imageViewDice2;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice2 = findViewById(R.id.image_view_dice2);

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
        int randomNumber2 = rng.nextInt(6) + 1;
        TextView textView = (TextView) findViewById(R.id.diceText);
        TextView textView2 = (TextView) findViewById(R.id.diceText2);
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
        switch (randomNumber2) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                textView2.setText("And A One");
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                textView2.setText("And A Two");
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                textView2.setText("And A Three");
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                textView2.setText("And A Four");
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                textView2.setText("And A Five");
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                textView2.setText("And A Six");
                break;
        }
    }
}
