package MidTermPractice;
import java.util.Scanner;

class Date {
    int year, month, day;

    Date (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void Print1() {
        System.out.println(year + "." + month + "." + day);
    }
    void Print2() {
        System.out.println(month + " " + day + ", " + year);
    }
}
public class ch0705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연월일을 입력하세요: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        Date date = new Date(year, month, day);

        date.Print1();
        date.Print2();
    }
}
