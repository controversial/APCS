/**
 * A class to test the BankAccount class.
 *
 * expected output:
 *
 *   b1 balance >> 0.0
 *   b1 balance >> 2000.0
 *   b1 balance >> 1500.0
 *   b1 balance >> 1530.0
 *   b1 balance >> 1530.0
 *   b1 balance >> 0.0
 *   b2 balance >> 1000.0
 *   b2 balance >> 1010.0
 *   b3 balance >> 1010.0
 *   b1 equals b3 >> false
 *   b2 equals b3 >> true
 *
 */
public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println("b1 balance >> " + b1.getBalance());

        b1.deposit(2000);
        System.out.println("b1 balance >> " + b1.getBalance());

        b1.withdraw(500);
        System.out.println("b1 balance >> " + b1.getBalance());

        b1.setInterestRate(0.02);
        b1.addInterest();
        System.out.println("b1 balance >> " + b1.getBalance());

        System.out.println("b1 balance >> " + b1.closeAccount());
        System.out.println("b1 balance >> " + b1.getBalance());

        BankAccount b2 = new BankAccount(1000, 0.01);

        System.out.println("b2 balance >> " + b2.getBalance());
        b2.addInterest();
        System.out.println("b2 balance >> " + b2.getBalance());

        BankAccount b3 = new BankAccount(b2.getBalance());
        System.out.println("b3 balance >> " + b3.getBalance());

        System.out.println("b1 equals b3 >> " + b1.equals(b3));
        System.out.println("b2 equals b3 >> " + b2.equals(b3));
    }
}