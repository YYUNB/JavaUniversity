package MidTermPractice;
import java.util.Scanner;

public class ch0608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] student = {{1, 3, 2, 4, 3, 1, 4, 2, 2, 1},
                {3, 2, 4, 2, 2, 1, 1, 3, 4, 1},
                {2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
                {2, 3, 3, 1, 1, 3, 2, 2, 4, 4},
                {3, 1, 1, 2, 4, 1, 2, 3, 1, 3}};

        int[] correct = new int[10];
        int[] score = {0, 0, 0, 0, 0 };
        System.out.print("정답을 입력하세요(10개): ");
        for(int i=0; i<10; i++) correct[i] = sc.nextInt();

        for(int i=0; i<5; i++) {
            for(int j=0; j<10; j++) {
                correct[j] = sc.nextInt();
                if (correct[j] == student[i][j]) score[i]++;
            }
            System.out.println("학생 " + (i+1) + "의 점수 : " + score[i] + "점");
        }
    }
}
