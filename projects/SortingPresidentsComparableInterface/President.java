/**
 * President class has first name, last name, and birthday as month, day and year.
 *    <<< this code is Not complete >>>
 */
public class President implements Comparable {
    private String firstName;
    private String lastName;
    private String month;
    private int day;
    private int year;

    public President(String f, String l, String m, int d, int y)  {
        firstName = f;
        lastName = l;
        month = m;
        day = d;
        year = y;
    }

    /**
     * <<< write a toString method >>>
     * returns a presidents name, birthday month, day, and year.
     */
    public String toString() {
        return this.firstName + " " + this.lastName + ": " + this.month + " " + this.day + ", " + this.year;
    }

    /**
     * <<< write a compareTo method >>>
     * Compares two presidents by birthday: month and day (not year)
     * If two presidents have the same birthday then last name is used
     * to compare.
     */
    public int compareTo(Object other) {
        String months="January February March April May June July August September October November December";

        if (months.indexOf(this.month) > months.indexOf(((President) other).getMonth())) {
            return 1;
        } else if (months.indexOf(this.month) < months.indexOf(((President) other).getMonth())) {
            return -1;
        } else {
            // Move to day
            if (this.day > ((President) other).getDay()) {
                return 1;
            } else if (this.day < ((President) other).getDay()) {
                return -1;
            } else {
                // Move to last name
                return this.lastName.compareTo(((President) other).getLastName());
            }
        }
    }

    /*** Add other methods if needed. ***/

    public String getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public String getLastName() {
        return this.lastName;
    }
}
