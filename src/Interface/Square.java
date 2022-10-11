package Interface;

public class Square implements Shape {
    double side;

    double x;
    double y;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public void move(double xDistance, double yDistance) {
        x += xDistance;
        y += yDistance;
    }
}
