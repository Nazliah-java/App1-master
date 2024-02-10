package AssignmentDayFive.Assignment;

public class Circle extends Shape{

    //Instance variable
    private double radius;

    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Implementing the abstract method
    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
