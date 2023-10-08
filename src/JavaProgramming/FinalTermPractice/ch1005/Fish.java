package JavaProgramming.FinalTermPractice.ch1005;

public class Fish extends GameObject{
    int cnt;
    int move[] = {6, 6};

    public Fish(int x, int y, int distance) {
        super(x, y, distance);
        this.cnt = 0;
        this.move = new int[2];
    }

    @Override
    protected void move() {
        if (cnt == 0) {
            for (int i = 0; i < move.length; i++) {
                move[i] = (int)(Math.random()*5)+1;
                if(move[0] == move[1]) {
                    i--;
                    break;
                }
            }
        }
        cnt++;

        if (cnt == move[0] || cnt == move[1]) {
            int d = (int)(Math.random()*4);
            switch(d) {
                case 0:
                    x--;
                    if (x<0) x=0;
                    break;
                case 1:
                    x++;
                    if (x>= Game.MAX_X) x = Game.MAX_X - 1;
                    break;
                case 2:
                    y--;
                    if(y<0) y = 0;
                    break;
                case 3:
                    y++;
                    if(y>=Game.MAX_Y) y = Game.MAX_Y -1;
                    break;
            }
            System.out.println("fish move!");
        }

        if (cnt == 5) {
            cnt = 0;
            move[0] = 6;
            move[1] = 6;
            for (int i = 0; i < 2; i++) {
                move[i] = (int)(Math.random()*5)+1;
                for (int j = 0; j < i ; j++) {
                    if(move[i] == move[j]) {
                        i--;
                        break;
                    }
                }
            }
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}
