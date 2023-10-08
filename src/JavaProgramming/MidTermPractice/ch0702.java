package MidTermPractice;
import java.util.Scanner;

class Rocket {
    int x, y;

    Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void Moveleft() {
        x--;
    }
    void Moveright() {
        x++;
    }
    void Moveup() {
        y++;
    }
    void Movedown() {
        y--;
    }

    public String toString() {
        return "Rocket x: " + x + ", y: " + y;
    }

}
public class ch0702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rocket rocket = new Rocket(0, 0);

        int menu = 0;
        while (menu != 5) {

            System.out.println("=================");
            System.out.println("   Rocket MOVE   \n");
            System.out.println("1. 왼쪽으로 이동");
            System.out.println("2. 오른쪽으로 이동");
            System.out.println("3. 위로 이동");
            System.out.println("4. 아래로 이동");
            System.out.println("5. 종료");
            System.out.println("=================");
            menu = sc.nextInt();

            switch(menu) {
                case 1:
                    rocket.Moveleft();
                    System.out.println(rocket);
                    break;
                case 2:
                    rocket.Moveright();
                    System.out.println(rocket);
                    break;
                case 3:
                    rocket.Moveup();
                    System.out.println(rocket);
                    break;
                case 4:
                    rocket.Movedown();
                    System.out.println(rocket);
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    break;
            }
        }
    }
}
