/**     <<< THIS CODE IS COMPLETE >>>
 *  This program tests the BankAccount class and its subclasses.
 */
public class BankAccountTester
{
    public static void main(String[] args)
    {
        CheckingAccount joesAccount = new CheckingAccount(1000);
        joesAccount.withdraw(300);
        joesAccount.deposit(500);
        joesAccount.withdraw(100);
        System.out.println("<should be $1098.50> Joe's balance = $" + joesAccount.getBalance());

        CheckingAccount moesAccount = new CheckingAccount(500);
        moesAccount.transfer(100,joesAccount);
        System.out.println("<should be $1198.00> Joe's balance = $" + joesAccount.getBalance());

        SavingsAccount janesAccount = new SavingsAccount(2000,4.2);
        janesAccount.withdraw(1000);
        System.out.println("<should be $1000> Janes's balance = $" + janesAccount.getBalance());
        janesAccount.withdraw(1000); // withdrawel not allowed
        System.out.println("<should be $1000> Janes's balance = $" + janesAccount.getBalance());
        janesAccount.withdraw(995); // withdrawel not allowed
        System.out.println("<should be $1000> Janes's balance = $" + janesAccount.getBalance());
        janesAccount.addInterest();
        System.out.println("<should be $1042> Janes's balance = $" + janesAccount.getBalance());


    }
}
