/***
 * Find solutions to the n queens problem.
 *
 * In your code a 0 will indicate that a square is
 * empty and a 1 will indiacte a queen occupies the square.
 *
 * BELOW IS THE EXPECTED OUTPUT
 *
 * 0 1 0 0 0 0
 * 0 0 0 1 0 0
 * 0 0 0 0 0 1
 * 1 0 0 0 0 0
 * 0 0 1 0 0 0
 * 0 0 0 0 1 0
 * For a 6X6 grid there were 4 solutions total. Above is one of them.
 *
 * 1 0 0 0 0 0 0
 * 0 0 1 0 0 0 0
 * 0 0 0 0 1 0 0
 * 0 0 0 0 0 0 1
 * 0 1 0 0 0 0 0
 * 0 0 0 1 0 0 0
 * 0 0 0 0 0 1 0
 * For a 7X7 grid there were 40 solutions total. Above is one of them.
 *
 * 1 0 0 0 0 0 0 0
 * 0 0 0 0 1 0 0 0
 * 0 0 0 0 0 0 0 1
 * 0 0 0 0 0 1 0 0
 * 0 0 1 0 0 0 0 0
 * 0 0 0 0 0 0 1 0
 * 0 1 0 0 0 0 0 0
 * 0 0 0 1 0 0 0 0
 * For an 8X8 grid there were 92 solutions total. Above is one of them.
 *
 ***/
