package lesson8.Assigment1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 3.1);
        Rectangle rectangle = new Rectangle("blue", false, 6.0, 4.0);
        Square square = new Square("green", true, 3.0);

        System.out.println("Circle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        System.out.println("Rectangle: " + rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        System.out.println("Square: " + square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

    }
}
