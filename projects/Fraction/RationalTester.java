/**********************************************************
 <<< This code is complete >>>
 results from add, subtract, multiple, divide

 add
 1/4 + 1/4 = 1/2
 2/3 + 1/4 = 11/12
 1/4 + -4/3 = -13/12
 -4/3 + 23/24 = -3/8

 subtract
 1/4 - 1/4 = 0/16
 2/3 - 1/4 = 5/12
 1/4 - -4/3 = 19/12
 -4/3 - 23/24 = -55/24

 multiply
 1/4 x 1/4 = 1/16
 2/3 x 1/4 = 1/6
 1/4 x -4/3 = -1/3
 -4/3 x 23/24 = -23/18

 divide
 1/4 / 1/4 = 1/1
 2/3 / 1/4 = 8/3
 1/4 / -4/3 = -3/16
 -4/3 / 23/24 = -32/23
 *****************************************************/

public class RationalTester
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(4,6);
        Rational r2 = new Rational(1,4);
        Rational r3 = new Rational(-8,6);
        Rational r4 = new Rational(23,24);

        System.out.println("\n add");
        System.out.println(r2 + " + " + r2 + " = " + r2.add(r2));
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r2 + " + " + r3 + " = " + r2.add(r3));
        System.out.println(r3 + " + " + r4 + " = " + r3.add(r4));
        System.out.println("\n subtract");
        System.out.println(r2 + " - " + r2 + " = " + r2.subtract(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r2 + " - " + r3 + " = " + r2.subtract(r3));
        System.out.println(r3 + " - " + r4 + " = " + r3.subtract(r4));
        System.out.println("\n multiply");
        System.out.println(r2 + " x " + r2 + " = " + r2.multiply(r2));
        System.out.println(r1 + " x " + r2 + " = " + r1.multiply(r2));
        System.out.println(r2 + " x " + r3 + " = " + r2.multiply(r3));
        System.out.println(r3 + " x " + r4 + " = " + r3.multiply(r4));
        System.out.println("\n divide");
        System.out.println(r2 + " / " + r2 + " = " + r2.divide(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " / " + r3 + " = " + r2.divide(r3));
        System.out.println(r3 + " / " + r4 + " = " + r3.divide(r4));
    }
}