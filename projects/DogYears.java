import javax.swing.JOptionPane; // import a package for user input

public class DogYears
{
    /*****
     * Complete the method to calculate dog years
     *
     * Add 10.5 for each of the first two years
     *   then for each additional year:
     * for small or medium sized dogs add 4
     * for large dogs add 5
     * for giant breeds add 6
     ****/
    public static double calculateYears(String size, int yrs)
    {
        if (yrs <= 2) return 10.5*yrs;
        else {
            // First 2 years
            yrs -= 2;

            int sizeConstant;
            if (size .equals("small") || size.equals("medium")) sizeConstant = 4;
            else if (size.equals("large")) sizeConstant = 5;
            else if (size.equals("giant")) sizeConstant = 6;
            else sizeConstant = 0;

            return yrs * sizeConstant + 21;
        }
    }

    // The main method is complete
    public static void main( String args[] )
    {
        /*** Read a string into variable dogSize ***/
        String dogSize = JOptionPane.showInputDialog(null, "Enter the dog's size: small, medium, large, giant.");

        /*** Read an integer into variable dogAge ***/
        int dogAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the dog's age."));

        System.out.println("The dog’s age in human years is " +  calculateYears(dogSize,dogAge));
    }
}
