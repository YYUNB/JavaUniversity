package MidTermPractice;
import java.util.Scanner;
public class ch0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int n = sc.nextInt();

        while(n>1) {;
            System.out.print(n % 2);
            n /= 2;
            //생각하기 귀찮음
        }
    }
}
