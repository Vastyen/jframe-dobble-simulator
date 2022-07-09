package main.java.view;

import main.java.controller.RegisterCTRL;
import main.java.model.DobbleGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarView extends JFrame{
    private JPanel mainPanel;
    private JTextField nombre;
    private JButton registrarButton;

    public RegistrarView(DobbleGame game) {
        this.setTitle("Registrar Usuario");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(game != null) {
                    RegisterCTRL ctrl = new RegisterCTRL();
                    ctrl.registrarUsuario(game, nombre.getText());
                    JOptionPane.showMessageDialog(null, "Jugador " + nombre.getText() + " registrado con éxito.");
                    RegistrarView.super.dispose();
                }

                else{
                    JOptionPane.showMessageDialog(null, "Primero debe crear un juego!");
                    RegistrarView.super.dispose();
                }


            }
        });
    }
}
