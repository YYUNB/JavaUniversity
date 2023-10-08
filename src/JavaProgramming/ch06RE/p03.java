package ch06RE;
import java.util.Scanner;
public class p03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int scoreArr[] = new int[30];
        double sum = 0.0;
        int cnt = 0;

        for (int i=0; i<scoreArr.length; i++) {
            System.out.print("성적을 입력하세요: ");
            scoreArr[i] = stdIn.nextInt();
            if (scoreArr[i] == -1) break;
            sum += scoreArr[i];
            cnt++;
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (double)sum/cnt);
    }
}
