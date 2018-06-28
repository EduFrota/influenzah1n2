package com.example.eduardofrota.projeto_h1n2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityQuiz extends AppCompatActivity {
    TextView pergunta;
    RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4;
    RadioGroup rgRespostas;
    int respostaCerta = R.id.rbResposta1;
    int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        pergunta = (TextView) findViewById(R.id.pergunta);
        rgRespostas = (RadioGroup) findViewById(R.id.rgRespostas);
        rbResposta1 = (RadioButton) findViewById(R.id.rbResposta1);
        rbResposta2 = (RadioButton) findViewById(R.id.rbResposta2);
        rbResposta3 = (RadioButton) findViewById(R.id.rbResposta3);
        rbResposta4 = (RadioButton) findViewById(R.id.rbResposta4);
        carregarQuestao();

    }

    public void btnResponderOnClick(View v){
        RadioButton rb = (RadioButton)findViewById(rgRespostas.getCheckedRadioButtonId());
        Intent intent = new Intent(this, ActivityResposta.class);
        if(rgRespostas.getCheckedRadioButtonId() == respostaCerta) {
            intent.putExtra("acertou", true);
            pontos++;
        }
        else intent.putExtra("acertou", false);
        intent.putExtra("pontos", pontos);
        startActivity(intent);
        rb.setChecked(false);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        carregarQuestao();
    }

    List<Questões> questoes = new ArrayList<Questões>() {
        {
            add(new Questões("Você sabe o que é a Influenza H1N2?", R.id.rbResposta4, "Vírus de resfriado", "Bactéria de gripe", "Bactéria da pneumonia", "vírus da gripe"));
            add(new Questões("Como podemos evitar?", R.id.rbResposta2, "Ingestão de vitamina D", "Vacina", "Contato direto com pessoas com síndrome gripal", "Sedentarismo"));
            add(new Questões("Como é o contágio?", R.id.rbResposta2, "Através de cortes com sangramento", "Contato com fluidos de pessoas/animais infectados" +
                    "", "Aperto de mão", "Ingestão de alimentos críticos"));
            add(new Questões("Você sabe qual o tratamento indicado?", R.id.rbResposta3, "Anti-inflamatório", "Ingerir líguidos", "Antivirais", "Antibióticos"));
        }
    };
    private void carregarQuestao() {
        if(questoes.size() > 0) {
            Questões q = questoes.remove(0);
            pergunta.setText(q.getPergunta());
            List<String> resposta = q.getRespostas();
            rbResposta1.setText(resposta.get(0));
            rbResposta2.setText(resposta.get(1));
            rbResposta3.setText(resposta.get(2));
            rbResposta4.setText(resposta.get(3));
            respostaCerta = q.getRespostaCerta();
            rgRespostas.setSelected(false);
        }
        else{ //acabaram as questões
            Intent intent = new Intent(this, ActivityResposta.class);
            intent.putExtra("pontos", pontos);
            startActivity(intent);
            finish();
        }

    }
}
