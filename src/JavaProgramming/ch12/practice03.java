package JavaProgramming.ch12;

import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        StringBuffer str = new StringBuffer(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            str.append(str.charAt(0));
            str.deleteCharAt(0);
            System.out.println(str);
        }
    }
}
