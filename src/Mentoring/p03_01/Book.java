package Mentoring.p03_01;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    void getInfo() {
        System.out.println("제목: " + title + ", 작가: " + author +
                ", 출판년도: " + publicationYear );
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    int getPublicationYear() {
        return publicationYear;
    }

}
