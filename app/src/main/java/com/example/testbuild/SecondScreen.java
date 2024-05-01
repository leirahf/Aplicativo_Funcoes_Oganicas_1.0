package com.example.testbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.Random;

public class SecondScreen extends AppCompatActivity {

    private int seconds = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);


        int valor_tio = 0;

        SharedPreferences prefs = getSharedPreferences("tioalcool_global", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("chave_numero", valor_tio);
        editor.apply();

        int valor_cetona = 0;

        SharedPreferences prefs2 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor2 = prefs2.edit();
        editor2.putInt("chave_numero", valor_cetona);
        editor2.apply();

        int valor_haletoorganico = 0;

        SharedPreferences prefs3 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor3 = prefs3.edit();
        editor3.putInt("chave_numero", valor_cetona);
        editor3.apply();

        int valor_eter = 0;

        SharedPreferences prefs4 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor4 = prefs4.edit();
        editor4.putInt("chave_numero", valor_eter);
        editor4.apply();

        int valor_aldeido = 0;

        SharedPreferences prefs5 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor5 = prefs5.edit();
        editor5.putInt("chave_numero", valor_aldeido);
        editor5.apply();

        int valor_amina = 0;

        SharedPreferences prefs6 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor6 = prefs6.edit();
        editor6.putInt("chave_numero", valor_amina);
        editor6.apply();

        int valor_amida = 0;

        SharedPreferences prefs7 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor7 = prefs7.edit();
        editor7.putInt("chave_numero", valor_amida);
        editor7.apply();

        int valor_organometalico = 0;

        SharedPreferences prefs8 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor8 = prefs8.edit();
        editor8.putInt("chave_numero", valor_organometalico);
        editor8.apply();

        int valor_nitrocomposto = 0;

        SharedPreferences prefs9 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor9 = prefs9.edit();
        editor9.putInt("chave_numero", valor_nitrocomposto);
        editor9.apply();

        int valor_ester = 0;

        SharedPreferences prefs10 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor10 = prefs10.edit();
        editor10.putInt("chave_numero", valor_ester);
        editor10.apply();

        int valor_nitrila = 0;

        SharedPreferences prefs11 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor11 = prefs11.edit();
        editor11.putInt("chave_numero", valor_nitrila);
        editor11.apply();

        int valor_haletodeacido = 0;

        SharedPreferences prefs12 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor12 = prefs12.edit();
        editor12.putInt("chave_numero", valor_haletodeacido);
        editor12.apply();

        int valor_alcool = 0;

        SharedPreferences prefs13 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor13 = prefs13.edit();
        editor13.putInt("chave_numero", valor_alcool);
        editor13.apply();

        int valor_acidosulfonico = 0;

        SharedPreferences prefs14 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor14 = prefs14.edit();
        editor14.putInt("chave_numero", valor_acidosulfonico);
        editor14.apply();

        int valor_acidocarboxilico = 0;

        SharedPreferences prefs15 = getSharedPreferences("cetona_global", MODE_PRIVATE);
        SharedPreferences.Editor editor15 = prefs15.edit();
        editor15.putInt("chave_numero", valor_acidocarboxilico);
        editor15.apply();




        Intent intent = new Intent(SecondScreen.this, Tioalcool.class);
        TextView cont = findViewById(R.id.textViewContador);
        Handler handler = new Handler();


        Runnable runnable = new Runnable() {
                    @Override
                    public void run() {

                        atualizaContador(cont, seconds); // passa a referência à variável seconds
                        seconds--; // subtrai 1 de seconds
                        if (seconds > 0) { // Verifica se ainda não chegou a zero
                            handler.postDelayed(this, 1000); // o comando this "agenda" a proxima execução do void runnable, sendo essa executada apos o delay de 1 segundo
                        }
                        else{

                         // aleatoriedade(valor_tio, valor_cetona, valor_haletoorganico, valor_eter, valor_aldeido, valor_amina, valor_amida, valor_organometalico, valor_nitrocomposto, valor_ester, valor_nitrila, valor_haletodeacido, valor_alcool, valor_acidosulfonico, valor_acidocarboxilico);
                            startActivity(intent);
                        }
                    }
                };

            handler.postDelayed(runnable, 1); // executa pela primeira vez o runnable que rodara em loop por 4 segundos




    }

    public void atualizaContador(TextView excont, int sec) {
        //adiciona o valorde sec a excont (textview) para exibição na tela
        excont.setText(String.valueOf(sec));
    }

/*
    public void aleatoriedade(int vtio, int vcet, int vhalor, int veter, int valdeido, int vamina, int vamida, int vorganomet, int vnitrocomp, int vester, int vnitrila, int vhaletoacido, int valcool, int vacidsulfo, int vacidocarbox){
        Random random = new Random();
        int numrandon = random.nextInt(15) + 1;



        if(numrandon == 1 && vtio == 0){
            Intent intent = new Intent(SecondScreen.this, Tioalcool.class);
            startActivity(intent);
        }

        else if(numrandon == 2 && vcet == 0){
            Intent intent = new Intent(SecondScreen.this, Cetona_2.class);
            startActivity(intent);
        }

        else if(numrandon == 3 && vhalor == 0){
            Intent intent = new Intent(SecondScreen.this, Haleto_Organico_3.class);
            startActivity(intent);
        }

        else if(numrandon == 4 && veter == 0){
            Intent intent = new Intent(SecondScreen.this, eter_4.class);
            startActivity(intent);
        }

        else if(numrandon == 5 && valdeido == 0){
            Intent intent = new Intent(SecondScreen.this, aldeido_5.class);
            startActivity(intent);
        }

        else if(numrandon == 6 && vamina == 0){
            Intent intent = new Intent(SecondScreen.this, amina_6.class);
            startActivity(intent);
        }

        else if(numrandon == 7 && vamida == 0){
            Intent intent = new Intent(SecondScreen.this, amida_7.class);
            startActivity(intent);
        }

        else if(numrandon == 8 && vorganomet == 0){
            Intent intent = new Intent(SecondScreen.this, organometalico_8.class);
            startActivity(intent);
        }

        else if(numrandon == 9 && vnitrocomp == 0){
            Intent intent = new Intent(SecondScreen.this, nitrocomposto_9.class);
            startActivity(intent);
        }

        else if(numrandon == 10 && vester == 0){
            Intent intent = new Intent(SecondScreen.this, ester_10.class);
            startActivity(intent);
        }

        else if(numrandon == 11 && vnitrila == 0){
            Intent intent = new Intent(SecondScreen.this, nitrila_11.class);
            startActivity(intent);
        }

        else if(numrandon == 12 && vhaletoacido == 0){
            Intent intent = new Intent(SecondScreen.this, haleto_de_acido_12.class);
            startActivity(intent);
        }

        else if(numrandon == 13 && valcool == 0){
            Intent intent = new Intent(SecondScreen.this, alcool_13.class);
            startActivity(intent);
        }

        else if(numrandon == 14 && vacidsulfo == 0){
            Intent intent = new Intent(SecondScreen.this, acido_sulfonico_14.class);
            startActivity(intent);
        }

        else if(numrandon == 14 && vacidocarbox == 0){
            Intent intent = new Intent(SecondScreen.this, acido_carboxilico_15.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(SecondScreen.this, finalscreen.class);
            startActivity(intent);

        }









    }
*/
}
