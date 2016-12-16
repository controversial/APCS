// Below is a tester class
// Here is the output:
// 20000, 2500, 0.1 ==> purchase price: 24750
// Changed markup to 1000 ==> purchase price: 23100
public class A2Test
{
    public static void main(String[] args)
    {
        Vehicle car = new Vehicle(20000, 2500, 0.1);
        System.out.println("20000, 2500, 0.1 ==> purchase price: " + Math.round(car.purchasePrice()));
        car.changeMarkup(1000);
        System.out.println("Changed markup to 1000 ==> purchase price: " +  Math.round(car.purchasePrice()));
    }
}
