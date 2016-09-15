public class NameThatCelebrity
{
    public static void whoIs(String celebrity)
    {
        /***
         * <<< this method is not complete >>>
         * Complete the code to print out the celebrity after the
         * first two and last three letters are dropped from the name.
         ***/
        System.out.println(celebrity.substring(2, celebrity.length()-3));
    }

    public static void main(String args[])
    {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        whoIs(s1); // prints out: lan A
        whoIs(s2); // prints out: hn Wa
        whoIs(s3); // prints out: egory P
    }
}
