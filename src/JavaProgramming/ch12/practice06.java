package JavaProgramming.ch12;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        StringBuffer text = new StringBuffer();

        while(true) {
            String t = sc.next();
            if (t.equals(";")) break;
            text.append(t + " ");
        }

        System.out.println("히스토그램을 그립니다.");
        int cnt[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (97 <= ch && ch <= 122)cnt[ch - 'a'] += 1;
            else if ( (65 <= ch && ch <= 90)) cnt[ch - 'A'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print((char)(i+'A'));
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
