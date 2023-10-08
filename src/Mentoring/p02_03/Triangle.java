package Mentoring.p02_03;

public class Triangle extends AbstractShape {
    double base, height;

    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height / 2;
    }

    public void resize(double ratio) {
        base = base * ratio;
        height = height * ratio;
    }
}
