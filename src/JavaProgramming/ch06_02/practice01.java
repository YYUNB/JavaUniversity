package ch06_02;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        int[] s1 = {1,3,2,4,3,1,4,2,2,1};
        int[] s2 = {3,2,4,2,2,1,1,3,4,1};
        int[] s3 = {2,4,3,2,1,2,1,3,3,4};
        int[] s4 = {2,3,3,1,1,3,2,2,4,4};
        int[] s5 = {3,1,1,2,4,1,2,3,1,3};
        int[] correct = new int[10];
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정답을 입력하세요(10개) : ");
        for(int i=0; i<10; i++) {
            correct[i] = stdIn.nextInt();
        }

        int scr1=0, scr2=0, scr3=0, scr4=0, scr5=0;
        for (int i=0; i<10; i++) {
            if(s1[i]==correct[i]) scr1 += 1;
            if(s2[i]==correct[i]) scr2 += 1;
            if(s3[i]==correct[i]) scr3 += 1;
            if(s4[i]==correct[i]) scr4 += 1;
            if(s5[i]==correct[i]) scr5 += 1;
        }

        System.out.println("학생 1의 점수 : " + scr1 + "점");
        System.out.println("학생 2의 점수 : " + scr2 + "점");
        System.out.println("학생 3의 점수 : " + scr3 + "점");
        System.out.println("학생 4의 점수 : " + scr4 + "점");
        System.out.println("학생 5의 점수 : " + scr5 + "점");
    }
}
