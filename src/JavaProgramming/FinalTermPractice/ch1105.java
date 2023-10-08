package JavaProgramming.FinalTermPractice;

import java.util.Iterator;
public class ch1105 implements Iterator {
    private String[] cardNames = {
            "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace"};

    int current = 0;
    public boolean hasNext() {
        if(current == cardNames.length) return false;
        else return true;
    }

    public Object next() {
        Object card = cardNames[current];
        current++;
        return card;
    }

    public static void main(String[] args) {
        ch1105 c = new ch1105();
        while(c.hasNext()) {
            System.out.println("next()가 반환하는 값: " + c.next());
        }
    }
}
