package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class GamePanel extends JPanel {
    private final MouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private float xDir = 1f, yDir = 1f;
    private int frames = 0;
    private long lastCheck = 0;
    private Random random;
    private Color color = new Color(150,150,150);

    public GamePanel(){
        random = new Random();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){
        this.xDelta += value;
    }

    public void changeYDelta(int value){
        this.yDelta += value;
    }

    public void setRectanglePosition(int x, int y){
        xDelta = x;
        yDelta = y;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Clears the screen each frame so new graphics can be drawn.
        updateRectangle();
        g.setColor(color);
        g.fillRect((int) xDelta, (int) yDelta,200,50);
    }

    private void updateRectangle(){
        xDelta += xDir;
        if(xDelta > 400 || xDelta < 0){
            xDir *= -1;
            color = getRndColor();
        }
        yDelta += yDir;
        if (yDelta > 400 || yDelta < 0){
            yDir *= -1;
            color = getRndColor();
        }
    }

    private Color getRndColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g,b);
    }
}
