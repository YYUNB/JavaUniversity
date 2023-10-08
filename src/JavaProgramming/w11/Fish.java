package JavaProgramming.w11;

public class Fish extends GameObject{
    public Fish(int x, int y, int distance) {
        super(x, y, distance);
    }
    @Override
    public void move() {
        int way = (int)(Math.random() * 4);
        switch(way) {
            case 0:
                x--;
                if (x<0) x=0;
                break;
            case 1:
                x++;
                if (x >= Game.MAX_X) x = Game.MAX_X -1;
                break;
            case 2:
                y--;
                if (y<0) y=0;
                break;
            case 3:
                y++;
                if (y >= Game.MAX_Y) y = Game.MAX_Y -1;
                break;
        }
    }
    @Override
    public char getShape() {
        return '@';
    }
}
