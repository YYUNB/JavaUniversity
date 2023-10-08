package ch02;
import java.util.Scanner;
public class practice01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("숫자를 입력 : ");
        int num1 = stdIn.nextInt();
        int num2 = stdIn.nextInt();
        System.out.print(num1 + "-" + num2 + "의 결과는 " + (num1-num2) + "입니다");
    }
}

