package com.japanss.DAO;


import android.content.Intent;
import android.os.Bundle;

import com.japanss.genius.Nomes;

import java.util.ArrayList;
import java.util.List;

public class NomeDao {
    private final static List<Nomes> nomess = new ArrayList<>();

    public void salva(Nomes nomeCriado) {
        nomess.add(nomeCriado);
    }

    public List<Nomes> todos() {

        return new ArrayList<>(nomess);
    }


}
