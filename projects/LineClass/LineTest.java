/**
 * This code is complete - it tests the class APLine
 */
public class LineTest
{
    public static void main(String args[])
    {
        Line line1 = new Line(5, 4, -17);
        System.out.println(line1.getSlope()); // prints: -1.25
        System.out.println(line1.isOnLine(5, -2)); // prints: true

        Line line2 = new Line(-25, 40, 30);
        System.out.println(line2.getSlope()); // prints: 0.625
        System.out.println(line2.isOnLine(5, -2)); // prints: false

        Line line3 = new Line(-10, -8, 20);
        System.out.println(line3.getSlope()); // prints: -1.25
        System.out.println(line3.isOnLine(5, -2)); // prints: false

        System.out.println(line1.isParallel(line2));  // prints: false
        System.out.println(line1.isParallel(line3));  // prints: true
    }
}
