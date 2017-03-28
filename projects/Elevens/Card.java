/**
 * Card.java
 *
 * Card represents a playing card.
 * 
 * BELOW IS THE EXPECTED OUTPUT FROM RUNNING THE MAIN METHOD
 * 
 *  rank: ace  suit: clubs  pointValue: 1
 *   toString: ace of clubs (point value = 1)
 * 
 *   rank: ace  suit: clubs  pointValue: 1
 *   toString: ace of clubs (point value = 1)
 * 
 *   rank: 6  suit: hearts  pointValue: 6
 *   toString: 6 of hearts (point value = 6)
 * 
 * aceClubs1.matches(aceClubs2) true
 * aceClubs1.matches(sixHearts) false
 */
public class Card {

    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;

    /**
     * Creates a new Card instance.
     * @param cardRank the rank of the card
     * @param cardSuit the suit of the card
     * @param cardPointValue the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        // <<<Complete the code>>>
        //initializes a new Card with the given rank, suit, and point value
        this.suit = cardSuit;
        this.rank = cardRank;
        this.pointValue = cardPointValue;
    }

    /**
     * Accesses this Card's rank.
     * @return rank.
     */
    public String rank() {
        return this.rank;
    }

    /**
     * Accesses this Card's suit.
     * @return Card's.
     */
    public String suit() {
        return this.suit;
    }

    /**
     * Accesses this Card's point value.
     * @return point value.
     */
    public int pointValue() {
        return this.pointValue;
    }

    /** 
     * Compare this card with otherCard.
     * @param otherCard the other card to compare to this
     * @return true if rank, suit, and pointValue are equal
     *         false otherwise.
     */
    public boolean matches(Card otherCard) {
        return (
            this.pointValue == otherCard.pointValue() &&
            this.rank.equals(otherCard.rank()) &&
            this.suit.equals(otherCard.suit())
        );
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     *
     * @return a String containing the rank, suit,
     *         and point value of the card.
     */
    public String toString() {
        return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";
    }

    /** --------------------- The Main Method is Complete -------------------
     * The main method in this class checks the Card operations for consistency.
     */
    public static void main(String[] args) {
        Card aceClubs1 = new Card("ace", "clubs", 1);
        Card aceClubs2 = new Card("ace", "clubs", 1);
        Card sixHearts = new Card("6", "hearts", 6);

        System.out.print("  rank: " + aceClubs1.rank());
        System.out.print("  suit: " + aceClubs1.suit());
        System.out.println("  pointValue: " + aceClubs1.pointValue());
        System.out.println("  toString: " + aceClubs1);
        System.out.println();

        System.out.print("  rank: " + aceClubs2.rank());
        System.out.print("  suit: " + aceClubs2.suit());
        System.out.println("  pointValue: " + aceClubs2.pointValue());
        System.out.println("  toString: " + aceClubs2);
        System.out.println();

        System.out.print("  rank: " + sixHearts.rank());
        System.out.print("  suit: " + sixHearts.suit());
        System.out.println("  pointValue: " + sixHearts.pointValue());
        System.out.println("  toString: " + sixHearts);
        System.out.println();

        System.out.println("aceClubs1.matches(aceClubs2) " + aceClubs1.matches(aceClubs2));
        System.out.println("aceClubs1.matches(sixHearts) " + aceClubs1.matches(sixHearts));
    }
}
