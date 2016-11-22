
/** <<< CODE NOT COMPLETE >>>
 * Constructs a fraction with a numerator and a denominator
 */
public class Rational
{
    private int numerator;
    private int denominator;

    /**
     * constructs fraction with specified numerator
     * and denominator.
     */
    Rational(int num, int den) {
        numerator = num;
        denominator = den;
        reduce(); // reduces fraction to lowest terms
    }


    /**
     * returns numerator
     */
    public int getNumerator() {
        return numerator;
    }


    /**
     * returns denominator
     */
    public int getDenominator() {
        return denominator;
    }


    /**  <<< CODE NOT COMPLETE >>>
     * Returns a new Rational which is the sum of
     * this + r reduced to lowest terms
     */
    public Rational add(Rational r) {
        return new Rational(this.numerator * r.denominator + r.numerator * this.denominator, r.denominator * this.denominator);
    }


    /**  <<< CODE NOT COMPLETE >>>
     * Returns a new Rational which is the difference of
     * this - r reduced to lowest terms
     */
    public Rational subtract(Rational r) {
        return new Rational(this.numerator * r.denominator - r.numerator * this.denominator, r.denominator * this.denominator);
    }


    /**   <<< CODE NOT COMPLETE >>>
     * Returns a new Rational which is the product of
     * this * r reduced to lowest terms
     */
    public Rational multiply(Rational r) {
          return new Rational(this.numerator * r.numerator, this.denominator * r.denominator);
    }

    /**   <<< CODE NOT COMPLETE >>>
     * Returns a new Rational which is the quotient of
     * this / r reduced to lowest terms
     */
    public Rational divide(Rational r) {
          return new Rational(this.numerator * r.denominator, this.denominator * r.numerator);
    }


    /**  <<< CODE NOT COMPLETE >>>
     * Reduces fraction to lowest terms
     * and ensures denominator > 0
     */
    private void reduce() {
        // Find GCF
        for (int i=Math.max(this.numerator, this.denominator); i>0; i--)
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                this.numerator /= i; this.denominator /= i;
                return;
            }
    }


    /**  <<< CODE NOT COMPLETE >>>
     * Returns fraction written as a String
     */
    public String toString() {
          return this.getNumerator() + "/" + this.getDenominator();
    }
}