package ch02;
import java.util.Scanner;
public class practice02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("국적 이름 나이 키를 입력 : ");
        String country = stdIn.next();
        String name = stdIn.next();
        int age = stdIn.nextInt();
        double height = stdIn.nextDouble();

        System.out.println("나의 국적은 " + country + "이며 이름은 " + name +"입니다.");
        System.out.println("나이는 " + age + "이며 키는 " + height + "입니다.");
    }
}
