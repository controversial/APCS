import javax.swing.JApplet;
import java.awt.*; // import Graphics, Graphics2D, and Rectangle
public class Spiral extends JApplet
{
    public void paint (Graphics g)
    {
        g.setColor(Color.black);

        /**
         * Here is an example of how to draw a line from (300,200) to (400,300)
         *
         * You will need to replace this code with a while-loop or for-loop
         * which draws a spiral.  Think about drawing lines which increase in
         * length each time you draw a new line.
         */

        int lastx = 200, lasty = 150, newx, newy;

        for (int i=0; i<200; i += 10) {
            // Right
            newx = lastx + i; newy = lasty;
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;

            // Down
            newx = lastx; newy = lasty + i;
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;

            // Left
            newx = lastx - i - 5; newy = lasty;
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;

            // Up
            newx = lastx; newy = lasty - i - 5;
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;
        }

    } // end of paint
}
