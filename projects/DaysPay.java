import javax.swing.JOptionPane; // import a package for user input

public class DaysPay
{
    /**
     * Write a method called calculatePay.
     *
     * calculatePay should take 3 input parameters and return the total days pay
     *   input: int hours, double payRate, and String dayOfWeek
     *   return: <double totalPay>
     *
     * Total days pay is calculated as follows:
     *
     *   employees get paid at the normal hourly rate for the first 8 hours
     *
     *   they get paid an overtime rate of 1 and 1/2 times normal pay for
     *   hours worked over 8
     *
     *   they get paid 2 times the normal rate for all hours worked on Saturday or Sunday
     *   (overtime does not apply to Saturday or Sunday)
     **/


    /***  <<< complete the code for method calculatePay >>>  ***/


    public static double calculatePay(int hours, double payRate, String dayOfWeek) {
        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday"))
            return payRate * 2 * hours;

        else if (hours >= 8)
            return (payRate * 8) + (1.5 * payRate * (hours-8));
        else
            return payRate * hours;
    }

    // This main method is complete
    public static void main(String[] args)
    {
        String name = "";
        String day = "";
        int hours = 0;
        double payRate = 0;

        hours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours did you work? "));
        payRate = Double.parseDouble(JOptionPane.showInputDialog(null, "What is you hourly pay rate? "));
        day = JOptionPane.showInputDialog(null, "What day did you work? ");

        System.out.println("You worked " + hours + " hours on a " + day + ".");
        System.out.println("Your rate of pay is $" + payRate + " per hour.");
        System.out.println("Total pay is " + calculatePay(hours,payRate,day));

    }
} //class
