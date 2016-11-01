import javax.swing.JApplet;
import java.awt.*; // import Graphics, Graphics2D, and Rectangle
public class TriSpiral extends JApplet
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

        int lastx = 300, lasty = 300, newx, newy;

        for (int i=0; i<200; i += 9) {
            // Down + Right
            newx = lastx + i; newy = lasty + i;
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;

            // Left
            newx = lastx - 2*(i + 3); newy = lasty;
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;

            // Up + Right
            newx = lastx + i + 6; newy = lasty - (i + 6);
            g.drawLine(lastx, lasty, newx, newy);
            lastx = newx; lasty = newy;
        }

    } // end of paint
}
