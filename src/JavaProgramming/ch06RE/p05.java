package ch06RE;
import java.util.Scanner;
public class p05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열 크기를 입력하세요.");
        int size = stdIn.nextInt();
        int arr[] = new int[size];

        System.out.printf("%d 개의 정수를 입력하세요.\n", size);
        int sum = 0;
        for (int i=0; i<size; i++) {
            arr[i] = stdIn.nextInt();
            sum += arr[i];
        }
        System.out.printf("평균은 %.2f 입니다.", (double)sum/size);
    }
}
