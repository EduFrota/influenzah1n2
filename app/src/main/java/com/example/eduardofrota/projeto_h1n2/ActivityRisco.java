package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityRisco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risco);


        WebView view = (WebView) findViewById(R.id.content_risco);
        String text;
        text = "<html>" +
                "<body>" +
                "<h4 align = \"center\">"  +
                "Grupos de Risco" +
                "</h4>" +
                "<p align=\"justify\">";
        text+= "Indivíduos com 60 anos ou mais de idade, crianças na faixa etária de 6 meses a menores de 5 anos de idade" +
                " (4 anos, 11 meses e 29 dias), gestantes, puérperas (até 45 dias após o parto), trabalhadores da saúde, povos indígenas," +
                " grupos portadores de doenças crônicas não transmissíveis e outras condições clínicas especiais (conforme listagem definida " +
                "pelo Ministério da Saúde com sociedades científicas), adolescentes e jovens de 12 a 21 anos de idade sob medidas socioeducativas," +
                " população privada de liberdade e funcionários do sistema prisional e professores das escolas públicas e privadas.² ";

        text+= "</p></body></html>";
        view.loadData(text, "text/html", "iso-8859-1");



    }
}
