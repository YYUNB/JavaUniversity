package JavaProgramming.FinalTermPractice.ch1005;

import java.util.Scanner;

public class Bear extends GameObject {
    private Scanner sc = null;

    public Bear(int x, int y, int distance) {
        super(x, y, distance);
        sc = new Scanner(System.in);
    }

    @Override
    public void move() {
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        char c;
        c = sc.next().charAt(0);
        switch (c) {
            case 'a':
                x--;
                if (x<0) x=0;
                break;
            case 'f':
                x++;
                if (x>= Game.MAX_X) x = Game.MAX_X - 1;
                break;
            case 'd':
                y--;
                if(y<0) y = 0;
                break;
            case 's':
                y++;
                if(y>=Game.MAX_Y) y = Game.MAX_Y -1;
                break;
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}