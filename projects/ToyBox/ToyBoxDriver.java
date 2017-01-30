/** <<< CODE COMPLETE >>>
 * The ToyBox class collects all the objects in an arrayList.
 * Objects are either added or removed.
 *
 * <<<<<<<< OUTPUT OF ToyBoxDriver is below >>>>>>>>>>
 *
 *  toys1:
 * Toy Cher age 15 -  I have blue eyes blonde hair, and pink skin.
 * Toy Barbara age 16 -  I have brown eyes brown hair, and tan skin.
 * Toy Smurfette age 17 -  I have blue eyes blonde hair, and blue skin.
 * Toy Chester age 4 -  I am a black wagon and I have 4 wheels.
 * Toy Clark age 16 -  I am a white wagon and I have 6 wheels.
 *
 *  toys1:
 * Toy Barbara age 16 -  I have brown eyes brown hair, and tan skin.
 * Toy Smurfette age 17 -  I have blue eyes blonde hair, and blue skin.
 * Toy Clark age 16 -  I am a white wagon and I have 6 wheels.
 *
 *  toys2:
 * Toy Kent age 16 -  I am a white wagon and I have 6 wheels.
 * Toy Donald age 4 -  I am a black wagon and I have 6 wheels. I can go 80 miles per hour.
 * Toy Duck age 16 -  I am a blue wagon and I have 8 wheels. I can go 100 miles per hour.
 * Toy Trump age 16 -  I am a red wagon and I have 10 wheels. I can go 120 miles per hour.
 *
 *  toys1:
 * Toy Barbara age 16 -  I have brown eyes brown hair, and tan skin.
 * Toy Clark age 16 -  I am a white wagon and I have 6 wheels.
 *
 *  toys2:
 * Toy Kent age 16 -  I am a white wagon and I have 6 wheels.
 * Toy Donald age 4 -  I am a black wagon and I have 6 wheels. I can go 80 miles per hour.
 * Toy Duck age 16 -  I am a blue wagon and I have 8 wheels. I can go 100 miles per hour.
 * Toy Trump age 16 -  I am a red wagon and I have 10 wheels. I can go 120 miles per hour.
 * Toy Smurfette age 17 -  I have blue eyes blonde hair, and blue skin.
 *
 */

public class ToyBoxDriver
{
    public static void main (String args[])
    {
        ToyBox toys1 = new ToyBox();
        ToyBox toys2 = new ToyBox();

        Doll Cher = new Doll("Cher", 15, "blue", "blonde", "pink");
        Doll Barbara = new Doll("Barbara", 16, "brown", "brown", "tan");
        Doll Smurfette = new Doll("Smurfette", 17, "blue", "blonde", "blue");
        Wagon Chester = new Wagon("Chester", 4, "black", 4);
        Wagon Clark = new Wagon("Clark", 16, "white", 6);
        Wagon Kent = new Wagon("Kent", 16, "white", 6);
        RaceCar Donald = new RaceCar("Donald", 4, "black", 6, 80);
        RaceCar Duck = new RaceCar("Duck", 16, "blue", 8, 100 );
        RaceCar Trump = new RaceCar("Trump", 16, "red", 10, 120);

        toys1.addToy(Cher);
        toys1.addToy(Barbara);
        toys1.addToy(Smurfette);
        toys1.addToy(Chester);
        toys1.addToy(Clark);
        System.out.println("\n toys1:" + toys1);

        toys1.removeToy(Cher);
        toys1.removeToy(Chester);
        System.out.println("\n toys1:" + toys1);

        toys2.addToy(Kent);
        toys2.addToy(Donald);
        toys2.addToy(Duck);
        toys2.addToy(Trump);
        System.out.println("\n toys2:" + toys2);

        toys1.moveToy(Smurfette, toys2);
        System.out.println("\n toys1:" + toys1);
        System.out.println("\n toys2:" + toys2);
    }
}
