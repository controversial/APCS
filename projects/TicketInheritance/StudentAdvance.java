public class StudentAdvance extends Advance {

    public StudentAdvance(int daysInAdvance) {
        super(daysInAdvance);
    }

    public double getPrice() {
        return super.getPrice() / 2;
    }
}
