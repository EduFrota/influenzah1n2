package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityConceito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceito);


        WebView view = (WebView) findViewById(R.id.content_conceito);
        String text;
        text = "<html>" +
                "<body>" +
                "<h4 align = \"center\">"  +
                "Conceito" +
                "</h4>" +
                "<p align=\"justify\">";
        text+= " A influenza é uma infecção respiratória aguda, causada " +
                "pelos vírus A e B. O vírus A está associado a epidemias e pandemias. " +
                "É um vírus de comportamento sazonal e tem aumento no número de casos entre as" +
                " estações climáticas mais frias, podendo haver anos com menor ou maior" +
                " circulação do vírus. Habitualmente em cada ano circula mais de um tipo de influenza " +
                "concomitantemente (exemplo: influenza A (H1N1)pdm09, influenza A (H3N2) e influenza B).¹" +
                " É considerada uma doença multifatorial causada pela interação de componentes não infecciosos " +
                "(ambiente, gestão, idade, genética e nutrição) com patógenos virais e bacterianos.";

        text+= "</p></body></html>";
        view.loadData(text, "text/html", "iso-8859-1");


    }




}

