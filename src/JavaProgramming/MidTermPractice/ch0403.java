package MidTermPractice;
import java.util.Scanner;
public class ch0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산기호를 입력하세요: ");
        String sym = sc.next();

        System.out.print("숫자 2개를 입력하세요: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        switch(sym) {
            case "+":
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case "-":
                System.out.println(n1 + "-" + n2 + " = " + (n1-n2));
                break;
            case "*":
                System.out.println(n1 + "*" + n2 + " = " + (n1*n2));
                break;
            case "/":
                if (n2 != 0) System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
                else System.out.println("0으로 나눌 수 없습니다.");
                break;
        }
    }
}
