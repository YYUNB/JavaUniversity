package MidTermPractice;
import java.util.Scanner;
public class ch0603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        double sum = 0;
        int cnt = 0;
        for(int i=0; i<100; i++) {
            System.out.print("성적을 입력하세요: ");
            arr[i] = sc.nextInt();
            if(arr[i] == -1) break;
            sum += arr[i];
            cnt++;
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + sum/cnt);

    }
}
