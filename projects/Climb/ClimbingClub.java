/***
 * expected output
 *
 * Climb List: []
 * Number of peaks = 0
 *
 * Climb List: [Monadnock 274]
 * Number of peaks = 1
 *
 * Climb List: [Monadnock 274, Whiteface 301]
 * Number of peaks = 2
 *
 * Climb List: [Algonquin 225, Monadnock 274, Whiteface 301]
 * Number of peaks = 3
 *
 * Climb List: [Algonquin 225, Monadnock 274, Monadnock 344, Whiteface 301]
 * Number of peaks = 3
 *
 * Climb List: [Algonquin 225, Marcy 356, Monadnock 274, Monadnock 344, Whiteface 301]
 * Number of peaks = 4
 *
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
     * Guaranteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    { climbList = new ArrayList<ClimbInfo>(); }

    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
        Collections.sort(climbList);
    }

    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames() {
        ArrayList<String> names = new ArrayList<String>();
        for (ClimbInfo climb : climbList) {
            if (!names.contains(climb.getName())) names.add(climb.getName());
        }
        return names.size();
    }

    public String toString()
    {
        return climbList.toString();
    }
    /**************************************************************/
    /*** The main method below is complete and tests this class ***/
    /**************************************************************/
    public static void main(String[] args)
    {
        ClimbingClub hikerClub = new ClimbingClub();
        System.out.println("Climb List: " + hikerClub);
        System.out.println("Number of peaks = " + hikerClub.distinctPeakNames());
        System.out.println();
        hikerClub.addClimb("Monadnock", 274);
        System.out.println("Climb List: " + hikerClub);
        System.out.println("Number of peaks = " + hikerClub.distinctPeakNames());
        System.out.println();
        hikerClub.addClimb("Whiteface", 301);
        System.out.println("Climb List: " + hikerClub);
        System.out.println("Number of peaks = " + hikerClub.distinctPeakNames());
        System.out.println();
        hikerClub.addClimb("Algonquin", 225);
        System.out.println("Climb List: " + hikerClub);
        System.out.println("Number of peaks = " + hikerClub.distinctPeakNames());
        System.out.println();
        hikerClub.addClimb("Monadnock", 344);
        System.out.println("Climb List: " + hikerClub);
        System.out.println("Number of peaks = " + hikerClub.distinctPeakNames());
        System.out.println();
        hikerClub.addClimb("Marcy", 356);
        System.out.println("Climb List: " + hikerClub);
        System.out.println("Number of peaks = " + hikerClub.distinctPeakNames());
    }
}
