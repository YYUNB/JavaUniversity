package ch06RE;

public class p07 {
    public static void main(String[] args) {
        String[] symbol = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int i=0; i<5; i++) {
            int sindex = (int)(Math.random()*4);
            int nindex = (int)(Math.random()*13);
            System.out.printf("%s의 %s\n", symbol[sindex], number[nindex]);
        }
    }
}
