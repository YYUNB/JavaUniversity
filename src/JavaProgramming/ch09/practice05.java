package ch09;

import java.util.ArrayList;
import java.util.Scanner;

class Word {
    String eng;
    String kor = "설명 필요";

    public Word(String eng) {
        this.eng = eng;
    }
    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
    String getEng() {
        return eng;
    }
    String getKor() {
        return kor;
    }
    public String toString() {
        return eng + " -> " + kor;
    }
}
public class practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word ("Java", "자바"));
        list.add(new Word("Artificial Intelligence", "인공지능"));
        list.add(new Word("Reinforcement Learning", "강화학습"));
        list.add(new Word("Supervised Learning", "지도학습"));
        list.add(new Word("Unsupervised Learning", "비지도학습"));
        list.add(new Word("Internet of Things"));
        list.add(new Word("Network"));

        while(true) {
            System.out.println("검색할 단어를 입력하시오: (종료 quit)");
            String word = sc.nextLine();
            if (word.equals("quit")) {
                System.out.println("종료합니다.");
                System.exit(0);
            }
            for (Word c: list) {
                if (c.getEng().equals(word)) System.out.println(c);
            }
        }
    }
}
