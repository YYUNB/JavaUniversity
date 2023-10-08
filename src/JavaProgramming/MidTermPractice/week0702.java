package MidTermPractice;
import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    int score;

    void setTitle(String title) {
        this.title = title;
    }
    String getTitle() {
        return title;
    }
    void setScore(int Score) {
        this.score = score;
    }
    int getScore() {
        return score;
    }

    Book(String title, int score) {
        this.title = title;
        this.score = score;
    }

    public String toString() {
        return "Book [title: " + title + ", score: " + score + "]";
    }
}

public class week0702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList();
        while(true) {
            System.out.println("=================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.println("=================");
            System.out.print("메뉴를 선택하시오: ");
            int menu = sc.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("책 제목: ");
                    String title = sc.next();
                    System.out.print("책 평점: ");
                    int score = sc.nextInt();
                    list.add(new Book(title, score));
                    break;
                case 2:
                    System.out.print("책 제목: ");
                    String stitle = sc.next();
                    for (Book b : list) {
                        if (b.getTitle().equals(stitle)) System.out.println(b);
                    }
                    break;
                case 3:
                    for (Book b : list) {
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
            }
        }
    }
}
