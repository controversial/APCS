/**
 * Java Program to Implement Flood Fill Algorithm
 **/
import java.util.Arrays;

public class FloodFill
{
    /** Function to fill grid **/
    private void fillGrid(String[][] arr, int row, int col, String oldLet, String newLet)
    {
        /**
         * complete the recursive function as follows
         *
         * Base case
         *   if the row or column out of bounds (off the grid)
         *   or if the grid location does not equal the letter to relplace
         *   then return
         *
         * Recursive case
         *   call fillGrid for the 4 locations above, below, to the right and
         *   left of the currect location.
         */
        if (row < 0 || row >= arr.length ||
            col < 0 || col >= arr[0].length ||
            !arr[row][col].equals(oldLet)
        ) {
            return;
        }

        arr[row][col] = newLet;

        fillGrid(arr, row-1, col, oldLet, newLet);
        fillGrid(arr, row+1, col, oldLet, newLet);
        fillGrid(arr, row, col-1, oldLet, newLet);
        fillGrid(arr, row, col+1, oldLet, newLet);
    }

    /** Function to display grid **/
    private static void display(String[][] arr)
    {
        System.out.println("\nGrid : ");
        for (int r = 0; r < arr.length; r++)
        {
            for (int c = 0; c < arr[0].length; c++)
                System.out.print(arr[r][c] +"");
            System.out.println();
        }
    }

    /** Main method tester **/
    public static void main(String[] args)
    {
        String[][] arr = {  {"X","X","X","X","X","X","X","X","X"," ","X"," ","X"},
                {"X","X","X"," "," "," ","X","X"," "," "," "," "," "},
                {"X"," ","X"," "," "," ","X","X"," ","X","X"," "," "},
                {"X"," ","X","X"," ","X","X"," "," ","X","X"," ","X"},
                {" "," "," ","X"," ","X","X"," ","X","X","X"," ","X"},
                {"X"," ","X","X"," ","X"," "," ","X","X","X"," "," "},
                {"X"," ","X"," "," "," "," "," ","X","X"," "," "," "},
                {" "," ","X","X","X"," ","X","X","X","X"," "," ","X"},
                {"X","X","X"," "," "," ","X","X","X"," "," "," ","X"},
                {"X","X","X","X","X","X","X","X","X","X","X"," ","X"}};

        display(arr);
        FloodFill ff = new FloodFill();
        ff.fillGrid(arr, 2, 3, " ", "-");
        display(arr);
    }
}
