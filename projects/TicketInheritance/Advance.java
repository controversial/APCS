public class Advance extends Ticket {
    private int daysInAdvance;

    public Advance(int daysInAdvance) {
        this.daysInAdvance = daysInAdvance;
    }

    public double getPrice() {
        return daysInAdvance >= 10 ? 30 : 40;
    }
}
