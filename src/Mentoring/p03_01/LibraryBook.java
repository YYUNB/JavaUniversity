package Mentoring.p03_01;

public class LibraryBook extends Book{
    private int bookId;
    private boolean isBorrowed;

    public LibraryBook(String title, String author, int publicationYear, int bookid) {
        super(title, author, publicationYear);
        this.bookId = bookid;
        this.isBorrowed = false;
    }

    void getInfo () {
        System.out.println("제목: " + getTitle() + ", 작가: " + getAuthor() +
                ", 출판년도: " + getPublicationYear() + ", 식별자: " +
                bookId + ", 대출 여부: " + isBorrowed);
    }

    void borrow() {
        if(isBorrowed) System.out.println("이미 대출 중인 책입니다.");
        else {
            System.out.println("책 " + getTitle() + " 을(를) 대출했습니다.");
            isBorrowed = true;
        }
    }

    void returnBook() {
        if (!isBorrowed) System.out.println("이미 반납된 책입니다.");
        else {
            System.out.println("책 " + getTitle() + " 을(를) 반납했습니다.");
            isBorrowed = false;
        }
    }

    int getBookId() {
        return bookId;
    }

    boolean getIsBorrowed() {
        return isBorrowed;
    }
}
