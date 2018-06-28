package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
public class ActivityReferencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);
        WebView view = (WebView) findViewById(R.id.content_page4);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= " <h4 align=\"center\">" + "Referencias"+"</h4>";
        text+="<p align=\"justify\">" +
                " 1.http://portalms.saude.gov.br/o-ministro/918-saude-de-a-a-z/influenza/22873-informacoes-sobre-gripe"+
                "</p>";
        text+="<p align=\"justify\">" +
                " 2.http://portalarquivos2.saude.gov.br/images/pdf\n" +
                "/2018/abril/19/protocolo-influenza-2017.pdf"+
                "</p>";
        text+="<p align=\"justify\">" +
                " 3.RESENDE, Paola Cristina et al. Whole-genome characterization " +
                "of a novel human influenza A (H1N2) virus variant, Brazil. Emerging infectious diseases, " +
                "v. 23, n. 1, p. 152, 2017."+
                "</p>";
        text+="<p align=\"justify\">" +
                " 4.RECH, R. R. et al. Porcine respiratory disease complex after the introduction" +
                " of H1N1/2009 influenza virus in Brazil. Zoonoses and public health, v. 65, n. 1, 2018"+
                "</p>";

        text+= "</p></body></html>";
        view.loadData(text, "text/html", "iso-8859-1");

    }
}

