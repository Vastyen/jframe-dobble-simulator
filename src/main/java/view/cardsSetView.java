package main.java.view;

import main.java.model.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cardsSetView extends JFrame{
    private JPanel mainPanel;
    private JTextField numE;
    private JTextField maxC;
    private JButton generarButton;
    private JRadioButton demoModeRadioButton;
    private JRadioButton stackModeRadioButton;

    public cardsSetView(Player player, MenuPrincipal menuPrincipal) {

        this.setTitle("Creación del Mazo");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(stackModeRadioButton);
        grupo.add(demoModeRadioButton);


        generarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
    }
}
