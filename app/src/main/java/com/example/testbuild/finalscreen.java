package com.example.testbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class finalscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscreen);

        TextView dddsf = findViewById(R.id.textView5);
        TextView ddd = findViewById(R.id.textView11);
        ImageView botao = findViewById(R.id.imageView3);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent intent = new Intent(finalscreen.this, SecondScreen.class);
               startActivity(intent);

            }
        });



        SharedPreferences prefs = getSharedPreferences("meu_arquivo", MODE_PRIVATE);
        int numero = prefs.getInt("chave_numero", 0);
        dddsf.setText(String.valueOf(numero) + " / 15");


        SharedPreferences prefs2 = getSharedPreferences("arquivo_ultimo_jogo", MODE_PRIVATE);
        int ultimojogo = prefs2.getInt("chave_numero", 0);

        if(ultimojogo > numero){


            ddd.setText(String.valueOf(ultimojogo) + " / 15");

        }
        else{

            ultimojogo = numero;

            SharedPreferences.Editor editor2 = prefs2.edit();
            editor2.putInt("chave_numero", ultimojogo);
            editor2.apply();
            ddd.setText(String.valueOf(numero)+ " / 15");


        }




    }
}

//  DEUS SEJA LOUVADO!!