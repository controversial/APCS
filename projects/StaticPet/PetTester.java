/**
 * Tester for class Pet: This class works as is.
 * >>> DO NOT MODIFY THIS CODE <<<
 * Calls the Pet class to create 5 pets and prints
 * out the heaviest, lightest, and average weights
 *
 * -------- EXPECTED OUTPUT BELOW -------
 * Heaviest pet: null at 0 lbs.
 * Lighest pet: null at 0 lbs.
 * Average weight: 0.0 lbs.
 *
 * Heaviest pet: Rags at 60 lbs.
 * Lighest pet: Rags at 60 lbs.
 * Average weight: 60.0 lbs.
 *
 * Heaviest pet: Rags at 60 lbs.
 * Lighest pet: J-Lo at 10 lbs.
 * Average weight: 35.0 lbs.
 *
 * Heaviest pet: Chopper at 110 lbs.
 * Lighest pet: J-Lo at 10 lbs.
 * Average weight: 60.0 lbs.
 *
 * Heaviest pet: Chopper at 110 lbs.
 * Lighest pet: Mr. Belvedere at 1 lbs.
 * Average weight: 45.25 lbs.
 *
 * Heaviest pet: Chopper at 110 lbs.
 * Lighest pet: Mr. Belvedere at 1 lbs.
 * Average weight: 37.8 lbs.
 */
public class PetTester
{
    public static void main( String[] args)
    {
        Pet.stats();
        Pet p1 = new Pet("Rags", "dog", 60);
        Pet.stats();
        Pet p2 = new Pet("J-Lo", "cat", 10);
        Pet.stats();
        Pet p3 = new Pet("Chopper", "dog", 110);
        Pet.stats();
        Pet p4 = new Pet("Mr. Belvedere", "parrot", 1);
        Pet.stats();
        Pet p5 = new Pet("Tiger", "cat", 8);
        Pet.stats();
    }
}
