package ch03;
import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("========================");

        System.out.print("번호를 선택하시오: ");
        int choose = stdin.nextInt();
        System.out.print("온도를 입력하시오: ");
        int temp = stdin.nextInt();

        double changeTemp;
        changeTemp = (choose==1) ? 5/9*(temp-32) : temp*9/5+32;

        System.out.println("변환된 온도는 " + changeTemp);

    }
}
