/**
 * This code is complete - it tests the class Hidden Word
 *
 * --- below is the expected output from this class ---
 *
 * HiddenWord: HARPS
 * getHint: AAAAA, Result: +A+++
 * getHint: HELLO, Result: H****
 * getHint: HEART, Result: H*++*
 * getHint: HARMS, Result: HAR*S
 * getHint: HARPS, Result: HARPS
 *
 * HiddenWord: BANANA
 * getHint: COOKIE, Result: ******
 * getHint: NNNNNN, Result: ++N+N+
 * getHint: ABBAAA, Result: +++A+A
 * getHint: ABANAN, Result: ++++++
 * getHint: BANANA, Result: BANANA
 */
public class HiddenWordTester
{
    public static void main(String[] args)
    {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println("HiddenWord: HARPS");
        System.out.println("getHint: AAAAA, Result: " + puzzle.getHint("AAAAA"));
        System.out.println("getHint: HELLO, Result: " + puzzle.getHint("HELLO"));
        System.out.println("getHint: HEART, Result: " + puzzle.getHint("HEART"));
        System.out.println("getHint: HARMS, Result: " + puzzle.getHint("HARMS"));
        System.out.println("getHint: HARPS, Result: " + puzzle.getHint("HARPS"));

        HiddenWord puzzle2 = new HiddenWord("BANANA");
        System.out.println("\nHiddenWord: BANANA");
        System.out.println("getHint: COOKIE, Result: " + puzzle2.getHint("COOKIE"));
        System.out.println("getHint: NNNNNN, Result: " + puzzle2.getHint("NNNNNN"));
        System.out.println("getHint: ABBAAA, Result: " + puzzle2.getHint("ABBAAA"));
        System.out.println("getHint: ABANAN, Result: " + puzzle2.getHint("ABANAN"));
        System.out.println("getHint: BANANA, Result: " + puzzle2.getHint("BANANA"));

    }
}
