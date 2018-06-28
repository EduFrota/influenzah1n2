package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        WebView view = (WebView) findViewById(R.id.content_dados);
        String text;
        text = "<html>" +
                "<body>" +
                "<h4 align = \"center\">"  +
                "Epidemiologia (Dados)" +
                "</h4>" +
                "<p align=\"justify\">";
        text+= " A influenza ocorre durante todo o ano, mas é mais frequente no outono e no inverno, quando as temperaturas caem, principalmente no Sul e Sudeste do País. Algumas pessoas, como idosos, crianças, gestantes e pessoas com alguma comorbidade, possuem um risco maior de desenvolver complicações devido à influenza.² \n" +
                "Os vírus influenza A (H1N2) têm sido descritos em populações humanas, aviárias e especialmente suínas ao longo de muitos anos. Em contraste com a circulação generalizada dos vírus H1N1 e H3N2 sazonais, o subtipo H1N2 foi observado apenas esporadicamente em humanos. \n" +
                "No Brasil, essa cepa de subtipo H1N2 foi detectada em humanos na região sudeste durante o inverno de 2002 e na região norte no início de 2003. Essa cepa do subtipo 2000-2003 H1N2 teve uma origem genética similar à cepa H1N2 de 1988-1989 da China, ambos rearranjadores entre linhagens de subtipos humanos H1N1 e H3N2 sazonais.\n" +
                "O monitoramento passivo do vírus influenza A em suínos ocorre desde 2009. Recentemente, um estudo filogenético revelou que os vírus do subtipo H1N2 circulam sem serem detectados em rebanhos suínos no Brasil há mais de uma década e que podem ter ocorrido rearranjos.\n" +
                "Este vírus foi identificado a partir de um aspirado nasofaríngeo coletado em 26 de novembro de 2015, de uma menina de 16 anos de uma área rural da cidade de Castro, Paraná, na região sul do Brasil. Castro tem 67.000 habitantes e é um importante centro pecuário para gado leiteiro, aves e suínos. O paciente não apresentou nenhum fator de risco para influenza, mas mostrou o desenvolvimento de uma doença semelhante à influenza com início dos sintomas (febre, tosse, dor de garganta, dor torácica e mialgia) em 23 de novembro de 2015. A investigação local de acompanhamento relatou que ela estava trabalhando em uma fazenda suína e confirmou o contato direto do paciente com os porcos. " +
                "Ela não havia recebido uma vacina contra influenza ou tratamento antiviral prévio, e sua recuperação clínica transcorreu sem problemas.";

        text+= "</p></body></html>";
        view.loadData(text, "text/html", "iso-8859-1");

    }
}
