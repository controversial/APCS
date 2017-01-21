/**
 * This class is designed to store and manipulate a list of words.
 *
 * You need to complete two methods:
 *      (a) numWordsOfLength
 *      (b) removeWordsOfLength
 */
import java.util.*;
public class WordList {
    private ArrayList<String>myList;

    public WordList() {  // Constructor
        myList = new ArrayList<String>();
    }

    public void add(String word) { myList.add(word);  }

    public String toString() { return myList.toString(); }

    /*** <<< Complete for part (a) >>>
     * postcondition: returns the number of words in this WordList that
     * are exactly len letters long.
     */
    public int numWordsOfLength(int len)
    {
        int count = 0;

        for (String i : myList)
            if (i.length() == len) count++;

        return count;
    }

    /*** <<<< Complete for part (b) >>>
     * postcondition: all words that are exactly len letters long
     * have been removed from this WordList, with the order of the
     * remaining words unchanged
     */
    public void removeWordsOfLength(int len)
    {
        for (int i=0; i<myList.size(); i++) {
            if (myList.get(i).length() == len) {
                myList.remove(i);
                i--;  // Adjust for removal
            }
        }
    }
}
