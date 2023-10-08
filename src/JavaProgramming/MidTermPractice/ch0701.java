package MidTermPractice;
import java.util.Scanner;
import java.util.ArrayList;
class Song {
    String title;
    String artist;
    int length;

    void setTitle(String title) {
        this.title = title;
    }
    String getTitle() {
        return title;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }
    String getArtist() {
        return artist;
    }

    void setLength(int length) {
        this.length = length;
    }
    int getLength() {
        return length;
    }

    public String toString() {
        return "[노레 제목: " + title + ", 가수: " + artist + ", 길이: " + length;
    }

    Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }
}
public class ch0701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Song> list = new ArrayList<>();
        while (true) {
            System.out.println("================");
            System.out.println("1. 곡 등록");
            System.out.println("2. 곡 검색");
            System.out.println("3. 곡 목록");
            System.out.println("4. 종료");
            System.out.println("================");
            int menu = sc.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("곡 제목: ");
                    String title = sc.next();
                    System.out.print("곡 가수: ");
                    String artist = sc.next();
                    System.out.print("곡 길이: ");
                    int length = sc.nextInt();

                    list.add(new Song(title, artist, length));
                    break;
                case 2:
                    System.out.println("곡을 검색합니다.");
                    System.out.print("곡 제목: ");
                    String stitle = sc.next();
                    for(Song s: list) {
                        if (s.getTitle().equals(stitle)) System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.println("곡 목록");
                    for(Song s: list) System.out.println(s);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }
    }
}
