package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityTratamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tratamento);

        WebView view = (WebView) findViewById(R.id.content_page2);
        String text;
        text = "<html>" +
                "<body>" +
                "<h4 align = \"center\">"  +
                "Tratamento" +
                "</h4>" +
                "<p align=\"justify\">";
        text+= " O tratamento com o antiviral, de maneira precoce, pode\n " +
                "reduzir a duração dos sintomas e, principalmente,\n" +
                " a redução da ocorrência de complicações da infecção pelo vírus influenza.";
        text+=   "<h4 align = \"left\">"  +
                "Como devemos evitar? " +
                "</h4>"+
                "<p align=\"justify\">"+
                "<b>"+ "Pessoal: "+"</b>"+
                "Uso de antivirais; quimioprofilaxia; cobrir o nariz e a boca com lenço, ao tossir ou espirrar, e descartar o"+
                "lenco no lixo apos uso; Lavar as mãos com água e sabão após tossir ou espirrar; No caso de não haver disponibilidade de água e sabão, usar álcool gel; Evitar tocar olhos, nariz ou boca.²\n \n"+
                "</p>";
        text+=   "<p align=\"left\">"+
                "<b>"+"Comunitário: "+"</b>" + "Internação em UTI; Vacinação.²\n \n"+
                "<p align=\"justify\">";
        text+=   "Para evitar a gripe ou a sua transmissão também deve-se fazer uso de medidas preventivas como: " +
                "higienizar as mãos com água e sabão ou com álcool gel, principalmente depois de tossir ou espirrar; " +
                "depois de usar o banheiro, antes de comer, antes e depois de tocar os olhos, a boca e o nariz; " +
                "evitar tocar os olhos, nariz ou boca após contato com superfícies potencialmente contaminadas (corrimãos, bancos, maçanetas etc.).  Manter hábitos saudáveis, como alimentação balanceada, ingestão de líquidos e atividade física. Pessoas com síndrome gripal devem evitar contato direto com outras pessoas, " +
                "abstendo-se de suas atividades de trabalho, estudo, sociais ou aglomerações e ambientes coletivos.";


        text+= "</p></body></html>";
        view.loadData(text, "text/html", "iso-8859-1");


    }

}

