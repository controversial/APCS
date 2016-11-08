public class Auction
{
    public static void main(String[] args)
    {
        Item i1 = new Item(456746, 25.00); // create new item

        Bidder b1 = new Bidder("Jim", "jimbo90210"); // create bidder 1
        Bidder b2 = new Bidder("Sue", "SJM5491");  // create bidder 2
        Bidder b3 = new Bidder("Sam", "IAmSam001");  // create bidder 3

        System.out.println(i1);

        b1.placeBid(i1,26.00);
        System.out.println(i1);

        b2.placeBid(i1,28.00);
        System.out.println(i1);

        b3.placeBid(i1,33.00);
        System.out.println(i1);

        b2.placeBid(i1,30.00);
        System.out.println(i1);

        b1.placeBid(i1,34.00);
        System.out.println(i1);
    }
}
