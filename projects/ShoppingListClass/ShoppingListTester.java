/***********************************************************************
 * >>>>>> TESTER for class ShoppingList --- This code is complete <<<<<<
 *
 * --------------- Below is the output from this tester ----------------
 * Shopping list = apples
 * Shopping list = apples, spam
 * Shopping list = apples, spam, broccoli
 * Shopping list = apples, broccoli
 * Shopping list = apples, broccoli
 * Shopping list = apples
 * Shopping list = apples
 * Shopping list = apples, Twinkies
 * Shopping list = Twinkies
 * Shopping list = Twinkies, Cheez Whiz
 * Shopping list = Twinkies, Cheez Whiz, bread
 * Shopping list = Twinkies, Cheez Whiz
 * Shopping list = Cheez Whiz
 *
 *****************************************************************/
public class ShoppingListTester
{
    public static void main(String args[])
    {
        ShoppingList Haas = new ShoppingList("");
        Haas.addItem("apples");
        System.out.println(Haas);
        Haas.addItem("spam");
        System.out.println(Haas);
        Haas.addItem("broccoli");
        System.out.println(Haas);
        Haas.removeItem("spam");
        System.out.println(Haas);
        Haas.addItem("apples");
        System.out.println(Haas);
        Haas.removeItem("broccoli");
        System.out.println(Haas);
        Haas.removeItem("chicken");
        System.out.println(Haas);
        Haas.addItem("Twinkies");
        System.out.println(Haas);
        Haas.removeItem("apples");
        System.out.println(Haas);
        Haas.addItem("Cheez Whiz");
        System.out.println(Haas);
        Haas.addItem("bread");
        System.out.println(Haas);
        Haas.removeItem("bread");
        System.out.println(Haas);
        Haas.removeItem("Twinkies");
        System.out.println(Haas);
    }
}

