package ch03;

import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        int money = std.nextInt();
        int man, cheon, five, baek, ten, one;
        man = money / 10000;
        cheon = (money-man*10000)/1000;
        five = (money-man*10000-cheon*1000)/500;
        baek = (money-man*10000-cheon*1000-five*500)/ 100;
        ten = (money-man*10000-cheon*1000-five*500-baek*100) / 10;
        one = (money-man*10000-cheon*1000-five*500-baek*100-ten*10)/ 1;
        System.out.println("일만원권 : " + man + "장");
        System.out.println("천원권 : " + cheon + "장");
        System.out.println("오백원주화 : " + five + "개");
        System.out.println("백원주화 : " + baek + "개");
        System.out.println("십원주화 : " + ten + "개");
        System.out.println("일원주화 : " + one + "개");
    }
}
