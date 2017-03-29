/**
 * Check out the Insertion sort demo from Haas's web page,
 * then complete the code below which performs an Insertion
 * sort on an array of integers.
 *
 * Below is the output from the correct implementation:
 *
 * Before Sort >>> 96 51 32 88 12 9 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 96 51 32 88 12 9 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 51 96 32 88 12 9 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 32 51 96 88 12 9 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 32 51 88 96 12 9 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 12 32 51 88 96 9 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 9 12 32 51 88 96 77 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 9 12 32 51 77 88 96 63 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 9 12 32 51 63 77 88 96 45 27 36 71 19 25 83 91 22
 *   During Sort >>> 9 12 32 45 51 63 77 88 96 27 36 71 19 25 83 91 22
 *   During Sort >>> 9 12 27 32 45 51 63 77 88 96 36 71 19 25 83 91 22
 *   During Sort >>> 9 12 27 32 36 45 51 63 77 88 96 71 19 25 83 91 22
 *   During Sort >>> 9 12 27 32 36 45 51 63 71 77 88 96 19 25 83 91 22
 *   During Sort >>> 9 12 19 27 32 36 45 51 63 71 77 88 96 25 83 91 22
 *   During Sort >>> 9 12 19 25 27 32 36 45 51 63 71 77 88 96 83 91 22
 *   During Sort >>> 9 12 19 25 27 32 36 45 51 63 71 77 83 88 96 91 22
 *   During Sort >>> 9 12 19 25 27 32 36 45 51 63 71 77 83 88 91 96 22
 * After Sort >>> 9 12 19 22 25 27 32 36 45 51 63 71 77 83 88 91 96
 */

public class InsertionSort {

    /***
     * Complete this method which performs an insertion sort
     */
    public static void sort(int numbers[]) {

        /**
         * outerloop gets next item to be Inserted into the
         * already sorted portion of the array
         */
        for (int x = 1; x < numbers.length; x++)  {

            printArray("\t During Sort >>> ", numbers); // print contents of the array

            int key = numbers[x];
            /*** <--- ADD YOUR CODE HERE --->
             * Complete the code which moves item "x"  (key) into the
             * correct position of the already sorted portion of the array.
             * If you can, try to complete the code without looking at the
             * Insertion Sort example on Haas's page.
             ****/
            int i = x;
            while (i > 0 && numbers[i - 1] > numbers[i]) {
                int temp = numbers[i];
                numbers[i] = numbers[i-1];
                numbers[i-1] = temp;
                i--;
            }
        }
    }

    /***
     * prints contents of the array
     */
    public static void printArray(String when, int numbers[]) {
        System.out.print(when);
        for (int w : numbers) {
            System.out.print(w + " ");
        }
        System.out.println("");
    }

    /**
     * Creates array and calls sort method
     */
    public static void main(String args[])
    {
        int[] numArray = {96,51,32,88,12,9,77,63,45,27,36,71,19,25,83,91,22};

        printArray("Before Sort >>> ", numArray); // print contents of the array
        sort(numArray);
        printArray("After Sort >>> ", numArray); // print contents of the array
    }
}
