package com.example.testbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int atalhoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ImageView play = findViewById(R.id.playbutton);
      ImageView atalho = findViewById(R.id.imageView);


        atalho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                atalhoint++;

                if(atalhoint == 3) {

                    Intent intent = new Intent(MainActivity.this, finalscreen.class);
                    startActivity(intent);

                }

            }
        });



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Intent intent = new Intent(MainActivity.this,SecondScreen.class);
              startActivity(intent);

            }
        });



    }




}