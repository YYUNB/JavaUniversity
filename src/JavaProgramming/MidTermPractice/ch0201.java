package MidTermPractice;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ch0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + "-" + n2 + "의 결과는 " + (n1-n2) + "입니다.");
    }
}
