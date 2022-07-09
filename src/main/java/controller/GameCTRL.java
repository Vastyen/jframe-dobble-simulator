package main.java.controller;
import main.java.model.Dobble;
import main.java.model.DobbleGame;
import main.java.model.Player;

public class GameCTRL {

    public GameCTRL() {
    }

    public DobbleGame crearJuego(int numE, int maxC, int gameMode, Player player) {


        switch (gameMode) {
            case 1:
                DobbleGame stackMode = new DobbleGame(1, "stackMode", player);
                Dobble cardsSet = new Dobble(numE, maxC);
                stackMode.setGameDeck(cardsSet);
                return stackMode;


            default:
                DobbleGame demoMode = new DobbleGame(1, "demoMode", player);
                Dobble cardsSet2 = new Dobble(numE, maxC);
                demoMode.setGameDeck(cardsSet2);
                return demoMode;

        }
    }
}
