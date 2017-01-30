/** <<< Code NOT Complete >>>
 * The Doll class is an extension of Toy
 */
public class Doll extends Toy
{
    private String eyeColor;    // The color of the Doll's eye
    private String hairColor;   // The color of the Doll's hair
    private String skinColor;   // The color of the Doll's skin

    /** <<< Code NOT Complete >>>
     * Construct a Doll object. Set the instance variables
     * to the content of their respective parameters.
     */
    public Doll(String name, int age, String eyeColor, String hairColor, String skinColor)
    {
        super(name, age);
        this.eyeColor = eyeColor; this.hairColor = hairColor; this.skinColor = skinColor;
    }

    /** <<< Code NOT Complete >>>
     * returns Doll: name, age, eyeColor, hairColor, and skinColor
     */
    public String toString()
    {
        return super.toString() + "I have " + this.eyeColor + " eyes, " + this.hairColor + " hair, and " + this.skinColor + " skin";
    }
}

