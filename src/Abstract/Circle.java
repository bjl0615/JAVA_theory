package Abstract;

public class Circle extends Shape{
    public final double PI = Math.PI;

    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

}
