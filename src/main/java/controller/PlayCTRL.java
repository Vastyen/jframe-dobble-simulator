package main.java.controller;
import main.java.model.Card;
import main.java.model.DobbleGame;
import main.java.model.Player;

import java.util.ArrayList;
public class PlayCTRL {
    public PlayCTRL(){
    }
    public void realizarJugada(DobbleGame game) {
        game.stackMode();
    }
    public boolean jugarElemento(DobbleGame game, int selectedElement){


        Card card1 = game.getGameArea().get(0);
        Card card2 = game.getGameArea().get(1);

        if (card1.getListElements().contains(selectedElement) && card2.getListElements().contains(selectedElement)){
            return true;
        }
        else{
            return false;
        }
    }

    public void sumarPuntaje(DobbleGame game, String name){
        ArrayList<Player> jugadores = game.getGamePlayers();

        for (int i = 0 ; i < jugadores.size() ; i++){
            if (name.equals(jugadores.get(i).getName())){
                jugadores.get(i).setScore(jugadores.get(i).getScore()+1);
            }
        }




    }

}

