package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityCaracteristicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristicas);

        WebView view = (WebView) findViewById(R.id.content_carac);
        String text;
        text = "<html>" +
                "<body>" +
                "<h4 align = \"center\">"  +
                "Características clinicas" +
                "</h4>" +
                "<p align=\"justify\">";
        text+= " Infecção aguda das vias aéreas que cursa com quadro febril (temperatura ≥37,8°C), com a curva térmica usualmente declinando após dois ou três dias e normalizando em torno do sexto dia de evolução. A febre geralmente é mais elevada, persistente e prolongada em crianças. \n" +
                "Comprometimento de vias aéreas superiores: rinorreia; dor de garganta; disfonia (rouquidão); tosse. \n" +
                "Comprometimento sistêmico: mal-estar, calafrios, cefaleia e mialgia. \n" +
                "A evolução da gripe (influenza) geralmente tem resolução espontânea em sete dias, embora a tosse, o mal-estar e a fadiga possam permanecer por algumas semanas.² ";

        text+= "</p></body></html>";
        view.loadData(text, "text/html", "iso-8859-1");


    }
}
