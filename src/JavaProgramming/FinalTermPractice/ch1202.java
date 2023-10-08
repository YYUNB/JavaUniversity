package JavaProgramming.FinalTermPractice;

import java.util.Scanner;

public class ch1202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        int length = sb.length();

        /*
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < sb.length()-1; j++) {
                sb.append(sb.charAt(0)); // 첫 글자를 맨 뒤로 보냄
                sb.setCharAt(j, sb.charAt(j+1));  // 앞으로 한 칸씩 옮김
                sb.delete(length + 1, sb.length());  // 원래 길이 유지
            }
            sb.delete(length, sb.length());  // ?
            System.out.println(sb);
        }
        */

        for (int i = 0; i < sb.length() ; i++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    sc.close();
    }
}
