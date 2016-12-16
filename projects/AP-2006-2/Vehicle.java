/**
 * Created by ltaylor on 12/16/2016.
 */
public class Vehicle extends TaxableItem {
    private int cost;
    private int dealerMarkup;

    public Vehicle(int cost, int dealerMarkup, double taxRate) {
        super(taxRate);
        this.cost = cost;
        this.dealerMarkup = dealerMarkup;
    }

    public void changeMarkup(int dealerMarkup) {
        this.dealerMarkup = dealerMarkup;
    }

    public double getListPrice() {
        return this.cost + this.dealerMarkup;
    }
}
