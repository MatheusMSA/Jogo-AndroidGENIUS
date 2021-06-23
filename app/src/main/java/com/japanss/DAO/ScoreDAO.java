package com.japanss.DAO;

import com.japanss.genius.Scores;

import java.util.ArrayList;
import java.util.List;

public class ScoreDAO {
    private final static List<Scores> scoress = new ArrayList<>();
    public void salvaScore(Scores scoresCriado){scoress.add(scoresCriado);}
    public List<Scores> scoresList(){return new ArrayList<>(scoress);}
}
