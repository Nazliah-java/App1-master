package lesson8.Assignment7;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 3);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle(6, 5);

        SortableShape[] shapes = {rectangle, circle, triangle};

        System.out.println("Unsorted shapes: ");
        for (SortableShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.area());
        }

        ShapeSorter.sort(shapes);
        System.out.println();

        System.out.println("Sorted shapes by area: ");
        for (SortableShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.area());
        }
    }
}
