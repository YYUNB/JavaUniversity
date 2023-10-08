package JavaProgramming.ch13;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, d = 1, c = 0;
        while(true) {
            System.out.print("Numerator: ");
            n = sc.nextInt();
            System.out.println("Denominator: ");
            d = sc.nextInt();
            try {
                c = n / d;
            }
            catch (Exception e) {
                System.out.println("You cannot divide by zero. Please enter a valid input");
                sc.nextLine();
                continue;
            }
            break;
        }
        System.out.println("Ceil (" + n + " / " + d + ") = " + c);
    }
}
