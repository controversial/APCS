/**
 * <<< This Class is Complete >>>
 *
 * Below is the complete output...
 *
 * [Trigger/1340, null, Silver/1210, Lady/1575, null, Patches/1350, Duke/1410]
 * Trigger in 0
 * Silver in 2
 * Coco in -1
 *
 * Before: [Trigger/1340, null, Silver/1210, null, null, Patches/1350, Duke/1410]
 * After:  [Trigger/1340, Silver/1210, Patches/1350, Duke/1410, null, null, null]
 *
 */
public class HorseRunner
{
    public static void main(String[] args)
    {
        Horse[] horses = {new RaceHorse("Trigger", 1340), null,
                new RaceHorse("Silver", 1210), new RaceHorse("Lady", 1575),
                null, new RaceHorse("Patches", 1350), new RaceHorse("Duke", 1410)};

        HorseBarn sweetHome = new HorseBarn(horses);
        System.out.println(sweetHome);

        System.out.println("Trigger in " + sweetHome.findHorseSpace("Trigger"));
        System.out.println("Silver in " + sweetHome.findHorseSpace("Silver"));
        System.out.println("Coco in " + sweetHome.findHorseSpace("Coco"));
        System.out.println();

        horses[3] = null;
        sweetHome = new HorseBarn(horses);
        System.out.println("Before: " + sweetHome);
        sweetHome.consolidate();
        System.out.println("After:  " + sweetHome);
    }
}
