/**
 * >>>>>>>>>>>>>>>>>>> CLASS BankAccount <<<<<<<<<<<<<<<<<<
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount {
    private double balance;
    private double interestRate;

    public BankAccount() {
        balance = 0;
        interestRate = 0;
        System.out.println("New bank account created");
    }

    public double getBalance() {
        return balance;
    }
    // <<<< ADD REQUIRED METHODS BELOW >>>>
    public BankAccount(double whatBalance, double interest) {
        balance = whatBalance;
        interestRate = interest;
    }

    public BankAccount(double whatBalance) {
        balance = whatBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void addInterest() {
        balance *= 1 + interestRate;
    }

    public double closeAccount() {
        double pastBalance = balance;
        balance = 0;
        return pastBalance;
    }
}