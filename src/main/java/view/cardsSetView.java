package main.java.view;

import main.java.controller.GameCTRL;
import main.java.model.DobbleGame;
import main.java.model.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardsSetView extends JFrame{
    private JPanel mainPanel;
    private JTextField numE;
    private JTextField maxC;
    private JButton generarButton;
    private JRadioButton demoModeRadioButton;
    private JRadioButton stackModeRadioButton;

    public CardsSetView(Player player, MenuPrincipal menuPrincipal) {

        this.setTitle("Creación del Mazo");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(stackModeRadioButton);
        grupo.add(demoModeRadioButton);


        generarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                GameCTRL ctrl = new GameCTRL();

                int mode = 0;

                if (stackModeRadioButton.isSelected()){
                    mode = 1;
                }
                else if(demoModeRadioButton.isSelected()){
                    mode = 2;
                }

                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una opción.");
                }


                if (mode != 0){
                    DobbleGame game = ctrl.crearJuego(Integer.parseInt(numE.getText()),  Integer.parseInt(maxC.getText()), mode, player);
                    menuPrincipal.setGame(game);
                    CardsSetView.super.dispose();
                }








            }
        });
    }
}
