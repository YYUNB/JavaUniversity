package MidTermPractice;
import java.util.Scanner;
public class ch0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요.");
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("가장 큰 수는 " + max + " 입니다.");
    }
}
