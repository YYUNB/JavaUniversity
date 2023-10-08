package JavaProgramming.FinalTermPractice;

import java.util.Scanner;

public class ch1203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        while(true) {
            System.out.print("Command: ");
            StringBuffer buff = new StringBuffer(sc.nextLine());
            if (buff.toString().equals("exit")) break;
            else if (buff.indexOf("!") == -1) {
                System.out.println("There is no '!'");
            }
            else {
                String str1 = buff.substring(0, buff.indexOf("!"));  // 기존 문자열
                String str2 = buff.substring(buff.indexOf("!") + 1, buff.length()); // 수정 문자열
                if (sb.indexOf(str1) == -1) System.out.println("There is no same word");
                else {
                    sb.insert(sb.indexOf(str1), str2);
                    sb.delete(sb.indexOf(str1), sb.indexOf(str1) + str1.length());
                    System.out.println(sb);
                }
            }

        }

        sc.close();
    }
}
