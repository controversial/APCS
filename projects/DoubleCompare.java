/**
 *   This class is used to determine whether two floating-point numbers are the same
 *   when rounded to a given number of decimal places.
 */
import javax.swing.JOptionPane;

public class DoubleCompare {
    /** >>>> complete this method <<<<<<
     *  Method to test the equality of the two inputs.
     *  @param num1 is the first number
     *  @param num2 is the second number
     *  @param places is the number of places AFTER the decimal point
     *  @return true if the two numbers are the same up to the given
     *  number of places, else return false
     */
    public static boolean isSameNumber(double num1, double num2, int places) {
        double multiplicationConstant = Math.pow(10, places);
        double num1Rounded = Math.round(num1 * multiplicationConstant),
               num2Rounded = Math.round(num2 * multiplicationConstant);
        return num1Rounded == num2Rounded;
    }


    public static void main(String[] args) {
        /**
         * Get keyboard input from the user using JOptionPane
         * Have the user enter two decimal numbers and a number of decimal places to compare
         * Print the results in a nicely formatted output a statement
         *
         * examples:
         *     isSameNumber(3.45,3.44,1) ---> false
         *     isSameNumber(3.45,3.44,0) ---> true
         *     isSameNumber(1.9999,2.0009,3) ---> false
         *     isSameNumber(1.9999,2.0009,2) ---> true
         */
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number"));
        int places = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of decimal places of accuracy"));

        System.out.println(isSameNumber(num1, num2, places));
    }
}
