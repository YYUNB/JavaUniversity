package ch08_02_RE;

class Dice {
    int dice = 0;

    public void rollDice() {
        dice = (int)(Math.random()*6+1);
    }
    public int getDice() {
        return dice;
    }
}
public class DiceTest {
    public static void main(String[] args) {
        Dice dice1 = new Dice(), dice2 = new Dice();
        int cnt = 0;
        boolean check = true;
        while(check) {
            cnt++;
            dice1.rollDice();
            dice2.rollDice();
            System.out.println("주사위1: " + dice1.getDice() + ", 주사위2: " + dice2.getDice());
            if(dice1.getDice()+ dice2.getDice() == 2) {
                System.out.println("(1, 1)이 나오는데 걸린 횟수: " + cnt);
                check = false;
            }
        }
    }
}
