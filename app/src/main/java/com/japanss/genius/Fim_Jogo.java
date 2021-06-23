package com.japanss.genius;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.japanss.DAO.NomeDao;
import com.japanss.DAO.ScoreDAO;

import java.util.ArrayList;
import java.util.List;


public class Fim_Jogo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fim_jogo);

        final NomeDao dao = new NomeDao();
        ScoreDAO dao1 = new ScoreDAO();

        final EditText nomesalvo = findViewById(R.id.Nomesalvar);
        TextView ScoreView = findViewById(R.id.ScoreView);

        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();
        int placar =parametros.getInt("placar");

        ScoreView.setText(""+ placar);


        final View BtnFechar = findViewById(R.id.floatingActionButton);
        BtnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fim_Jogo.this, MainActivity.class));
            }
        });

        final View BtnSalvar = findViewById(R.id.Salvar);
        BtnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nomesalvo.getText().toString();
                String scoore = String.valueOf(placar);
                final Nomes nomeCriado = new Nomes(nome);
                Scores scores = new Scores(scoore);
                dao.salva(nomeCriado);
                dao1.salvaScore(scores);
                startActivity(new Intent(Fim_Jogo.this, rankin.class));

            }
        });



    }







}
