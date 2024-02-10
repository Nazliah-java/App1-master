package AssignmentDayFive.Assignment;

//shape class
public abstract class Shape {
    
    //abstract method to calculate area
    abstract double calculateArea();

    //Main 
    public static void main(String[] args) {
        
        //Creating circle
        Circle circle = new Circle(6);
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);

        //Creating rectangle
        Rectangle rectangle = new Rectangle(13, 5.5);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
