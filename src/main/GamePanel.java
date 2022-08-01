package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Clears the screen each frame so new graphics can be drawn.
        g.fillRect(100,100,200,400);
    }
}
