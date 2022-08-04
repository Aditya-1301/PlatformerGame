package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


public class GamePanel extends JPanel {
    private final MouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private BufferedImage image, subImage;

    public GamePanel(){
        setPanelSize();
        importImage();
        setBackground(Color.BLACK);
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void importImage() {
        InputStream is = getClass().getResourceAsStream("/img.png");
        try {
            image = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void changeXDelta(int value){
        xDelta +=value;
    }
    public void changeYDelta(int value){
        yDelta +=value;
    }
    public void setImagePosition(int x,int y){
        xDelta = x;
        yDelta = y;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Clears the screen each frame so new graphics can be drawn.
        subImage = image.getSubimage(1*64,8*40,64,40);
        g.drawImage
        (subImage,(int)xDelta,(int)yDelta,128,80,null);

    }


}
