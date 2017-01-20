/***  <<<< THIS IS THE COMPLETE TESTER CLASS BELOW >>>
 * Output from Tester:
 *
 * Reserve Amanda [Amanda, 0]
 * Reserve Ben [Ben, 1]
 * Reserve Cate [Cate, 2]
 * Reserve Don null
 * Reserve Euginia null
 *
 * Hotel: [Amanda, 0] [Ben, 1] [Cate, 2] Waitlist: [Don, Euginia]
 *
 * Reassign Rm 2 [Don, 2]
 * Reassign Rm 0 [Euginia, 0]
 * Reassign Rm 1 null
 *
 * Hotel: [Euginia, 0] null [Don, 2] Waitlist: []
 *
 * Reserve Frank [Frank, 1]
 * Reserve Gabrielle null
 *
 * Hotel: [Euginia, 0] [Frank, 1] [Don, 2] Waitlist: [Gabrielle]
 ***/
public class TestHotel
{
    public static void main(String[] args)
    {
        Hotel hotel = new Hotel(3); // Hotel with 3 rooms (Small Hotel!!!)

        System.out.println("Reserve Amanda " + hotel.requestRoom("Amanda"));
        System.out.println("Reserve Ben " + hotel.requestRoom("Ben"));
        System.out.println("Reserve Cate " + hotel.requestRoom("Cate"));
        System.out.println("Reserve Don " + hotel.requestRoom("Don"));
        System.out.println("Reserve Euginia " + hotel.requestRoom("Euginia"));
        System.out.println();

        System.out.println("Hotel: " + hotel);
        System.out.println();

        System.out.println("Reassign Rm 2 " + hotel.cancelAndReassign(new Reservation("Cate", 2)));
        System.out.println("Reassign Rm 0 " + hotel.cancelAndReassign(new Reservation("Amanda", 0)));
        System.out.println("Reassign Rm 1 " + hotel.cancelAndReassign(new Reservation("Ben", 1)));
        System.out.println();

        System.out.println("Hotel: " + hotel);
        System.out.println();

        System.out.println("Reserve Frank " + hotel.requestRoom("Frank"));
        System.out.println("Reserve Gabrielle " + hotel.requestRoom("Gabrielle"));
        System.out.println();

        System.out.println("Hotel: " + hotel);
        System.out.println();
    }
}


