package Abstract;

public abstract class Shape {
    /*
        추상 킁래스(Abstract)사용시 모든 메소드에 abstract를 붙여 주어야 함
     */
    private double x , y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double x , double y) {
        this.x += x;
        this.y += y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
