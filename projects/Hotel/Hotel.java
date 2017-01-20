
import java.util.ArrayList;
public class Hotel
{
    /**
     * each element in rooms[] corresponds to a room in the hotel;
     * if rooms[index] is null, the room is empty;
     * otherwise, it contains a reference to the Reservation for
     * that room, such that
     * rooms[index].getRoomNumber() returns index
     */
    private Reservation[] rooms;

    /**
     * contains names of guests who have not yet been
     * assigned a room because all rooms are full
     */
    private ArrayList<String> waitList;

    /**
     * Constructor - creates a Hotel with 'n' number of rooms
     */
    public Hotel(int nRooms)    {
        rooms = new Reservation[nRooms];
        waitList = new ArrayList<String>();
    }

    /**
     * if there are any empty rooms (rooms with no reservation),
     * then create a reservation for an empty room for the
     * specified guest and return the new Reservation;
     * otherwise, add the guest to the end of waitList
     * and return null
     */
    public Reservation requestRoom(String guestName)
    {
        for (int i=0; i<rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }

    /**
     * release the room associated with the room number of
     * parameter res, effectively canceling the reservation;
     *
     * if any names are stored in waitList, remove the first name
     * and create a Reservation for this person in the room
     * reserved by res; return that new Reservation;
     *
     * if waitList is empty, mark the room specified by res as empty
     * and return null
     *
     * precondition: res is a valid Reservation for some room
     *               in this hotel
     */
    public Reservation cancelAndReassign(Reservation res)
    {
        rooms[res.getRoomNumber()] = null;
        if (waitList.size() > 0) {
            rooms[res.getRoomNumber()] = new Reservation(waitList.get(0), res.getRoomNumber());
            waitList.remove(0);
        }
        return rooms[res.getRoomNumber()];
    }


    public String toString()    {
        String s = "";

        for (int i = 0; i < rooms.length; i++)
            s += rooms[i] + " ";

        s += "Waitlist: " + waitList;
        return s;
    }
}
