package MidTermPractice;
import java.util.Scanner;
public class ch0507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 <= x < n 사이의 값을 뽑습니다.");
        System.out.print("n값을 입력하세요: ");
        int n = sc.nextInt();
        int x = (int)(Math.random()*n);
        int cnt = 0;
        while(true) {
            cnt++;
            System.out.print("정답을 추측하여 보세요: ");
            int answer = sc.nextInt();
            if(answer == x) {
                System.out.println("축하합니다. 정답: " + x + ", 시도 횟수: " + cnt);
                break;
            }
            else if (answer > x) System.out.println("제시한 정수가 정답보다 높습니다.");
            else System.out.println("제시한 정수가 정답보다 낮습니다.");
        }
    }
}
