package com.example.testbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;




public class haleto_de_acido_12 extends AppCompatActivity {

    private int seconds = 3;
    private int porta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haleto_de_acido12);



        Handler handler = new Handler();
        //Intent intent = new Intent(Cetona_2.this, Cetona_2.class);

        ImageView errado1 = findViewById(R.id.imageView16);

        ImageView errado2 = findViewById(R.id.errado2);


        ImageView certo = findViewById(R.id.certo);


        ImageView formula = findViewById(R.id.imageView12);


        ImageView alternativaA = findViewById(R.id.imageView15);


        ImageView alternativaB = findViewById(R.id.imageView14);



        ImageView alternativaC = findViewById(R.id.imageView13);



        TextView cont = findViewById(R.id.textView4);

        errado1.setTranslationZ(1);
        certo.setTranslationZ(1);
        errado2.setTranslationZ(1);

        cont.setVisibility(View.INVISIBLE);
        certo.setVisibility(View.INVISIBLE);
        errado2.setVisibility(View.INVISIBLE);
        errado1.setVisibility(View.INVISIBLE);




        alternativaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                certo.setVisibility(View.VISIBLE);
                errado2.setVisibility(View.VISIBLE);
                errado1.setVisibility(View.VISIBLE);
                porta = 1;
                cont.setVisibility(View.VISIBLE);
                iniciarContador();






            }
        });

        alternativaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                certo.setVisibility(View.VISIBLE);
                errado2.setVisibility(View.VISIBLE);
                errado1.setVisibility(View.VISIBLE);
                porta = 1;
                cont.setVisibility(View.VISIBLE);
                iniciarContador();


            }
        });

        alternativaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                certo.setVisibility(View.VISIBLE);
                errado2.setVisibility(View.VISIBLE);
                errado1.setVisibility(View.VISIBLE);
                porta = 1;
                cont.setVisibility(View.VISIBLE);
                iniciarContador();

                //ADICIONAR VALOR A VARIAVEL GLOBAL DE ACERTOS


                //pega do arquivo "meu_arquivo" o valor que la esta contido, apos isso joga tudo na variavel numero
                SharedPreferences prefs = getSharedPreferences("meu_arquivo", MODE_PRIVATE);
                int numero = prefs.getInt("chave_numero", 0);

                numero = numero + 1;

                //adiciona o novo valor de volta no arquivo
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("chave_numero", numero);
                editor.apply();



            }
        });





    }


    private void iniciarContador() {
        Handler handler = new Handler();
       Intent intent = new Intent(haleto_de_acido_12.this, alcool_13.class);
        TextView cont = findViewById(R.id.textView4);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                atualizaContador(cont, seconds); // passa a referência à variável seconds
                seconds--; // subtrai 1 de seconds
                if (seconds > 0) { // Verifica se ainda não chegou a zero
                    handler.postDelayed(this, 1000); // o comando this "agenda" a próxima execução do void runnable, sendo essa executada após o delay de 1 segundo
                } else {
                    // Inicia a próxima atividade quando o contador chegar a zero
                   startActivity(intent);
                }
            }
        };

        // Inicia o contador
        handler.postDelayed(runnable, 1);
    }


    public void atualizaContador(TextView excont, int sec) {
        //adiciona o valorde sec a excont (textview) para exibição na tela
        excont.setText(String.valueOf(sec));
    }

}

