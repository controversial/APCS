/**
 * Class Pet:  >>> Code is NOT complete!!! <<<
 */
public class Pet {
    // Instance variables (non-static)
    private String name; // the name of the pet
    private String type; // what type of animal it is (dog, cat, cow...)
    private int weight; // the weight of the pet

    // Static variables to keep track of
    // heaviest, lightest, and average weights and names
    private static int heavyWeight = 0; // weight of heaviest pet
    private static String heavyName = null; // name of heaviest pet
    private static int lightWeight = 0; // weight of the lightest pet
    private static String lightName = null; // name of lightest pet
    private static int numPets = 0;  // total number of pets
    private static int totalWeight = 0;
    private static double aveWeight = 0; // average weight of all pets

    /**
     * constructs a pet with a name, type, and weight
     */
    public Pet(String n, String t, int w)    {
        //       >>>>> complete the code <<<<<<
        // initialize instance variables and call methods to
        // update heaviest, lightest, and average weights and names
        name = n;
        type = t;
        weight = w;

        numPets++;
        updateHeavy();
        updateLight();
        updateAve();
    }

    /**
     * checks if new pet is the heaviest and updates accordingly
     */
    public void updateHeavy()  {
        if (this.weight > heavyWeight) {
            heavyWeight = this.weight;
            heavyName = this.name;
        }
    }

    /**
     * checks if new pet is the lightest and updates accordingly
     */
    public void updateLight()   {
        if (this.weight < lightWeight || lightWeight == 0) {
            lightWeight = this.weight;
            lightName = this.name;
        }
    }

    /**
     * updates the average weight of all pets
     */
    public void updateAve()    {
        totalWeight += this.weight;
        aveWeight = (double) totalWeight / numPets;
    }

    /**
     * prints names and weights of the heaviest,
     * lightest, and the average weight of all pets
     */
    public static void stats() {
        if (numPets == 0) {
            System.out.println("No stats to report");
        } else {
            System.out.println("Heaviest pet: " + heavyName + " (" + heavyWeight + " pounds)");
            System.out.println("Lightest pet: " + lightName + " (" + lightWeight + " pounds)");
            System.out.println("Average weight: " + aveWeight);
        }
        System.out.println();
    }
}
