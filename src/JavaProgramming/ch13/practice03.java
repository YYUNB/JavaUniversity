package JavaProgramming.ch13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three integer values: ");
        int nums[] = new int[3];
        for(int i = 0; i<3; i++) {
            try {
                System.out.print(i + ">> ");
                nums[i] = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Not a integer. Please try again.");
                sc.nextLine();  // 버퍼 입력값 제거
                i--;
            }
        }
        System.out.println("total: " + (nums[0] + nums[1] + nums[2]));
    }
}
