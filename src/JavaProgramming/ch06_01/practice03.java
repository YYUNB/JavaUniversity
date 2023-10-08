package ch06_01;
import java.util.Scanner;
public class practice03 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int scorearr[] = new int[20];
        int index=0;
        while(true) {
            System.out.print("성적을 입력하세요: ");
            int score = stdin.nextInt();
            if (score == -1) break;
            scorearr[index] = score;
            index++;
        }
        double sum = 0;
        for (double i : scorearr) sum += i;
        System.out.println("합계: " + sum + "\n평균: " + (sum/(double)index));
    }
}
