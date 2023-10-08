package Midterm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Contact {
    String name;
    String number;
    String email;
    static int cnt = 0;

    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
    String getName() {
        return name;
    }
    String getNumber() {
        return number;
    }
    String getEmail() {
        return email;
    }

    public String toString() {
        return name + "\t\t전화번호: " + number + "\t\t이메일: " + email;
    }

}
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> list = new ArrayList<>();
        System.out.println("연락처를 입력하시오 (종료: exit)");
        while(true) {
            System.out.print("이름과 전화번호, 이메일을 입력하시오: ");
            String name = sc.next();
            if (name.equals("exit")) {
                System.out.println("지인들의 수는 " + Contact.cnt + "입니다.");
                break;
            }
            String number = sc.next();
            String email = sc.next();
            list.add(new Contact(name, number, email));
            Contact.cnt++;
        }
        while(true) {
            System.out.print("검색할 이름을 입력하시오 (종료: exit): ");
            String search = sc.next();
            if (search.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            for (Contact c: list) {
                if (c.getName().equals(search)) System.out.println(c);
            }

        }
    }
}
