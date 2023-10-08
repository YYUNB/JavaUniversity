package ch08_02;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    int score, cnt;

    public String getTitle() {
        return title;
    }
    public void setTitle() {
        this.title = title;
    }
    public int getScore() {
        return score;
    }
    public void setScore() {
        this.score = score;
    }
    public String toString() {
        return "Book [title: " + title + ", score: " + score + "]";
    }
    static int count; // 정적 필드
    public Book(String title, int score) {
        this.title = title;
        this.score = score;
        count++;
    }
}
public class practice01 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList();
        Scanner stdIn = new Scanner(System.in);
        while (true) {
            System.out.println("======================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.println("======================");
            System.out.print("메뉴를 선택하시오: ");
            int number = stdIn.nextInt();

            switch(number) {
                case 1:
                    System.out.print("책 제목: ");
                    String title = stdIn.next();
                    System.out.print("책 평점: ");
                    int score = stdIn.nextInt();
                    list.add(new Book(title, score));
                    break;
                case 2: // 어케함
                    System.out.print("책 제목: ");
                    String schTitle = stdIn.next();
                    for (Book e: list) {
                        if(e.getTitle().equals(schTitle)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 3:
                    for(Book e: list) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
        }

    }
}
