package main.java.view;

import main.java.model.Dobble;
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
                RegistrarView registrarView = new RegistrarView(game);
                registrarView.setVisible(true);
            }
        });

        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JugarView jugarView = new JugarView(game);
                jugarView.setVisible(true);
            }
        });



        estadoDelJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, game.toString());
            }
        });


    }

    public void setGame(DobbleGame game) {
        this.game = game;
    }
}
