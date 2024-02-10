package AssignmentDayFive.Polymorphism;

public class TestShape {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(6, 3);

        Circle circle = new Circle (3.2);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());
    }
}
