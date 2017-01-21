/***             <<< This code is complete >>>
 *  Below is the output:
 *
 * [cat, mouse, frog, dog, dog]
 * length 4 = 1
 * length 3 = 3
 * length 2 = 0
 *
 * Remove words of length 4
 * [cat, mouse, dog, dog]
 *
 * Remove words of length 3
 * [mouse]
 *
 * Remove words of length 3
 * [mouse]
 */
import java.util.*;

public class WordListTester
{
    public static void main(String[] args)
    {
        WordList w = new WordList();
        w.add("cat");
        w.add("mouse");
        w.add("frog");
        w.add("dog");
        w.add("dog");
        System.out.println(w); //Outputs: [cat, mouse, frog, dog, dog]
        System.out.println("length 4 = " + w.numWordsOfLength(4)); //Outputs: length 4 = 1
        System.out.println("length 3 = " + w.numWordsOfLength(3)); //Outputs: length 3 = 3
        System.out.println("length 2 = " + w.numWordsOfLength(2)); //Outputs: length 2 = 0

        System.out.println("\nRemove words of length 4");
        w.removeWordsOfLength(4);
        System.out.println(w);  //Outputs: [cat, mouse, dog, dog]

        System.out.println("\nRemove words of length 3");
        w.removeWordsOfLength(3);
        System.out.println(w); //Outputs: [mouse]

        System.out.println("\nRemove words of length 3");
        w.removeWordsOfLength(2);
        System.out.println(w); //Outputs: [mouse]
    }
}


