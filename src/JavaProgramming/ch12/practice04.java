package JavaProgramming.ch12;
import java.util.Scanner;
public class practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.nextLine());
        while (true) {
            System.out.print("Command: ");
            StringBuffer buff = new StringBuffer(sc.nextLine());
            if (buff.toString().equals("exit")) {
                System.out.println("End...");
                break;
            }
            else if (buff.indexOf("!") == -1) System.out.println("Error");  // 느낌표가 없으면
            else {
                String str1 = buff.substring(0, buff.indexOf("!"));  // str1에 기존문자열 저장
                String str2 = buff.substring(buff.indexOf("!") + 1, buff.length());  // str2에 수정문자열 저장
                if (str.indexOf(str1) == -1) System.out.println("Error");  // 같은 문자열이 없으면
                else {
                    str.insert(str.indexOf(str1), str2);  // str의 바꿀 기존 문자열 앞에 수정할 문자열 삽입
                    str.delete(str.indexOf(str1), str.indexOf(str1) + str1.length()); // str의 기존문자열 삭제
                    System.out.println(str);
                }
            }
        }
    }
}