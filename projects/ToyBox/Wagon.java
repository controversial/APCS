/** <<< Code NOT Complete >>>
 * The Wagon class is an extension of Toy.
 */
public class Wagon extends Toy
{
    private String color;       // The color of the wagon
    private int numOfWheels;    // The number of wheels the wagon contains

    /** <<< Code NOT Complete >>>
     * Construct a Wagon object. Set the instance variables
     * to the content of their respective parameters.
     */
    public Wagon(String name, int age, String color, int numOfWheels) {
        super(name, age);
        this.color = color;
        this.numOfWheels = numOfWheels;
    }

    /** <<< Code NOT Complete >>>
     * returns Wagon: name, age, color and numberOfWheels
     */
    public String toString() {
        return super.toString() + "I am a " + this.color + " wagon and I have " + this.numOfWheels + " wheels.";
    }
}
