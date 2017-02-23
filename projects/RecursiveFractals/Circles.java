/*** A Cool Circle Fractal - using recursion ***/
import java.awt.*;
import java.applet.*;
public class Circles extends Applet {
    Graphics g;

    /**
     * recursive method to draws 1 big circle then 5 circles 1/3 the size
     * inside the big circle.
     */
    public void drawCircle(int x, int y, int s) {
        if (s <= 2)
        {
            return; // base case - draw circles until size<2
        }
        else
        {
            /**
             * draw circle at position x, y, dimension s by s
             */
            g.drawOval(x,y,s,s);

            /**
             * reduce the size to 1/3 and make recursive calls to draw
             * 5 circles within the big circle
             */
            s = s / 3;
            drawCircle(x+s, y, s);
            drawCircle(x, y+s, s);
            drawCircle(x+s+s, y+s, s);
            drawCircle(x+s, y+s+s, s);
            drawCircle(x+s, y+s, s);
        }
    }

    public void paint(Graphics gr) {
        g = gr;
        setVisible(true);
        g.setColor(Color.red);
        drawCircle(0, 0, 500);
    }
}
