package ch06_01;

public class practice07 {
    public static void main(String[] args) {
        String[] symbol = {"Clubs", "Diamonds", "Heart", "Spades"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int i=0; i<5; i++) {
            int sIndex = (int)(Math.random() * 4);
            int nIndex = (int)(Math.random() * 13);
            System.out.println(symbol[sIndex] + " 의 " + number[nIndex]);
        }
    }
}
