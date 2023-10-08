package JavaProgramming.FinalTermPractice;

class Author {
    String name;
    int age;
    String nation;

    public Author(String name, int age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

    public String toString() {
        return "[Author] " + name + " " + age + " " + nation;
    }
}

class Publisher {
    String name;
    String nation;

    public Publisher(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    public String toString() {
        return "[Publisher] " + name + " " + nation;
    }
}

class Book {
    String title;
    Author author;
    Publisher publisher;

    public Book(String title, Author author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {
        return "[title] " + title + "\n" + author + "\n" + publisher;
    }
}
public class ch1004 {
    public static void main(String[] args) {
        Author author = new Author("파울로코엘료", 75, "브라질");
        Publisher publisher = new Publisher("문학동네", "Korea");
        Book book = new Book("연금술사", author, publisher);
        System.out.println("Book");
        System.out.println(book);
    }
}
