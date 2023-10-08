package example;

import java.util.Random;

public class e0606 {
    public static void main(String args[]) {
        Random ran = new Random();
        int[][] score = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) score[i][j] = ran.nextInt(10); // 0~9
        }
        for (int k = 0; k < 4; k++) {
            int sum = 0;
            for (int value : score[k]) {
                System.out.print(value + " ");
                sum += value;
            }
            System.out.println("의 합계는 " + sum);
        }
    }
}
