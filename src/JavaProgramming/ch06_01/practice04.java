package ch06_01;
import java.util.Scanner;
public class practice04 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max = 0;
        Scanner stdin = new Scanner(System.in);
        System.out.println("양수 5개를 입력하세요.");
        for (int i=0; i<5; i++) {
            int n = stdin.nextInt();
            arr[i] = n;
            if(max<n) max=n;
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
}
