package Interface;

public class Circle implements Shape {

    double x;
    double y;
    public final double PI = 3.14;

    double radius;

    public Circle(double radius) {
        this.radius = radius;
        x = 0.0;
        y = 0.0;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public void move(double xDistance , double yDistance) {
        x += xDistance;
        y += yDistance;
    }
}
