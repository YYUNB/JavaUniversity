package ch06RE;
import java.util.Scanner;
public class p06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String dayA[] = {"월", "화", "수", "목", "금", "토", "일"};
        while(true) {
            System.out.print("정수를 입력하세요>> ");
            int day = stdIn.nextInt();
            if(day==-1) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            if (day%7==0) System.out.println(dayA[6]);
            for (int i=1; i<8; i++) if (day%7==i) System.out.println(dayA[i-1]);
        }
    }
}
