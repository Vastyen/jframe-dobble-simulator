package main.java.controller;

import main.java.model.DobbleGame;
import main.java.model.Player;

import java.util.ArrayList;

public class RegisterCTRL {

    public RegisterCTRL(){

    }

    public void registrarUsuario(DobbleGame game, String nombre){
        Player player = new Player(nombre, 0);
        ArrayList<Player> players = game.getGamePlayers();
        players.add(player);
        game.setGamePlayers(players);

    }

}
