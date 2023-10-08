package Mentoring.p02_01;

public class SavingsAccount extends Account{
    String accountNumber;
    double balance;
    double interestRate;
    public SavingsAccount (String accountNumber, double balance, double interestRate ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdrawal(double amount) {
        this.balance -= amount;
    }
    double calculateInterest() {
        return balance * interestRate;
    }
}
