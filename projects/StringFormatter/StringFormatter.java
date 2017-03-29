/**** Copy the following into BlueJ and complete the three methods indicated. ***/
import java.util.List;
import java.util.ArrayList;

public class StringFormatter {
    /**
     * ---------------- PART A ---------------
     * Return the total number of letters in the words in
     * parameter wordList.
     * For example, if the variable wordList is ["A", "frog", "is"]
     * then returns 7.
     * You may assume that all words in wordList consist of one or
     * more letters
     **/
    public static int totalLetters(List<String> wordList) {
        int sum = 0;
        for (String word : wordList) sum += word.length();
        return sum;
    }

    /**
     * ---------------- PART B ---------------
     * Return the basic gap width as defined earlier.
     **/
    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
    }


    /**
     * The method below is complete
     ***/
    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        return formattedLen - totalLetters(wordList) -
                basicGapWidth(wordList, formattedLen) * (wordList.size() - 1);
    }


    /**
     * ---------------- PART C ---------------
     * Return the formatted string as defined earlier.
     **/
    public static String format(List<String> wordList, int formattedLen) {
        int extras = leftoverSpaces(wordList, formattedLen);
        int gapSize = basicGapWidth(wordList, formattedLen);

        String out = "";
        for (String word : wordList) {
            out += word;
            for (int i = 0; i < gapSize; i++) out += " ";
            // If we have some of our extra spaces left, apply them
            if (extras > 0) {
                out += " ";
                extras--;
            }
        }
        if (wordList.size() > 0) out = out.trim();
        return out;
    }
}