public class EightQueen
{
    private static boolean firstCall = true;
    /**
     * returns true if each row on the grid contains at most one '1'
     * else returns false
     * This method should be written so that it would work on any size square grid.
     */
    public static boolean rowCheck(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            int count = 0;
            for (int col = 0; col < grid.length; col++) {
                if (grid[row][col] == 1) count++;
            }
            if (count > 1) return false;
        }
        return true;
    }

    /**
     * returns true if each column on the grid contains at most one '1'
     * else returns false
     * This method should be written so that it would work on any size square grid.
     */
    public static boolean colCheck(int[][] grid) {
        for (int col = 0; col < grid[0].length; col++) {
            int count = 0;
            for (int row = 0; row < grid.length; row++) {
                if (grid[row][col] == 1) count++;
            }
            if (count > 1) return false;
        }
        return true;
    }


    /**
     * returns true if each "up" diagonal contains at most one '1'
     * else returns false
     * an "up" diagonal goes from lower left to upper right
     * This method should be written so that it would work on any size square grid.
     */
    public static boolean upDiagCheck(int[][] grid) {
        /*
         * Indices have a common sum for each diagonal
         *
         * Example: 3x3 grid
         *   . 0 1 2
         *   0 x x x
         *   1 x x x
         *   2 x x x
         *
         *   First diagonal: (0, 0) - common sum 0
         *   Second diagonal: (1, 0), (0, 1) - common sum 1
         *   Third diagonal: (2, 0), (1, 1), (0, 2) - common sum 2
         *   Fourth diagonal: (1, 2), (2, 1) - common sum 3
         *   Fifth diagonal: (2, 2) - common sum 4
         */
        for (int diagSum = 0; diagSum <= (grid.length - 1) + (grid[0].length - 1); diagSum++) {
            int total = 0;
            // Iterate through all items, find the ones on the current diagonal
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    // Only use the items on the diagonal
                    if (row + col == diagSum) {
                        if (grid[row][col] == 1) total++;
                    }
                }
            }
            if (total > 1) return false;
        }
        return true;
    }

    /**
     * returns true if each "down" diagonal contains at most one '1'
     * else returns false
     * a "down" diagonal goes from upper left to lower right
     * This method should be written so that it would work on any size square grid.
     */
    public static boolean downDiagCheck(int[][] grid) {
        /*
         * Indices have a common difference for each diagonal
         *
         * Example: 3x3 grid
         *   . 0 1 2
         *   0 x x x
         *   1 x x x
         *   2 x x x
         *
         *   First diagonal: (0, 2) - common difference -2
         *   Second diagonal: (0, 1), (1, 2) - common difference -1
         *   Third diagonal: (0, 0), (1, 1), (2, 2) - common difference 0
         *   Fourth diagonal: (1, 0), (2, 1) - common difference 1
         *   Fifth diagonal: (2, 0) - common difference 2
         */

        for (int diagDiff = -(grid.length - 1); diagDiff <= grid.length - 1; diagDiff++) {
            int total = 0;
            // Iterate through all items, find the ones on the current diagonal
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    // Only use the items on the diagonal
                    if (col - row == diagDiff) {
                        if (grid[row][col] == 1) total++;
                    }
                }
            }
            if (total > 1) return false;
        }
        return true;
    }

    /***
     * prints the grid - as rows and columns
     * This method should be written so that it would work on any size square grid.
     */
    public static void printGrid(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println("");
        }
    }

    /** ------------ <<<<<< The main method is complete >>>>>>> ---------
     * This method places 0's and 1's on the grid, and tests to
     * determines if all rows, columns, diagonals contain only 1 queen.
     */
    public static void main(String[] args)
    {
        int[][] g6 = new int[6][6];
        int count = 0;
        for (int a = 0; a<6; a++)
            for (int b = 0; b<6; b++)
                for (int c = 0; c<6; c++)
                    for (int d = 0; d<6; d++)
                        for (int e = 0; e<6; e++)
                            for (int f = 0; f<6; f++)
                            {
                                g6[0][a] = 1;
                                g6[1][b] = 1;
                                g6[2][c] = 1;
                                g6[3][d] = 1;
                                g6[4][e] = 1;
                                g6[5][f] = 1;
                                if (downDiagCheck(g6) && upDiagCheck(g6) && rowCheck(g6) && colCheck(g6) )
                                {
                                    if (count==0)
                                        printGrid(g6);
                                    count++;
                                }
                                g6[0][a] = 0;
                                g6[1][b] = 0;
                                g6[2][c] = 0;
                                g6[3][d] = 0;
                                g6[4][e] = 0;
                                g6[5][f] = 0;
                            }
        System.out.println("For a 6X6 grid there were " + count + " solutions total. Above is one of them.");

        int[][] g7 = new int[7][7];
        count = 0;
        for (int a = 0; a<7; a++)
            for (int b = 0; b<7; b++)
                for (int c = 0; c<7; c++)
                    for (int d = 0; d<7; d++)
                        for (int e = 0; e<7; e++)
                            for (int f = 0; f<7; f++)
                                for (int g = 0; g<7; g++)
                                {
                                    g7[0][a] = 1;
                                    g7[1][b] = 1;
                                    g7[2][c] = 1;
                                    g7[3][d] = 1;
                                    g7[4][e] = 1;
                                    g7[5][f] = 1;
                                    g7[6][g] = 1;
                                    if (downDiagCheck(g7) && upDiagCheck(g7) && rowCheck(g7) && colCheck(g7) )
                                    {
                                        if (count==0)
                                            printGrid(g7);
                                        count++;
                                    }
                                    g7[0][a] = 0;
                                    g7[1][b] = 0;
                                    g7[2][c] = 0;
                                    g7[3][d] = 0;
                                    g7[4][e] = 0;
                                    g7[5][f] = 0;
                                    g7[6][g] = 0;

                                }
        System.out.println("For a 7X7 grid there were " + count + " solutions total. Above is one of them.");

        int[][] g8 = new int[8][8];
        count = 0;
        for (int a = 0; a<8; a++)
            for (int b = 0; b<8; b++)
                for (int c = 0; c<8; c++)
                    for (int d = 0; d<8; d++)
                        for (int e = 0; e<8; e++)
                            for (int f = 0; f<8; f++)
                                for (int g = 0; g<8; g++)
                                    for (int h = 0; h<8; h++)
                                    {
                                        g8[0][a] = 1;
                                        g8[1][b] = 1;
                                        g8[2][c] = 1;
                                        g8[3][d] = 1;
                                        g8[4][e] = 1;
                                        g8[5][f] = 1;
                                        g8[6][g] = 1;
                                        g8[7][h] = 1;
                                        if (downDiagCheck(g8) && upDiagCheck(g8) && rowCheck(g8) && colCheck(g8) )
                                        {
                                            if (count==0)
                                                printGrid(g8);
                                            count++;
                                        }
                                        g8[0][a] = 0;
                                        g8[1][b] = 0;
                                        g8[2][c] = 0;
                                        g8[3][d] = 0;
                                        g8[4][e] = 0;
                                        g8[5][f] = 0;
                                        g8[6][g] = 0;
                                        g8[7][h] = 0;
                                    }
        System.out.println("For an 8X8 grid there were " + count + " solutions total. Above is one of them.");
    }
}

