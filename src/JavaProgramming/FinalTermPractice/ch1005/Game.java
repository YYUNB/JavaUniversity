package JavaProgramming.FinalTermPractice.ch1005;


public class Game {
    static final int MAX_X = 20;
    static final int MAX_Y = 10;

    public static void main(String[] args) {
        Bear b = new Bear(0, 0, 1);

        int fx = (int)(Math.random()*20);
        int fy = (int)(Math.random()*10);
        Fish f = new Fish(fx, fy, 1);

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        while(!b.collide(f)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                    if(b.getX() == j && b.getY() == i) System.out.print(b.getShape());
                    else if (f.getX() == j && f.getY() == i) System.out.print(f.getShape());
                    else System.out.print("-");
                }
                System.out.println();
            }
            b.move();
            f.move();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if(b.getX() == j && b.getY() == i) System.out.print(b.getShape());
                else System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("Bears Wins!!");
    }
}
