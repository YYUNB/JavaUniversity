package MidTermPractice;

import java.security.Key;

public class ch0301 {
    public static void main(String[] args) {
        byte b;
        int i = 300;
        long j = 976543210;
        b = (byte)i;
        i = (int)j;
        System.out.println("b의 값: " + b);
        System.out.println("i의 값: " + i);
        System.out.println("j의 값: " + j);
    }
}
