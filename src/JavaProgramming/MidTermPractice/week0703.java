package MidTermPractice;

class Dice {
    int value = 0;

    int rollDice(){
        return (int)(Math.random()*6+1);
    }

}
public class week0703 {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        int cnt = 0;
        while (true) {
            cnt++;
            System.out.println("주사위1: " + dice1.rollDice() + "   주사위2: " + dice2.rollDice());
            if (dice1.rollDice() + dice2.rollDice() == 2) {
                System.out.println("(1, 1)이 나오는 데 걸린 횟수: " + cnt);
                break;
            }
        }
    }
}
