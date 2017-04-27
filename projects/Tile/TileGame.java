/***
 * Complete the code for questions (a) and (b)
 **/
import java.util.ArrayList;

public class TileGame
{
    /** represents the game board; guaranteed never to be null */
    private ArrayList<NumberTile> board;

    public TileGame()
    { board = new ArrayList<NumberTile>(); }

    /** Determines where to insert tile, in its current orientation, into game board
     *  @param tile the tile to be placed on the game board
     *  @return the position of tile where tile is to be inserted:
     *           0 if the board is empty;
     *          -1 if tile does not fit in front, at end,
     *             or between any existing tiles;
     *          otherwise, 0 <= position returned <= board.size()
     */
    private int getIndexForFit(NumberTile tile) {
        if (this.board.size() == 0) return 0;
        if (this.board.get(0).getLeft() == tile.getRight()) return 0;

        for (int i=0; i < this.board.size() - 1; i++) {
            NumberTile current = this.board.get(i);
            if (board.get(i).getRight() == tile.getLeft() && board.get(i + 1).getLeft() == tile.getRight()) return i + 1;
        }
        if (this.board.get(this.board.size() - 1).getRight() == tile.getLeft()) return this.board.size();
        return -1;
    }


    /** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
     *  If there are no tiles on the game board, the tile is placed at position 0.
     *  The tile should be placed at most 1 time.
     *  Precondition: board is not null
     *  @param tile the tile to be placed on the game board
     *  @return true if tile is placed successfully; false otherwise
     *  Postcondition: the orientations of the other tiles on the board are not changed
     *  Postcondition: the order of the other tiles on the board relative to each other
     *  is not changed
     */
    public boolean insertTile(NumberTile tile) {
        int rotations = 0;
        int index = -1;
        while (rotations < 4) {
            index = getIndexForFit(tile);
            if (index != -1) break;
            else tile.rotate();
            rotations++;
        }
        if (index != -1) {
            this.board.add(index, tile);
            return true;
        }
        return false;
    }

    public String toString()
    {
        return board.toString();
    }

    public static void main(String[] args)
    {
        TileGame game = new TileGame();
        NumberTile t1 = new NumberTile(3, 4, 6, 3);
        NumberTile t2 = new NumberTile(1, 2, 5, 7);
        NumberTile t3 = new NumberTile(8, 7, 1, 3);
        NumberTile t4 = new NumberTile(2, 3, 4, 5);
        NumberTile t5 = new NumberTile(7, 7, 3, 3);
        NumberTile t6 = new NumberTile(9, 8, 7, 6);
        NumberTile t7 = new NumberTile(3, 3, 0, 4);

        System.out.println("place tile: " + t1);
        System.out.println("expected: true [[3, 6, 3, 4]]");
        System.out.println("  result: " + game.insertTile(t1) + " " + game.board + "\n");
        System.out.println("place tile: " + t2);
        System.out.println("expected: false [[3, 6, 3, 4]]");
        System.out.println("  result: " + game.insertTile(t2) + " " + game.board + "\n");
        System.out.println("place tile: " + t3);
        System.out.println("expected: true [[1, 7, 8, 3], [3, 6, 3, 4]]");
        System.out.println("  result: " + game.insertTile(t3) + " " + game.board + "\n");
        System.out.println("place tile: " + t4);
        System.out.println("expected: true [[1, 7, 8, 3], [3, 6, 3, 4], [4, 3, 2, 5]]");
        System.out.println("  result: " + game.insertTile(t4) + " " + game.board + "\n");
        System.out.println("place tile: " + t5);
        System.out.println("expected: true [[1, 7, 8, 3], [3, 7, 7, 3], [3, 6, 3, 4], [4, 3, 2, 5]]");
        System.out.println("  result: " + game.insertTile(t5) + " " + game.board + "\n");
        System.out.println("place tile: " + t6);
        System.out.println("expected: false [[1, 7, 8, 3], [3, 7, 7, 3], [3, 6, 3, 4], [4, 3, 2, 5]]");
        System.out.println("  result: " + game.insertTile(t6) + " " + game.board + "\n");
        System.out.println("place tile: " + t7);
        System.out.println("expected: true [[1, 7, 8, 3], [3, 0, 4, 3], [3, 7, 7, 3], [3, 6, 3, 4], [4, 3, 2, 5]]");
        System.out.println("  result: " + game.insertTile(t7) + " " + game.board + "\n");
    }
}
