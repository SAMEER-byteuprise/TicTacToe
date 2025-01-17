package com.example.tictactoy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);




        final EditText playerOne = findViewById(R.id.playerOne);
        final EditText playerTwo = findViewById(R.id.playerTwo);
        final Button startGameBtn = findViewById(R.id.startbtn);


        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final  String getPlayerOneName = playerOne.getText().toString();
                final String getPlayerTwoName = playerTwo.getText().toString();

                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                    Toast.makeText(AddPlayers.this,"Please Enter Player Name",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("playerOne",getPlayerOneName);
                    intent.putExtra("playerTwo",getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });



    }
}