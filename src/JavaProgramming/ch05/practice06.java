package ch05;
import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.print("출력할 숫자 개수: ");
        int num = std.nextInt();
        System.out.print("0 1 ");

        int ppn=0, pn=1;
        for (int i=3; i<=num; i++) {
            int cn = pn + ppn;
            System.out.print(cn + " ");
            ppn = pn;
            pn = cn;
        }
    }
}
