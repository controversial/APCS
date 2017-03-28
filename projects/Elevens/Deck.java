import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 * initialize, shuffle, deal, and check if empty.
 *      
 * BELOW IS THE EXPECTED OUTPUT FROM RUNNING THE MAIN METHOD
 *      
 * shuffle is not yet implemented
 * size = 6
 * jack of clubs (point value = 11)
 * jack of hearts (point value = 11)
 * queen of clubs (point value = 12)
 * queen of hearts (point value = 12)
 * king of clubs (point value = 13)
 * king of hearts (point value = 13)
 *
 * isEmpty: false
 * 
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new Deckinstance.
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++) {
            for (int i2 = 0; i2 < ranks.length; i2++) {
                cards.add(new Card(ranks[i2], suits[i], values[i2]));
            }
        }
        this.size = cards.size();
        shuffle();
    }

    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return this.cards.size() == 0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return this.size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        for (int k = this.size - 1; k > 0; k--) {
            int r = (int) Math.floor(Math.random() * (k + 1));
            Card temp = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, temp);
        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *           previously dealt.
     */
    public Card deal() {
        if (isEmpty()) {
            return null;
        }
        size--;
        Card c = cards.get(size);
        return c;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    public String toString() {
        String rtn = "size = " + size + "\n";

        for (int k = 0; k < cards.size(); k++) {
            rtn = rtn + cards.get(k);
            rtn = rtn + "\n";
        }
        return rtn;
    }
    
    /** --------------------- The Main Method is Complete -------------------
     * The main method in this class checks the Deck operations for consistency.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"clubs", "hearts"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d);
        System.out.println("isEmpty: " + d.isEmpty());
    }
}
