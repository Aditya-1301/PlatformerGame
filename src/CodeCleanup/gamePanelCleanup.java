package CodeCleanup;
import java.awt.*;
import java.util.Random;

public class gamePanelCleanup {
    private float xDelta = 100, yDelta = 100;
    private float xDir = -1f, yDir = 1f;
    private Random random;
    private Color color = new Color(150,150,150);

    private void updateRectangle(){
        xDelta += xDir;
        if(xDelta > 1080 || xDelta < 0){
            xDir *= -1;
            color = getRndColor();
        }
        yDelta += yDir;
        if (yDelta > 700 || yDelta < 0){
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
//        public void paintComponent(){
//            updateRectangle();
//            g.setColor(color);
//            g.fillRect((int) xDelta, (int) yDelta,200,50);
//        }

//    To be added into the mouseMoved method in MouseInputs class if above functionality
//    is used(This allows the rectangle to follow the mouse cursor in real time):-
//    gamePanel.setRectanglePosition(e.getX(),e.getY());
}
