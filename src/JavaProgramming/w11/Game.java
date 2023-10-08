package JavaProgramming.w11;

public class Game {
    static int MAX_X = 20;
    static int MAX_Y = 10;
    public static void main(String[] args) {
        int fishX = (int) (Math.random()*20);
        int fishY = (int) (Math.random()*10);
        Bear bear = new Bear(0, 0, 1);
        Fish fish = new Fish(fishX, fishY, 1);
        char[][] window = new char [MAX_Y][MAX_X];

        int bearMoveCnt = 0;
        int fishMove1 = (int) (Math.random()*5);
        int fishMove2 = (int) (Math.random()*5);
        while(fishMove1 == fishMove2) fishMove2 = (int) (Math.random()*5);
        boolean fMC1 = false, fMC2 = false;

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        while(!fish.collide(bear)) {
            for (int i = 0; i < MAX_Y; i++) {
                for (int j = 0; j < MAX_X ; j++) window[i][j] = '-';
            }
            window[bear.getY()][bear.getX()] = bear.getShape();
            window[fish.getY()][fish.getX()] = fish.getShape();
            for (int i = 0; i < MAX_Y; i++) {
                for (int j = 0; j < MAX_X ; j++) System.out.print(window[i][j]);
                System.out.println();
            }
            bear.move();
            if (bearMoveCnt == fishMove1) {
                fish.move();
                fMC1 = true;
            }
            else if (bearMoveCnt == fishMove2) {
                fish.move();
                fMC2 = true;
            }
            bearMoveCnt++;

            if (fMC1 && fMC2) {
                bearMoveCnt = 0;
                fishMove1 = (int) (Math.random()*5);
                while(fishMove1 == fishMove2) fishMove2 = (int) (Math.random()*5);
                System.out.println("움직일 시간: " + fishMove1 + " " + fishMove2);
                fMC1 = false;
                fMC2 = false;
            }
        }
        for (int i = 0; i < MAX_Y; i++) {
            for (int j = 0; j < MAX_X ; j++) window[i][j] = '-';
        }
        window[bear.getY()][bear.getX()] = bear.getShape();
        for (int i = 0; i < MAX_Y; i++) {
            for (int j = 0; j < MAX_X ; j++) System.out.print(window[i][j]);
            System.out.println();
        }
        System.out.println("Bear Wins!! ");
    }
}
