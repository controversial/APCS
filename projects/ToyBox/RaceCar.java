/** <<< Code NOT Complete >>>
 * The RaceCar class is an extension of Wagon
 */
public class RaceCar extends Wagon
{
    private int maxSpeed;

    /** <<< Code NOT Complete >>>
     * Construct a RaceCar object. Set the instance variables
     * to the content of their respective parameters.
     */
    public RaceCar(String name, int age, String color, int numOfWheels, int maxSpeed)
    {
        super(name, age, color, numOfWheels);
        this.maxSpeed = maxSpeed;
    }

    /** <<< Code NOT Complete >>>
     * returns RaceCar: name, age, color, numberOfWheels and maxSpeed
     */
    public String toString() {
        return super.toString() + " I can go " + this.maxSpeed + " miles per hour";
    }
}
