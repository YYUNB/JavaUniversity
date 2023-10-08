package JavaProgramming.FinalTermPractice;

class Circle1 {
    int x, y, radius;
    public Circle1(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void move(Circle1 c, int dx, int dy) {
        c.x += dx;
        c.y += dy;
    }

    public String toString() {
        return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}
public class ch0903 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(10, 10, 5);
        System.out.println("move() 호출 전");
        System.out.println(c);
        c.move(c, 10, 20);
        System.out.println("move() 호출 후");
        System.out.println(c);
    }
}
