package ch06_01;
import java.util.Scanner;
public class practice05 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
        int size = stdin.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println(size + " 개의 정수를 입력하세요.");
        for(int i=0; i<arr.length; i++) {
            int num = stdin.nextInt();
            arr[i] = num;
            sum += num;
        }
        System.out.printf("평균은 %.2f 입니다.", sum/(float)size);
    }
}
