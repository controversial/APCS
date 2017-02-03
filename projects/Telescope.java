public class SkyView
{
    /** A rectangular array that holds the data representing a rectangular area of the sky. */
    private double[][] view;

    /** Constructs a SkyView object from a 1-dimensional array of scan data.
     * @param numRows the number of rows represented in the view
     * Precondition: numRows > 0
     * @param numCols the number of columns represented in the view
     * Precondition: numCols > 0
     * @param scanned the scan data received from the telescope, stored in telescope order
     * Precondition: scanned.length == numRows * numCols
     * Postcondition: view has been created as a rectangular 2-dimensional array
     * with numRows rows and numCols columns and the values in
     * scanned have been copied to view and are ordered as
     * in the original rectangular area of sky.
     */
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];

        for (int row=0; row<numRows; row++) {
            for (int col=0; col<numCols; col++) {
                if (row % 2 == 0)
                    view[row][col] = scanned[row * (numRows-1) + col];
                else
                    view[row][numCols - 1 - col] = scanned[row * (numRows-1) + col];
            }
        }
    }

    /** Returns the average of the values in a rectangular section of view.
     * @param startRow the first row index of the section
     * @param endRow the last row index of the section
     * @param startCol the first column index of the section
     * @param endCol the last column index of the section
     * Precondition: 0 <= startRow <= endRow < view.length
     * Precondition: 0 <= startCol <= endCol < view[0].length
     * @return the average of the values in the specified section of view
     */
    public double getAverage(int startRow, int endRow,
                             int startCol, int endCol)
    {
        double total=0;
        double numValues = 0;
        for (int i=startRow; i<=endRow; i++) {
            for (int j=startCol; j<=endCol; j++) {
                total += view[i][j];
                numValues++;
            }
        }
        return total / numValues;
    }

    /*****************************************************/
    /***              main method is complete          ***/
    /*****************************************************/
    public static void main(String[] args)
    {
        double[] scanned = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};

        SkyView test = new SkyView(4, 3, scanned);

        for (int r = 0; r < 4; r++)  {
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + test.view[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Average = " + test.getAverage(1, 2, 0, 1));
    }
}

