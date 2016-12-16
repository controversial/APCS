/**
 * All tickets have a serial number and a price.
 */
public abstract class Ticket {
    private int serialNumber;  // unique ticket id number
    private static int nextSerialNumber = 0;

    public Ticket() {
        serialNumber = nextSerialNumber;
        nextSerialNumber++;
    }

    // returns the price for this ticket
    public abstract double getPrice();

    // returns a string with information about the ticket
    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
}
