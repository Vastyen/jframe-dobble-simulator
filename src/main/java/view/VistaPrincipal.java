package main.java.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {


    private JPanel panelMain;
    private JButton registrarJuegoButton;
    private JTextField textField1;


    public VistaPrincipal(){
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

                JOptionPane.showMessageDialog(null, textField1.getText());



            }
        });
    }



}
