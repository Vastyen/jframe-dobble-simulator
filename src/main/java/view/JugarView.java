package main.java.view;
import main.java.controller.PlayCTRL;
import main.java.model.DobbleGame;
import javax.swing.*;

public class JugarView extends JFrame{
    private JPanel mainPanel;
    private JTextArea gameCard;
    private JTextArea ownCard;
    private JTextField textField1;
    private JButton jugarButton;

    public JugarView(DobbleGame game){
        this.setTitle("Jugar");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);


        PlayCTRL ctrl = new PlayCTRL();

        ctrl.realizarJugada(game, 1);

        gameCard.setText(game.getGameArea().get(0).toString());
        ownCard.setText(game.getGameArea().get(1).toString());


    }


}
