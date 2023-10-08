package ch05;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner intIn = new Scanner(System.in);
        System.out.print("M : ");
        int m = intIn.nextInt();
        int r = 0;
        for (int i=1; i<=m; i++) r += (i*i +1);
        System.out.println("R = " + r);
    }
}
