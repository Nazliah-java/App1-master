package ExercisesDayFive.AbstractClasses;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);


        System.out.println("Area of ractangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
    
}
