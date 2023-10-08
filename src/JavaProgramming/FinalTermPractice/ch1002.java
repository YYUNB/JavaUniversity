package JavaProgramming.FinalTermPractice;

class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

class Circle2 extends Shape {
    double radius;
    public Circle2(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }

}
public class ch1002 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        System.out.println(r.length + " * " + r.width +
                " 크기의 Rectangle: " + r.getArea());

        Circle2 c = new Circle2(4);
        System.out.println("반지름 " + c.radius + "인 Circle: "
                + c.getArea());
    }
}
