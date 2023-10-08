package JavaProgramming.ch12;

import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = {"java", "count", "school", "book", "student", "programmer"};

        int randN = (int)(Math.random()*6);

        char randW[] = new char[word[randN].length()+1];
        for(int i=0; i<word[randN].length(); i++) randW[i] = word[randN].charAt(i);

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<word[randN].length(); i++) sb.append("_");

        int cnt = 0;

        while(cnt != sb.length()) {
            System.out.print("현재의 상태: ");
            System.out.println(sb);

            System.out.print("글자를 추측하시오: ");
            char input = sc.next().charAt(0);

            for(int i=0; i<word[randN].length(); i++) {
                if(input == randW[i]) {
                    sb.setCharAt(i, input);
                    cnt++;
                }
            }
        }
        System.out.print("현재의 상태: ");
        System.out.println(sb);
    }
}
