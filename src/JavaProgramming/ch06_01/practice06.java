package ch06_01;
import java.util.Scanner;
public class practice06 {
    public static void main(String[] args) {
        String day[] = {"월","화","수","목","금","토","일"};
        Scanner stdin = new Scanner(System.in);
        int index = 0;
        while(true){
            System.out.print("정수를 입력하세요>> ");
            int dayIn = stdin.nextInt();
            if (dayIn == -1) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            if (dayIn % 7 == 1) index = 0;
            else if (dayIn % 7 == 2) index = 1;
            else if (dayIn % 7 == 3) index = 2;
            else if (dayIn % 7 == 4) index = 3;
            else if (dayIn % 7 == 5) index = 4;
            else if (dayIn % 7 == 6) index = 5;
            else if (dayIn % 7 == 0) index = 6;

            System.out.println(day[index]);
        }

    }
}
