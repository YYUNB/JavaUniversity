package Mentoring.p03_01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<LibraryBook> lb = new ArrayList<>();
        lb.add(new LibraryBook("윤경이의 비밀일기", "최윤경", 2003, 1));
        lb.add(new LibraryBook("준영이의 코딩노트", "박준영", 1999, 2));
        lb.add(new ReferenceBook("용강이의 성적노트", "김용강", 2023, 3, 1));

        int menu = 0;
        String name;
        boolean find;

        while(menu!=4) {
            System.out.println("[ 도서 관리 시스템 ]");
            System.out.println("1. 책 목록");
            System.out.println("2. 책 대출");
            System.out.println("3. 책 반납");
            System.out.println("4. 종료");

            System.out.print(">> ");
            menu = sc.nextInt();

            System.out.println();
            switch(menu) {
                case 1:
                    System.out.println("[ 책 목록 ]");
                    for(LibraryBook a: lb) {
                        a.getInfo();
                    }
                    break;
                case 2:
                    System.out.print("대출할 책 이름을 입력하세요. \n>> ");
                    sc.nextLine(); // 앞선 sc.nextInt()의 버퍼를 제거하기 위함
                    name = sc.nextLine();
                    find = false;
                    for(LibraryBook a: lb) {
                        if(name.equals(a.getTitle())) {
                            a.borrow();
                            find = true;
                        }
                    }
                    if(!find) System.out.println("일치하는 책이 없습니다.");
                    break;
                case 3:
                    System.out.print("반납할 책 이름을 입력하세요. \n>> ");
                    sc.nextLine();
                    name = sc.nextLine();
                    find = false;
                    for(LibraryBook a: lb) {
                        if(name.equals(a.getTitle())) {
                            a.returnBook();
                            find = true;
                        }
                    }
                    if(!find) System.out.println("일치하는 책이 없습니다.");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
            System.out.println();
        }

    }
}
