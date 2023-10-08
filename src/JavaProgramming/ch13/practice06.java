package JavaProgramming.ch13;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] words = new int[26];

        try {
            for (int i = 0; i < word.length(); i+=2) {
                int w = word.charAt(i) - '0';
                // -'0'은 문자를 숫자로 변환했을 떄 아스키코드값으로 나오는 것을 방지하기 위한 것
                // 사실 이 문제에서는 필요 없었다...
                if (49 <= w || w >= 74) w -= 32;
                words[w-17] += 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " : Input includes non-alphabet.");
        }

        for (int i = 0; i < 26; i++) {
            System.out.println("Character " + (char)(65+i) + ": " + words[i]);
        }
    }
}
