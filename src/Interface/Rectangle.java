package Interface;

public class Rectangle implements Shape {
    double side1;
    double side2;

    double x;
    double y;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
         x = 0.0;
         y = 0.0;
    }

    public double getArea() {
        return side1 * side2;
    }

    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    public void move(double xDistance , double yDistance) {
        x += xDistance;
        y += yDistance;
    }
}
