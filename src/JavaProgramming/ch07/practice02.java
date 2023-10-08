package ch07;

class Rocket {
    int x, y;

    public Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Rocket [x=" + x + ", y=" + y + "]";
    }

    public void MoveUp() {
        this.y += 1;
    }
}
public class practice02 {
    public static void main(String[] args) {
        Rocket obj = new Rocket(0, 0);
        obj.MoveUp();
        obj.MoveUp();
        obj.MoveUp();

        System.out.println(obj);
    }
}
