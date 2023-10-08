package Mentoring.p02_01;

public class CheckingAccount extends Account{
    String accountNumber;
    double balance;
    double transactionFee;
    public CheckingAccount (String accountNumber, double balance, double transactionFee ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionFee = transactionFee;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdrawal(double amount) {
        this.balance -= amount + transactionFee;
    }
    double calculateInterest() {
        return 0.0;
    }
}
