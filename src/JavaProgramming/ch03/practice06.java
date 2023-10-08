package ch03;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.print("정수: ");
        int n = std.nextInt();
        String change = Integer.toBinaryString(n);
        System.out.println(n + ": " + change);
    }
}
