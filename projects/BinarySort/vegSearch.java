import java.util.Arrays;

/** <<<  This class is NOT complete  >>>
 * Complete the find method which performs a binary search on
 * an array of sorted vegetables.
 *
 * OUTPUT FROM THIS TESTER:
 *
 * search for LEEK:4629
 * search for BROCCOLI:4060
 * search for PIZZA:-1
 * search for TURNIPS:4810
 */
public class vegSearch {

    /**  <<< This method is NOT complete >>>
     * Performs a binary search on an array of sorted vegetables.
     * The idea is to look at the element in the middle. If the item is
     * equal to that, the search is finished. If the item is less than
     * the middle element, do a binary search on the first half.
     * If it's greater, do a binary search of the second half.
     *
     * If the vegetable is found the corresponding number is returned.
     * If NOT found return -1;
     */
    public static int find(vegetable[] vegArray, String veg) {
        int low = 0; // start index of array
        int high = vegArray.length-1; // end index of array
        int mid; // mid point of array
        while (true) {
            if (high < low) return -1;
            mid = (low + high) / 2;
            if (vegArray[mid].getName().equals(veg)) return vegArray[mid].getNum();
            if (veg.compareTo(vegArray[mid].getName()) > 0) low = mid + 1;
            else high = mid - 1;
        }
    }


    /***
     * The main method is complete
     ***/
    public static void main(String[] args)
    {
        /**
         * array of supermarket Price Look-Up codes
         * and vegetable names
         */
        vegetable[] veg = new vegetable[33];
        veg[0] = new vegetable(4539, "BEETS");
        veg[1] = new vegetable(4567, "BROCCOLFLOWER");
        veg[2] = new vegetable(4060, "BROCCOLI");
        veg[3] = new vegetable(4550, "BRUSSEL SPROUTS");
        veg[4] = new vegetable(4069, "CABBAGE GREEN");
        veg[5] = new vegetable(4554, "CABBAGE RED");
        veg[6] = new vegetable(4555, "CABBAGE SAVOY");
        veg[7] = new vegetable(4559, "CARDONI");
        veg[8] = new vegetable(4094, "CARROTS BUNCH");
        veg[9] = new vegetable(4079, "CAULIFLOWER");
        veg[10] = new vegetable(4577, "CELERY");
        veg[11] = new vegetable(4909, "CHIVES");
        veg[12] = new vegetable(4078, "CORN");
        veg[13] = new vegetable(4081, "EGGPLANT");
        veg[14] = new vegetable(4515, "FENNEL");
        veg[15] = new vegetable(4606, "FIDDLE HEAD FERNS");
        veg[16] = new vegetable(4608, "GARLIC");
        veg[17] = new vegetable(4609, "GARLIC ELEPHANT");
        veg[18] = new vegetable(4625, "HORSERADISH ROOT");
        veg[19] = new vegetable(4628, "KOHLRABI");
        veg[20] = new vegetable(4629, "LEEK");
        veg[21] = new vegetable(4650, "MUSHROOMS PRTBLLO");
        veg[22] = new vegetable(4651, "MUSHROOMS SHITAKE");
        veg[23] = new vegetable(4085, "MUSHROOMS WHITE");
        veg[24] = new vegetable(4655, "OKRA");
        veg[25] = new vegetable(4899, "PARSLEY EA.FULL BUNCH");
        veg[26] = new vegetable(4902, "PARSLEY FLAT");
        veg[27] = new vegetable(4596, "PICKLES");
        veg[28] = new vegetable(4547, "RAPINI");
        veg[29] = new vegetable(4745, "RHUBARB");
        veg[30] = new vegetable(4747, "RUTABAGA");
        veg[31] = new vegetable(4090, "SPINACH");
        veg[32] = new vegetable(4810, "TURNIPS");

        System.out.println("search for LEEK:" + find(veg,"LEEK"));
        System.out.println("search for BROCCOLI:" + find(veg,"BROCCOLI"));
        System.out.println("search for PIZZA:" + find(veg,"PIZZA"));
        System.out.println("search for TURNIPS:" + find(veg,"TURNIPS"));
    }
}
