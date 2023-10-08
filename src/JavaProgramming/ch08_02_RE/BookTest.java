package ch08_02_RE;
import java.util.Scanner;
import java.util.ArrayList;
class Book {
    String title;
    int score;
    Book(String title, int score) {
        this.title = title;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }
    public int getScore() {
        return score;
    }

    public String toString() {
        return "Book [title: " + title + ", score: " + score + "]";
    }
}
public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList();

        while(true) {
            System.out.println("=====================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.println("=====================");

            System.out.print("메뉴를 선택하시오: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:  // 책 등록
                    System.out.print("책 제목: ");
                    String title = sc.next();
                    System.out.print("책 평점: ");
                    int score = sc.nextInt();
                    list.add(new Book(title, score));
                    break;
                case 2:
                    System.out.print("책 제목: ");
                    String schTitle = sc.next();
                    for (Book e: list) {  // list에서 하나씩 꺼내 e에 저장함 (list에 꺼낼 객체가 없을 때까지)
                        if(e.getTitle().equals(schTitle)) System.out.println(e);  // 기억!!!!
                    }
                    break;
                case 3:
                    for (Book e: list) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
            }
        }

    }
}
