package ch07;

class BankAccount {
    int balance = 0;
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        balance -= amount;
    }
    public String toString() {
        return "현재 잔액은 " + balance + "입니다.";
    }
}
public class practice04 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(10000);
        System.out.println(myAccount);
        myAccount.withdraw(8000);
        System.out.println(myAccount);
    }
}