package Mentoring.p03_01;

public class ReferenceBook extends LibraryBook {
    int edition;

    public ReferenceBook(String title, String author, int publicationYear, int bookid, int edition) {
        super(title, author, publicationYear, bookid);
        this.edition = edition;
    }

    void getInfo () {
        System.out.println("제목: " + getTitle() + ", 작가: " + getAuthor() +
                ", 출판년도: " + getPublicationYear() + ", 식별자: " +
                getBookId() + ", 대출 여부: " + getIsBorrowed() + ", 판: " +
                edition );
    }

    @Override
    void borrow() {
        System.out.println("참고 도서는 대출할 수 없습니다.");
    }

}
