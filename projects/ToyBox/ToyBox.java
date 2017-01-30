/** <<< Code NOT Complete >>>
 * The ToyBox class collects all the objects in an arrayList.
 * Objects are either added or removed.
 */
import java.util.ArrayList;

public class ToyBox
{
    private ArrayList<Toy> box = new ArrayList<Toy>();

    /** <<< Code NOT Complete >>>
     * adds a toy to the ArrayList
     */
    public void addToy(Toy aToy) {
        box.add(aToy);
    }

    /** <<< Code NOT Complete >>>
     * removes a toy from the ArrayList
     */
    public void removeToy(Toy aToy) {
        box.remove(aToy);
    }

    /** <<< Code NOT Complete >>>
     * moves aToy from this ToyBox to other ToyBox
     */
    public void moveToy(Toy aToy, ToyBox other) {
        this.removeToy(aToy);
        other.addToy(aToy);
    }

    /** <<< Code NOT Complete >>>
     * returns list of all toys in toy box
     */
    public String toString() {
        String out = "";
        for (Toy toy : this.box) {
            out += "\n" + toy;
        }
        return out;
    }
}
