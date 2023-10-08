package MidTermPractice;
import java.util.Scanner;

class BankAccount {
    String Owner;
    int accountNumber;
    int Balance = 0;
    void deposit(int money) {
        Balance += money;
    }
    void withdraw(int money) {
        Balance -= money;
    }

    public String toString() {
        return "현재 잔액은 " + Balance + "원 입니다.";
    }
}
public class ch0704 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(10000);
        System.out.println(myAccount);
        myAccount.withdraw(8000);
        System.out.println(myAccount);
    }
}
