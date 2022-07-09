package main.java.view;

import main.java.controller.BienvenidaCTRL;
import main.java.model.DobbleGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaBienvenida extends JFrame {


    private JPanel panelMain;
    private JButton registrarJuegoButton;
    private JTextField textField1;


    public VistaBienvenida(){
        this.setTitle("Dobble Game");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);

        registrarJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.getText();


                BienvenidaCTRL ctrl = new BienvenidaCTRL();
                MenuPrincipal menuPrincipal = new MenuPrincipal(ctrl.registrarJugador(textField1.getText()));
                JOptionPane.showMessageDialog(null, "Registrado con éxito.");
                VistaBienvenida.super.dispose();
                menuPrincipal.setVisible(true);





            }
        });
    }



}
