/**
 * complete the method reverse
 * reverse uses recursion to return a string in reverse order
 * for example:
 *    reverse(cookies) returns: seikooc
 */
public class StringRecursion
{
    public static String reverse(String str)
    {
        if (str.length() == 0) return "";
        return str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args)
    {
        String msg = "pizza";
        System.out.println("forward = " + msg);
        System.out.println("reverse = " + reverse(msg));
    }
}
