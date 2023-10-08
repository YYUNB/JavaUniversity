package ch04;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.print("요일을 입력하세요: ");
        String day = std.next();
        switch (day)
        {
            case "MON": case "TUE": case "WED": case "THU": case "FRI":
            System.out.println("주중");
            break;
            case "SAT": case "SUN":
            System.out.println("주말");
            break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

    }
}
