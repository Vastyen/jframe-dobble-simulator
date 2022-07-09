package main.java.model;

import java.util.Objects;

public class Player {

    private String name;
    private int score;
    private boolean turnStatus;

    /**
     * @descr: Método constructor.
     */

    public Player (String name, int score){
        this.name = name;
        this.score = score;
        this.turnStatus = false; // Por defecto el jugador no está en su turno.
    }

    /**
     * @descr: Métodos selectores y modificadores.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(boolean turnStatus) {
        this.turnStatus = turnStatus;
    }


    @Override
    /**
     * @descr: Método que genera un string de clase Dobble.
     * @param: No aplica.
     * @return: String.
     */
    public String toString() {
        return "Jugador\n " +
                "Nombre: " + name + '\'' +
                ", Puntaje: " + score +
                ", Turno: " + turnStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && turnStatus == player.turnStatus && Objects.equals(name, player.name);
    }


}
