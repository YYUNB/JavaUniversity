package MidTermPractice;
import java.util.Scanner;
public class ch0307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int money = sc.nextInt();

        int man = money / 10000;
        money %= 10000;
        System.out.println("일만원권: " + man + "장");

        int cheon = money / 1000;
        money %= 1000;
        System.out.println("천원권: " + cheon + "장");

        int ohbaek = money / 500;
        money %= 500;
        System.out.println("오백원주화: " + ohbaek + "개");

        int baek = money / 100;
        money %= 100;
        System.out.println("백원주화: " + baek + "개");

        int sib = money / 10;
        money %= 10;
        System.out.println("십원 주화: " + sib + "개");
        System.out.println("일원 주화: " + money + "개");
    }
}
