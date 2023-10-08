package JavaProgramming.ch11;
import java.util.Iterator;

public class IteratorTest implements Iterator{
    int cnt = -1;
    private String[] cardNames = {
            "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace" };

    public boolean hasNext() {
        if (cnt == 12) return false;
        else return true;
    }
    public Object next() {
        Object n = cardNames[cnt+1];
        cnt++;
        return n;
    }

    public static void main(String[] args) {
        IteratorTest it = new IteratorTest();
        while(it.hasNext()) {
            System.out.println("next() 가 반환하는 값: " + it.next());
        }
    }
}

