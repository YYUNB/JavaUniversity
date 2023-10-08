package MidTermPractice;

public class ch0607 {
    public static void main(String[] args) {
        String[] sym = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10"
                , "Jack", "Queen", "King", "Ace"};
        for(int i=0; i<5; i++) {
            int sym_index = (int)(Math.random()*4);
            int num_index = (int)(Math.random()*13);
            System.out.println(sym[sym_index] + "의 " + num[num_index]);
        }

    }
}
