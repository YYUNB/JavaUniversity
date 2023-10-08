package Mentoring.p02_03;

public class Rectangle extends AbstractShape {
    double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public void resize(double ratio) {
        width = width * ratio;
        height = height * ratio;
    }
}
