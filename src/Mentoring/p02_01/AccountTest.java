package Mentoring.p02_01;

public class AccountTest {
    public static void main(String[] args) {
        // SavingsAccount 객체 생성
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 0.05);
        System.out.println("Saving Account: ");
        System.out.println("Account Number: " + savingsAccount.accountNumber);
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest: $" + savingsAccount.calculateInterest());
        System.out.println();

        // CheckingAccount 객체 생성
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 2000.0, 1.0);
        System.out.println("Checking Account: ");
        System.out.println("Account Number: " + checkingAccount.accountNumber);
        System.out.println("Balance: $" + checkingAccount.getBalance());
        System.out.println("Interest: $" + checkingAccount.calculateInterest());
        System.out.println();

        // 예금 및 인출 테스트
        savingsAccount.deposit(500.0);
        checkingAccount.deposit(1000.0);
        savingsAccount.withdrawal(200.0);
        checkingAccount.withdrawal(300.0);

        System.out.println("Savings Account - Updated Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account - Updated Balance: $" + checkingAccount.getBalance());
    }
}
