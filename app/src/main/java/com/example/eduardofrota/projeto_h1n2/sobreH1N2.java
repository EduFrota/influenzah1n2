package com.example.eduardofrota.projeto_h1n2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sobreH1N2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_h1_n2);

        ImageButton conceito = (ImageButton) findViewById(R.id.conceito);
        ImageButton dados = (ImageButton) findViewById(R.id.dados);
        ImageButton carac = (ImageButton) findViewById(R.id.c_clicnicas);
        ImageButton risco = (ImageButton) findViewById(R.id.g_risco);


        conceito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sobreH1N2.this, ActivityConceito.class);
                startActivity(i);
            }
        });
        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sobreH1N2.this, ActivityDados.class);
                startActivity(i);
            }
        });
        carac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sobreH1N2.this, ActivityCaracteristicas.class);
                startActivity(i);
            }
        });
        risco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sobreH1N2.this, ActivityRisco.class);
                startActivity(i);
            }
        });


    }
}
