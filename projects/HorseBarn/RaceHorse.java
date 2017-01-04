/**
 * <<< This Class is Complete >>>
 */
public class RaceHorse implements Horse
{
    private String name;
    private int weight;

    public RaceHorse(String n, int w) { name = n; weight = w; }
    public String getName() { return name; }
    public int getWeight() { return weight; }
    public String toString() { return name + "/" + weight; }
}
