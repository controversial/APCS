import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;


    /**
     * Creates a new ElevensBoard instance.
     */
     public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
     }

    /**
     * Check for an 11-pair in list of card indexes.
     * @param cardIndexes is a list of indexes that are searched
     * to find an 11-pair.
     * @return true if entries contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> cardIndexes) {
         // <<<Complete the code>>>
        /** Hint: use the cardAt(int k) method in the super class to
         * get a card at an index.
         */
        for (int i1 : cardIndexes) {
            Card c1 = super.cardAt(i1);
            for (int i2 : cardIndexes) {
                Card c2 = super.cardAt(i2);
                if (c1.pointValue() + c2.pointValue() == 11) return true;
            }
        }
        return false;
    }

    /**
     * Check for a JQK in the cardIndexes ArrayList.
     * @param cardIndexes is a list of indexes that are searched
     * to find a jack, a queen, and a king in any order.
     * @return true if the entries in cardIndexes
     * include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> cardIndexes) {
        // <<<Complete the code>>>
        /** Hint: use the cardAt(int k) method in the super class to 
         * get a card at an index.
         */
        boolean containsJack = false;
        boolean containsQueen = false;
        boolean containsKing = false;
        for (int i : cardIndexes) {
            Card c = super.cardAt(i);
            if (c.rank().equals("jack")) containsJack = true;
            if (c.rank().equals("queen")) containsQueen = true;
            if (c.rank().equals("king")) containsKing = true;
        }
        return containsJack && containsQueen && containsKing;
    }
     
    /**
     * Determines if the cardIndexes form a valid group for removal.
     * (1) two cards whose values add to 11 
     * (2) three cards - a jack, a queen, and a king in any order.
     * @param cardIndexes the list of the indices of the cards.
     * @return true if the cards form a valid group for removal;
     * false otherwise.
     */
    public boolean isLegal(List<Integer> cardIndexes) {
         if (cardIndexes.size() == 2) return containsPairSum11(cardIndexes);
         if (cardIndexes.size() == 3) return containsJQK(cardIndexes);
         return false;
    }

    /**
     * Determine if there are any legal plays left on the board.
     * (1) two cards whose values add to 11 
     * (2) three cards - a jack, a queen, and a king in any order.
     * @return true if there is a legal play left on the board;
     * false otherwise.
     */
    public boolean anotherPlayIsPossible() {
        return containsPairSum11(super.getCardIndexes()) || containsJQK(super.getCardIndexes());
    }
}
