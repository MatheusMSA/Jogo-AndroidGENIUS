package com.japanss.genius;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import android.os.Handler;


public class InicioJogo extends AppCompatActivity {
    List<Integer> seq = new ArrayList<>();
    int valor;
    int posiçao = 0;

    private int score = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_jogo);
        invocaNumero();
        ConfiguraBotoes();
    }


    private void ConfiguraBotoes() {
        View Btn1 = findViewById(R.id.btn1);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(1);
                VerificarSeq();
            }
        });
        View Btn2 = findViewById(R.id.btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(2);
                VerificarSeq();
            }
        });
        View Btn3 = findViewById(R.id.btn3);
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(3);
                VerificarSeq();
            }
        });
        View Btn4 = findViewById(R.id.btn4);
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(4);
                VerificarSeq();
            }
        });
        View Btn5 = findViewById(R.id.btn5);
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(5);
                VerificarSeq();
            }
        });
        View Btn6 = findViewById(R.id.btn6);
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(6);
                VerificarSeq();
            }
        });
        View Btn7 = findViewById(R.id.btn7);
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(7);
                VerificarSeq();
            }
        });
        View Btn8 = findViewById(R.id.btn8);
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(8);
                VerificarSeq();
            }
        });
        View Btn9 = findViewById(R.id.btn9);
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValor(9);
                VerificarSeq();
            }
        });
    }


    private void invocaNumero() {
        int num = (int) Math.floor(9 * Math.random() + 1);
        TextView Numero = findViewById(R.id.seqaa);
        seq.add(num);
        Numero.setText("" + num);


    }




    private void VerificarSeq() {
        int verSequencia = valor;
        if (verSequencia ==seq.get(posiçao)) {
            posiçao = posiçao + 1;
            if (posiçao >= seq.size()) {
                TextView Score = findViewById(R.id.score);
                score++;
                Score.setText("" + this.score);
                posiçao = 0;
                invocaNumero();
            }
        } else {
            int placar = this.score;
            Intent intent = new Intent(getApplicationContext(), Fim_Jogo.class);
            Bundle parametros = new Bundle();
            parametros.putInt("placar", placar);
            intent.putExtras(parametros);
            startActivity(intent);
        }

    }

    public void setValor(int nvalor) {
        this.valor = nvalor;
    }

    public int getValor() {
        return this.valor;
    }

}

