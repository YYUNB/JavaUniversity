package ch07RE;
import java.util.Scanner;

class Date {
    int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    String Print1() {
        return year + "." + month + "." + day;
    }
    String Print2() {
        return month + " " + day + "," + year;
    }
}
public class p05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("연월일을 입력하세요: ");
        int year = stdIn.nextInt();
        int month = stdIn.nextInt();
        int day = stdIn.nextInt();

        Date date = new Date(year, month, day);
        System.out.println(date.Print1());
        System.out.println(date.Print2());
    }
}
