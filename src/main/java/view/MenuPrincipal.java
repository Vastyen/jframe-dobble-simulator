package main.java.view;

import main.java.model.DobbleGame;
import main.java.model.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame{

    private DobbleGame game;
    private JPanel mainPanel;
    private JButton estadoDelJuegoButton;
    private JButton crearJuegoButton;
    private JButton registrarJugadorButton;
    private JButton jugarButton;
    private JButton salirButton;
    private JButton instruccionesDeJuegoButton;

    public MenuPrincipal(Player player){
        this.setTitle("Dobble Game Simulation");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        crearJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardsSetView cardsSetView = new CardsSetView(player,MenuPrincipal.this);
                cardsSetView.setVisible(true);
            }
        });
        registrarJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (game == null){
                    JOptionPane.showMessageDialog(null, "Primero debe crear un juego!");
                }
                else{
                    RegistrarView registrarView = new RegistrarView(game);
                    registrarView.setVisible(true);
                }
            }
        });

        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (game == null){
                    JOptionPane.showMessageDialog(null, "Primero debe crear un juego!");
                }
                else {
                    JugarView jugarView = new JugarView(game);
                    jugarView.setVisible(true);
                }
            }
        });

        estadoDelJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (game == null){
                    JOptionPane.showMessageDialog(null, "Primero debe crear un juego!");
                }
                else
                    JOptionPane.showMessageDialog(null, game.toString());
            }
        });

        instruccionesDeJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Este juego consta de un mazo de cartas el cual será creado en el momento donde \n" +
                        "se decide crear un nuevo juego. La cantidad de elementos está determinada por el usuario.\n" +
                        "En cualquier momento es posible realizar registros a través del botón de registros. Se puede \n" +
                        "revisar el estado general del juego en el botón estado del juego.\n");
            }
        });
    }

    public void setGame(DobbleGame game) {
        this.game = game;
    }
}
