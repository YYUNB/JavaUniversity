package ch06RE;
import java.util.Scanner;
public class p04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int arr[] = new int[5];
        int max = 0;

        System.out.println("양수 5개를 입력하세요.");
        for (int i=0; i<5; i++) {
            arr[i] = stdIn.nextInt();
            if (max<arr[i]) max = arr[i];
        }
        System.out.printf("가장 큰 수는 %d 입니다. ", max);
    }
}
