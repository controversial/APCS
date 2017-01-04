/****************************************************
 *                 Birthday problem.
 *
 * Expected output:
 * (percents could be slightly different)
 *
 * With 23 students, there is a 50.79% chance that
 * at least 2 have the same birthday.
 *
 * With 70 students, there is a 99.91% chance that
 * at least 2 have the same birthday.
 ***************************************************/
public class Birthday {

    /**
     * This method should do the following
     * --> create an array of size 'classSize'
     * --> fill the array with random numbers from 1 to 365
     * --> return 1 if two or more numbers in the array
     *     are the same else return 0
     */
    public static int makeClass(int classSize) {

        // Array with random numbers from 1 to 365
        int[] c = new int[classSize];
        for (int i=0; i<classSize; i++)
            c[i] = (int) (Math.random() * 365) + 1;

        for (int i=0; i<c.length; i++) {
            for (int j=i+1; j<c.length; j++) {
                if (c[j] == c[i]) return 1;
            }
        }

        return 0;
    }

    /**
     * This method calls the 'makeClass' method within
     * a for loop 1000 times.  It then prints out the
     * percent of times that at least 2 students have the
     * same birthday.
     */
    public static void callMakeClass(int classSize) {

        int total = 0;
        for (int i=0; i<1000; i++) {
            total += makeClass(classSize);
        }

        System.out.println(total / 1000.0 * 100);

    }

    /***
     * The main method is complete.
     */
    public static void main(String[] args) {
        callMakeClass(23);
        callMakeClass(70);
    }
}
