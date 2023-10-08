package ch07;
import java.util.Scanner;
class Date {
    int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void Print1() {
        System.out.println(year + "." + month + "." + day);
    }
    public String Print2() {
        return day + " " + month + "," + year;
    }
}
public class practice05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("연원일을 입력하세요: ");
        int year = stdIn.nextInt();
        int month = stdIn.nextInt();
        int day = stdIn.nextInt();

        Date obj = new Date(year, month, day);

        obj.Print1();
        System.out.println(obj.Print2());
    }
}
