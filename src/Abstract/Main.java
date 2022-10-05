package Abstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(3.0));
        shapes.add(new Square(4.0));
        shapes.add(new Rectangle(3.0 , 4.0));

        for(Shape shape : shapes) {
            System.out.println("넓이 : " + shape.getArea());
            shape.move(3 , 5);
            System.out.println("x : " + shape.getX() + " y : " + shape.getY());
            shape.move(-2 , 3);
            System.out.println("x : " + shape.getX() + " y : " + shape.getY());
        }
    }
}
