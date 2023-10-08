package MidTermPractice;
import java.util.Scanner;
public class ch0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국적 이름 나이 키 입력: ");
        String nat = sc.next();
        String name = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        System.out.println("나의 국적은 " + nat + "이며 이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살이며 키는 " + height + "입니다.");
    }
}
