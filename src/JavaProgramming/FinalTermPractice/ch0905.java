package JavaProgramming.FinalTermPractice;

import java.util.ArrayList;
import java.util.Scanner;

class Word {
    String eng;
    String kor;

    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    public Word(String eng) {
        this.eng = eng;
        this.kor = " ";
    }

    String getEng() { return eng; }
    String getKor() { return kor; }

    public String toString() {
        if (kor.equals(" ")) return eng + " -> 설명 필요";
        else return eng + " -> " + kor;
    }
}
public class ch0905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Word> arrayList = new ArrayList();
        arrayList.add(new Word("Java", "자바"));
        arrayList.add(new Word("Artificial Intelligence", "인공지능"));
        arrayList.add(new Word("Reinforcement Learning", "강화학습"));
        arrayList.add(new Word("Supervised Learning", "지도학습"));
        arrayList.add(new Word("Unsupervised Learning", "비지도학습"));
        arrayList.add(new Word("Internet of Things"));
        arrayList.add(new Word("Network"));

        String menu = " ";
        while (!menu.equals("quit")) {
            System.out.println("검색할 단어를 입력하시오: (종료 quit)");
            menu = sc.nextLine();

            for(Word a: arrayList) {
                if(a.getEng().equals(menu)) System.out.println(a);
                else System.out.println("일치하는 단어가 없습니다.");
            }
        }
        System.out.println("종료합니다.");
    }
}
