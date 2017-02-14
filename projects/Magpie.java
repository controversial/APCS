/**
 * A program to carry on conversations with a human user.
 */
import java.util.Scanner;
public class Magpie
{
    /**
     * Gives a response to a user statement
     *
     * @param statement - the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        if (statement.length() == 0)
        {
            return "Say something, please.";
        }

        if (findKeyword(statement, "no") >= 0)
        {
            return "Why so negative?";
        }

        if (findKeyword(statement, "mother") >= 0
                || findKeyword(statement, "father") >= 0
                || findKeyword(statement, "sister") >= 0
                || findKeyword(statement, "brother") >= 0)
        {
            return "Tell me more about your family.";
        }

        /*** --------------- Activity 2 --------------
         * Add new responses here.
         *
         * 1. Add response for: "cat" or "dog"
         * 2. Add response for: teacher name "Haas"
         * 3. Handle empty string
         *
         ***/

        /** <<< Add your code for Activity 2 here >>> **/

        if (findKeyword(statement, "dog") >= 0 || findKeyword(statement, "cat") >= 0) {
            return "Tell me more about your pets.";
        }
        if (findKeyword(statement, "Haas") >= 0) {
            return "He sounds like a good teacher.";
        }
        if (statement.trim().length() == 0) {
            return "Say something, please.";
        }

        /***
         * Responses that Transform Statements
         */
        if (findKeyword(statement, "I want to") >= 0)
        {
            return transformIWantToStatement(statement);
        }

        if (findKeyword(statement, "I want") >= 0)
        {
            return transformIWantStatement(statement);
        }

        if (findKeyword(statement, "you") != -1 &&
                findKeyword(statement, "you") < findKeyword(statement, "me"))
        {
            return transformYouMeStatement(statement);
        }

        if (findKeyword(statement, "I") != -1 &&
                findKeyword(statement, "I") < findKeyword(statement, "you"))
        {
            return transformIYouStatement(statement);
        }

        return getRandomResponse();
    }

    /*** --------------- Activity 2 --------------
     * Pick a random response to use if nothing else fits.
     * @return a random string from the following options:
     *    "Interesting, tell me more."
     *    "Hmmm."
     *    "Do you really think so?"
     *    "You don't say."
     */
    private String getRandomResponse()
    {
        /** <<< Add your code for Activity 2 here >>> **/
        String[] responses = {
                "Interesting, tell me more.",
                "Hmmm.",
                "Do you really think so?",
                "You don't say.",
                "How does that make you feel?"
        };
        return responses[(int) Math.floor(Math.random() * responses.length)];
    }

    /**
     * runs the method: findKeyword passing in a default value of 0
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }

    /**
     * This method returns the index of a given goal in a longer string.
     *
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        /*** --------------- Activity 3 --------------
         * Improve this method so that it only detects a keyword if it
         * is not within another word.
         * A keyword should not have letters around it.
         */

        /** convert to lower case **/
        statement = statement.toLowerCase();
        goal = goal.toLowerCase();
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (int tentativeIndex=0; tentativeIndex <= statement.length()-goal.length(); tentativeIndex++) {
            if (statement.substring(tentativeIndex, tentativeIndex+goal.length()).equals(goal)) {
                // Is there a letter before it?
                boolean isLetterBefore = false;
                if (tentativeIndex > 0)
                    isLetterBefore = letters.contains(statement.substring(tentativeIndex-1, tentativeIndex));

                // Is there a letter after the end?
                String charAfter;
                boolean isLetterAfter = false;
                if (tentativeIndex + goal.length() < statement.length()) {
                    charAfter = statement.substring(tentativeIndex + goal.length(), tentativeIndex + goal.length() + 1);
                    isLetterAfter = letters.contains(charAfter);
                }

                if (!isLetterBefore && !isLetterAfter) return tentativeIndex;
            }
        }
        return -1;
    }

    /** --- This method is complete!!! --
     * Take a statement with "I want to <something>." and transform it into
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = findKeyword(statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }

    /**  --------------- Activity 4 --------------
     * Take a statement with "I want <something>." and transform it into
     * "Would you really be happy if you had <something>?"
     * @param statement the user statement, assumed to contain "I want"
     * @return the transformed statement
     */
    private String transformIWantStatement(String statement)
    {
        // <<< Complete the code >>>
        return statement.replace("I want", "Would you really be happy if you had") + "?";

    }

    /** --- This method is complete!!! --
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals("."))   {
            statement = statement.substring(0, statement.length() - 1);
        }

        int psnOfYou = findKeyword(statement, "you", 0);
        int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    /**  --------------- Activity 4 --------------
     * Take a statement with "I <something> you" and transform it into
     * "Why do you <something> me?"
     * @param statement the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     */
    private String transformIYouStatement(String statement)
    {
        return statement.replace("you", "me").replace("I", "Why do you") + "?";
    }



    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie maggie = new Magpie();

        System.out.println("Hello, let's talk.");
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("q"))
        {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}
