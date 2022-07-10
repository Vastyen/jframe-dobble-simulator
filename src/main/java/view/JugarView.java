package main.java.view;
import main.java.controller.PlayCTRL;
import main.java.model.DobbleGame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugarView extends JFrame{
    private JPanel mainPanel;
    private JTextArea gameCard;
    private JTextArea ownCard;
    private JTextField selectedElement;
    private JButton jugarButton;
    private JTextField namePlayer;

    public JugarView(DobbleGame game){
        this.setTitle("Jugar");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);

        PlayCTRL ctrl = new PlayCTRL();
        ctrl.realizarJugada(game);
        gameCard.setText(game.getGameArea().get(0).toString());
        ownCard.setText(game.getGameArea().get(1).toString());

        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean resp = ctrl.jugarElemento(game, Integer.parseInt(selectedElement.getText()));
                if (resp == true){
                    JOptionPane.showMessageDialog(null,"Haz anotado un punto!");
                    game.cleanGameArea();
                    ctrl.sumarPuntaje(game, namePlayer.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null,"Más suerte para la próxima!");
                }
                JugarView.super.dispose();
            }
        });
    }



}
