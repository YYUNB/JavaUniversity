package Mentoring.p02_03;

public class Circle extends AbstractShape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * 3.14;
    }

    public void resize(double ratio) {
        radius = radius * ratio;
    }
}
