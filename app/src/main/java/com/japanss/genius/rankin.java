package com.japanss.genius;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.japanss.DAO.NomeDao;
import com.japanss.DAO.ScoreDAO;

import java.io.Serializable;
import java.util.List;

public class rankin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking);
        Button inicio = findViewById(R.id.floatingActionButton2);
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rankin.this, MainActivity.class));
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        NomeDao dao =new NomeDao();
        ScoreDAO dao1 = new ScoreDAO();
        ListView Plac = findViewById(R.id.PlacarRank);
        Plac.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao1.scoresList()));
        ListView nomeRakin = findViewById(R.id.Lista);
        nomeRakin.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));

    }
}
