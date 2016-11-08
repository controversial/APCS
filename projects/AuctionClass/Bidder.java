/** <<< CODE NOT COMPLETE >>>
 *  Class Bidder
 *  a Bidder can bid on an item
 */
public class Bidder
{
    private String name;
    private String userID;

    /**
     *  Construct a Bidder
     */
    public Bidder(String nm, String ID)  {
        name = nm; userID = ID;
    }

    /** <<< complete the code >>>
     * write the placeBid method which calls the Bid
     * method in the Item class
     */
    public void placeBid(Item i, double amt) {
        i.bid(this, amt);
    }

    public String toString() {
        return this.name;
    }
}
