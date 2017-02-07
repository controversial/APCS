/***
 * Determines if an arrangement of numbers in a square grid is a magic square.
 * The numbers in each row, and in each column, and the numbers in the forward
 * and backward main diagonals, all add up to the same number.
 ***/
public class MagicSquare
{
    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }


    /**
     * find the sum of a given row
     */
    public int rowSum(int row) {
        int sum = 0;
        for (int i=0; i<grid[row].length; i++)
            sum += grid[row][i];
        return sum;
    }

    /**
     * find the sum of a given column
     */
    public int colSum(int col) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++)
            sum += grid[i][col];
        return sum;
    }


    /**
     * returns the sum in the "up" diagonal (from the lower left to the upper right)
     */
    public int upDiagSum() {
        int total = 0;
        for (int i=0; i<grid.length; i++)
            total += grid[grid.length-i-1][i];
        return total;
    }

    /**
     * returns the sum in the "down" diagonal (from the upper left to the lower right)
     */
    public int downDiagSum() {
        int total = 0;
        for (int i=0; i<grid.length; i++)
            total += grid[i][i];
        return total;
    }

    /**
     * determines if the sum all rows, columns, and main diagonals are equal
     */
    public boolean isMagicSquare() {
        int test = rowSum(0);
        for (int i=0; i<grid.length; i++)
            if (rowSum(i) != test) return false;
        for (int i=0; i<grid[0].length; i++)
            if (colSum(i) != test) return false;
        return upDiagSum() == test && downDiagSum() == test;
    }

    /***
     * prints the grid - this method is complete
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }


    /***
     * The main method is complete - it tests out the above methods.
     *
     * expected output:
     *
     * 8	1	6
     * 3	5	7
     * 4	9	2
     * Magic Square: true
     *
     * 2	1	6
     * 3	5	7
     * 4	9	8
     * Magic Square: false
     *
     * 1	2	3	4
     * 5	6	7	8
     * 9	10	11	12
     * 13	14	15	16
     * Magic Square: false
     *
     * 7	12	1	14
     * 2	13	8	11
     * 16	3	10	5
     * 9	6	15	4
     * Magic Square: true
     *
     * 6	32	3	34	35	1
     * 7	11	27	28	8	30
     * 19	14	16	15	23	24
     * 18	20	22	21	17	13
     * 25	29	10	9	26	12
     * 36	5	33	4	2	31
     * Magic Square: true
     *
     * 6	32	2	34	35	1
     * 7	11	27	28	8	30
     * 19	14	16	15	23	24
     * 18	20	22	21	17	13
     * 25	29	10	9	26	12
     * 36	5	33	4	3	31
     * Magic Square: false
     *
     * 8	58	59	5	4	62	63	1
     * 49	15	14	52	53	11	10	56
     * 41	23	22	44	45	19	18	48
     * 32	34	35	29	28	38	39	25
     * 40	26	27	37	36	30	31	33
     * 17	47	46	20	21	43	42	24
     * 9	55	54	12	13	51	50	16
     * 64	2	3	61	60	6	7	57
     * Magic Square: true
     *
     * 8	58	59	5	4	62	63	1
     * 49	15	14	52	53	11	10	56
     * 41	23	22	44	45	19	18	48
     * 32	34	35	29	28	38	39	25
     * 40	26	27	37	36	30	31	33
     * 17	47	46	20	21	43	42	57
     * 9	55	54	12	13	51	50	16
     * 64	2	3	61	60	6	7	24
     * Magic Square: false
     *
     */
    public static void main(String[] args) {
        MagicSquare m0 = new MagicSquare( new int[][] {{8,1,6},{3,5,7},{4,9,2}});
        m0.printGrid();
        System.out.println("Magic Square: " + m0.isMagicSquare() + "\n");

        MagicSquare m1 = new MagicSquare( new int[][] {{2,1,6},{3,5,7},{4,9,8}});
        m1.printGrid();
        System.out.println("Magic Square: " + m1.isMagicSquare() + "\n");

        MagicSquare m2 = new MagicSquare( new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
        m2.printGrid();
        System.out.println("Magic Square: " + m2.isMagicSquare() + "\n");

        MagicSquare m3 = new MagicSquare( new int[][] {{7,12,1,14},{2,13,8,11},{16,3,10,5},{9,6,15,4}});
        m3.printGrid();
        System.out.println("Magic Square: " + m3.isMagicSquare() + "\n");

        MagicSquare m4 = new MagicSquare( new int[][] {{6,32,3,34,35,1}, {7,11,27,28,8,30}, {19,14,16,15,23,24},
                {18,20,22,21,17,13}, {25,29,10,9,26,12}, {36,5,33,4,2,31}});
        m4.printGrid();
        System.out.println("Magic Square: " + m4.isMagicSquare() + "\n");


        MagicSquare m5 = new MagicSquare( new int[][] {{6,32,2,34,35,1}, {7,11,27,28,8,30}, {19,14,16,15,23,24},
                {18,20,22,21,17,13}, {25,29,10,9,26,12}, {36,5,33,4,3,31}});
        m5.printGrid();
        System.out.println("Magic Square: " + m5.isMagicSquare() + "\n");

        MagicSquare m6 = new MagicSquare( new int[][] {{8,58,59,5,4,62,63,1}, {49, 15, 14, 52, 53, 11, 10, 56},
                {41, 23, 22, 44, 45, 19, 18, 48}, {32, 34, 35, 29, 28, 38, 39, 25},
                {40, 26, 27, 37, 36, 30, 31, 33}, {17, 47, 46, 20, 21, 43, 42, 24},
                {9, 55, 54, 12, 13, 51, 50, 16}, {64, 2, 3, 61, 60, 6, 7, 57 }});
        m6.printGrid();
        System.out.println("Magic Square: " + m6.isMagicSquare() + "\n");

        MagicSquare m7 = new MagicSquare( new int[][] {{8,58,59,5,4,62,63,1}, {49, 15, 14, 52, 53, 11, 10, 56},
                {41, 23, 22, 44, 45, 19, 18, 48}, {32, 34, 35, 29, 28, 38, 39, 25},
                {40, 26, 27, 37, 36, 30, 31, 33}, {17, 47, 46, 20, 21, 43, 42, 57},
                {9, 55, 54, 12, 13, 51, 50, 16}, {64, 2, 3, 61, 60, 6, 7, 24 }});
        m7.printGrid();
        System.out.println("Magic Square: " + m7.isMagicSquare() + "\n");
    }
}
