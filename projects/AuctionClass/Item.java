/** <<< CODE NOT COMPLETE >>>
 *  Item can be Bid on by a bidder
 *  Keeps track of highest two bids and number of bids
 */
public class Item
{
    private int numberOfBids = 0;
    private int itemNumber;
    private double price;  // current amount of highest bid
    private Bidder highBidder = null;  // highest bidder

    // second highest bidder (in case high
    // bidder backs out of deal)
    private Bidder backBidder = null;

    /**
     * construct an item with an initial price
     */
    Item(int num, double p) {
        itemNumber = num;
        price = p;
    }

    /**
     * <<< complete the code >>>
     *   1) Increments numbers of bids
     *   2) If bid is greater than current price
     *      than highBidder becomes current bidder,
     *      and backBidder is previous highBidder.
     */
    public void bid(Bidder b, double bid)
    {
        numberOfBids++;
        if (bid > price) {
            backBidder = highBidder;
            highBidder = b;
            price = bid;
        }
    }

    /**
     *  <<< complete the code >>>
     * returns formatted string with information about item:
     * item Number, price, number of bids, names of highest
     * and second highest bidders
     */
    public String toString() {
        if (numberOfBids == 0) return "No bids yet.";
        return "Item #" + itemNumber + ". Out of " + numberOfBids + "bids, " + price + "is the highest" +
               " (top bidder: " + highBidder + ", second bidder: " + backBidder + ").";
    }
}
