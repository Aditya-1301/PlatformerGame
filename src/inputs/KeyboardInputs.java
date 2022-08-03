package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("A key has been pressed");
        switch (e.getKeyCode()){
            case KeyEvent.VK_W, KeyEvent.VK_UP -> {
                System.out.println("UP");
                gamePanel.changeYDelta(-5);
            }
            case KeyEvent.VK_A, KeyEvent.VK_LEFT -> {
                System.out.println("LEFT");
                gamePanel.changeXDelta(-5);
            }
            case KeyEvent.VK_S, KeyEvent.VK_DOWN -> {
                System.out.println("DOWN");
                gamePanel.changeYDelta(5);
            }
            case KeyEvent.VK_D, KeyEvent.VK_RIGHT -> {
                System.out.println("RIGHT");
                gamePanel.changeXDelta(5);
            }
            default -> {}
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
