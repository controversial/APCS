/**
 * Complete the program to find the greatest common factor.
 *
 * The greatest common factor between 2 numbers is the largest factor
 * that they have in common. For example the GCF of 12 and 8 is 4.
 */
public class GCF
{
    /**
     * complete the method below which takes numbers as input
     * and returns the greatest common factor
     */
    public static int getGCF(int num1, int num2)
    {
        int maxFactor = 1;
        for (int i=2; i<Math.min(num1, num2); i++) {
            // It's a common factor
            if (num1 % i == 0 && num2 % i == 0) {
                maxFactor = i;
            }
        }
        return maxFactor;
    }

    /**
     * This method is complete - It tests the GCF method
     */
    public static void main(String args[])
    {
        System.out.println("GCF of 12 and 20 is " + getGCF(12,20));  // answer 4
        System.out.println("GCF of 1024 and 768 is " + getGCF(1024,768));  // answer 256
        System.out.println("GCF of 100 and 25 is " + getGCF(100,25));  // answer 25
        System.out.println("GCF of 90210 and 12561 is " + getGCF(90210,12561));  // answer 3
        System.out.println("GCF of 6229 and 6247 is " + getGCF(6229,6247));  // answer 1
    }
}
