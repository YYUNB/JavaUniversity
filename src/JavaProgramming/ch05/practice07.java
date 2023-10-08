package ch05;
import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        System.out.print("0 <= x <= n 사이의 값을 뽑습니다. n을 입력하세요: ");
        Scanner std = new Scanner (System.in);
        int n = std.nextInt();
        int ranN = (int)(Math.random() * n);
        // int 형변환 먼저 X -> Math.random: 0 <= 난수 < 1 (실수)이기 때문에 형변환 시 0이 됨
        int cnt = 1;
        while (true) {
            System.out.print("정답을 추측하여 보세요: ");
            int answer = std.nextInt();
            if (answer > ranN) {
                cnt++;
                System.out.println("제시한 정수가 정답보다 낮습니다.");
            }
            else if (answer < ranN) {
                cnt ++;
                System.out.println("제시한 정수가 정답보다 높습니다.");
            }
            else {
                System.out.println("축하합니다. 정답: " + ranN + ", 시도 횟수: " + cnt);
                break;
            }
        }
    }
}
