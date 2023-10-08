package ch07RE;

import java.util.Scanner;
class BankAccount {
    int balance=0;
    int deposit(int num) {
        balance += num;
        return balance;
    }
    int withdraw(int num) {
        balance -= num;
        return balance;
    }
    public String toString() {
        return "현재 잔액은 " + balance + "입니다.";
    }
}
public class p04 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(10000);
        System.out.println(myAccount);
        myAccount.withdraw(8000);
        System.out.println(myAccount);
    }

}
