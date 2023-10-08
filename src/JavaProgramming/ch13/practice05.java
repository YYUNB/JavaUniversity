package JavaProgramming.ch13;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Randcom number is generated. Guess the number: ");

        int r = random.nextInt(99);
        int min = 0, max = 99;
        int cnt = 0;
        int n = 0;

        while(true) {
            boolean c = true;
            cnt++;
            System.out.println(min + "~" + max);
            System.out.print(cnt + ">> ");
            try {
                n = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Only integer is allowed.");
                sc.nextLine();
                c = false;
            }
            if(c && n > r) {
                System.out.println("Enter a smaller number.");
                max = n;
            } else if (c && n < r) {
                System.out.println("Enter a larger number.");
                min = n;
            } else if (c && n == r) {
                System.out.println("Correct.");
                System.out.println("Try again? (y/n)>> ");
                String answer = sc.next();
                if(answer.equals("y")) {
                    r = random.nextInt(99);
                    min = 0;
                    max = 99;
                    cnt = 0;
                }
                else if(answer.equals("n")) break;
            }
        }
    }
}
