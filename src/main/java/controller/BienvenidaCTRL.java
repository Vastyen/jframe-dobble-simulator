package main.java.controller;
import main.java.model.Player;


public class BienvenidaCTRL {

    public BienvenidaCTRL(){
    }

    public Player registrarJugador(String nombre){


        Player player = new Player(nombre, 0);



        return player;



    }




}
