package main;

import javax.swing.*;

import static javax.swing.WindowConstants.*;

public class GameWindow  {
    public JFrame jFrame;
    public GameWindow(GamePanel gamePanel){
        jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Platformer Game");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
