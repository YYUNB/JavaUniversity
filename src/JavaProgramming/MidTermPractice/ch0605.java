package MidTermPractice;
import java.util.Scanner;
public class ch0605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 크기를 입력하세요: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        double sum = 0;
        System.out.println(size + " 개의 정수를 입력하세요.");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.printf("평균은 %.2f 입니다.", sum/size);
    }
}
