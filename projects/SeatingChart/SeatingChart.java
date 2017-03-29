/*********************************************************
 * Below is the expected output:
 *
 * [Karen, 3][Lester, 1][Glen, 2][Danny, 3]
 * [Liz, 1][Henry, 5][Fran, 6][null]
 * [Paul, 4][Renee, 9][David, 1][null]
 *
 * Removed = 3
 * [Karen, 3][Lester, 1][Glen, 2][Danny, 3]
 * [Liz, 1][null][null][null]
 * [Paul, 4][null][David, 1][null]
 **********************************************************/
import java.util.Arrays;
import java.util.List;

public class SeatingChart
{
    /** seats[r][c] represents the Student in row r and column c in the classroom. */
    private Student[][] seats;

    /** Creates a seating chart with the given number of rows and columns from the students in
     *  studentList. Empty seats in the seating chart are represented by null.
     *  @param rows the number of rows of seats in the classroom
     *  @param cols the number of columns of seats in the classroom
     *  Precondition: rows > 0; cols > 0;
     *                rows * cols >= studentList.size()
     *  Postcondition:
     *     - Students appear in the seating chart in the same order as they appear
     *       in studentList, starting at seats[0][0].
     *     - seats is filled column by column from studentList, followed by any
     *       empty seats (represented by null).
     *     - studentList is unchanged.
     */
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        seats = new Student[rows][cols];
        int listIndex = 0;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if (listIndex < studentList.size()) {
                    seats[row][col] = studentList.get(listIndex);
                    listIndex++;
                }
            }
        }
    }

    /** Removes students who have more than a given number of absences from the
     *  seating chart, replacing those entries in the seating chart with null
     *  and returns the number of students removed.
     *  @param allowedAbsences an integer >= 0
     *  @return number of students removed from seats
     *  Postcondition:
     *    - All students with allowedAbsences or fewer are in their original positions in seat
     *    - No student in seats has more than allowedAbsences absences.
     *    - Entries without students contain null.
     */
    public int removeAbsentStudents(int allowedAbsences) {
        int numRemoved = 0;
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                Student s = seats[row][col];
                if (s != null && s.getAbsenceCount() > allowedAbsences) {
                    seats[row][col] = null;
                    numRemoved++;
                }
            }
        }
        return numRemoved;
    }

    /** complete the toString method to return the seating chart
     * 2-Dimentional array as a grid.
     */
    public String toString() {
        String out = "";
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) out += "[" + seats[row][col] + "]";
            out += "\n";
        }
        return out;
    }

    /********************** Tester Is Complete *********************/
    public static void main(String[] args)
    {
        Student[] students = {
                new Student("Karen", 3),
                new Student("Liz", 1),
                new Student("Paul", 4),
                new Student("Lester", 1),
                new Student("Henry", 5),
                new Student("Renee", 9),
                new Student("Glen", 2),
                new Student("Fran", 6),
                new Student("David", 1),
                new Student("Danny", 3)};

        List<Student> roster = Arrays.asList(students);
        SeatingChart chart = new SeatingChart(roster, 3, 4);
        System.out.println(chart);
        System.out.println("Removed = " + chart.removeAbsentStudents(4));
        System.out.println(chart);
    }
}
