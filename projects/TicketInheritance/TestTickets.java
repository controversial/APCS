public class TestTickets {
    public static void main(String[] args)
    {
        System.out.println("WalkUp Tickets");
        System.out.println("0 days in advance: " + new WalkUp());
        System.out.println();
        System.out.println("Advance Tickets");
        System.out.println("5 days in advance: " + new Advance(5));
        System.out.println("9 days in advance: " + new Advance(9));
        System.out.println("10 days in advance: " + new Advance(10));
        System.out.println("20 days in advance: " + new Advance(20));
        System.out.println();
        System.out.println("Student Advance Tickets");
        System.out.println("5 days in advance: " + new StudentAdvance(5));
        System.out.println("9 days in advance: " + new StudentAdvance(9));
        System.out.println("10 days in advance: " + new StudentAdvance(10));
        System.out.println("20 days in advance: " + new StudentAdvance(20));
        System.out.println();
    }
}
