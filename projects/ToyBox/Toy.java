/** <<< Code Complete >>>
 * The Toy class will hold the name and age of a type of toy.
 * The blueprint for every type of toy.
 */
public abstract class Toy  {
    private String name = "";
    private int age = 0;

    public Toy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Toy " + name + " age " + age + " - ";
    }
}
