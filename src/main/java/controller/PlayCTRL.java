package main.java.controller;

import main.java.model.DobbleGame;
import main.java.model.Player;

import java.util.ArrayList;

public class PlayCTRL {

    public PlayCTRL(){

    }

    public void realizarJugada(DobbleGame game, int selectedElement){

        if (selectedElement == 1) {
            game.stackMode();
        }



    }

}

