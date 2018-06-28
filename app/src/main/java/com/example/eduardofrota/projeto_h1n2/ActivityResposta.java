package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityResposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);
        getSupportActionBar().hide();

        ImageView imgResposta = (ImageView) findViewById(R.id.imgResposta);
        TextView resposta = (TextView) findViewById(R.id.resposta);
        Button btnJogarNovamente = (Button) findViewById(R.id.btnJogarNovamente);

        Intent intent = getIntent();
        int pontos = intent.getIntExtra("pontos", 0);

        if (intent.hasExtra("acertou")) {
            btnJogarNovamente.setVisibility(View.INVISIBLE);
            boolean acertou = intent.getBooleanExtra("acertou", false);
            if (acertou) {
                imgResposta.setImageResource(R.drawable.acertou);
                resposta.setText("Acertou!");
            } else {
                imgResposta.setImageResource(R.drawable.errou);
                resposta.setText("Errou!");
            }

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finish();
                }
            });
            thread.start();
        } else {
            btnJogarNovamente.setVisibility(View.VISIBLE);
            resposta.setText("Fez " + pontos + " pontos");

            if (pontos >= 3)
                imgResposta.setImageResource(R.drawable.happy);
            else
                imgResposta.setImageResource(R.drawable.sad);
        }
    }

    public void btnJogarNovamenteOnClick(View v){
        Intent intent = new Intent(this, ActivityQuiz.class);
        startActivity(intent);
        finish();


    }
}
