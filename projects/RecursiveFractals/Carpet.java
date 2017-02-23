/**
 * Complete the Applet below which draws the Sierpinski Carpet
 * This fractal is formed by drawing a "big" square at position x,y
 * with length = s, width = s, with 8 smaller squares inside it.
 *
 * >>> Use the command: g.drawRect(x,y,s,s) to draw a square.
 *
 * >>> Then make recursive calls to draw 8 smaller squares in
 * the big square each with size s/3
 */
import java.awt.*;
import java.applet.*;

public class Carpet extends Applet {
    Graphics g;

    public void drawBoxes(int x, int y, int s) {
        if (s < 2) return;
        g.drawRect(x, y, s, s);

        int newSize = s / 3;
        // Top left
        drawBoxes(x, y, newSize);
        // Top middle
        drawBoxes(x + newSize, y, newSize);
        // Top right
        drawBoxes(x + (2 * newSize), y, newSize);
        // Middle left
        drawBoxes(x, y + newSize, newSize);
        // Middle right
        drawBoxes(x + (2 * newSize), y + newSize, newSize);
        // Bottom left
        drawBoxes(x, y + (2 * newSize), newSize);
        // Bottom middle
        drawBoxes(x + newSize, y + (2 * newSize), newSize);
        // Bottom right
        drawBoxes(x + (2 * newSize), y + (2 * newSize), newSize);
    }

    public void paint(Graphics gr) {
        g = gr;
        setVisible(true);
        g.setColor(Color.red);
        drawBoxes(0, 0, 800);
    }
}
