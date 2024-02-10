package AssignmentDayFive.Assignment;

public class Rectangle extends Shape {

    //Instance variable
    private double length;
    private double width;
    
    //Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Implementing the abstract method
    @Override
    double calculateArea(){
        return length * width;
    }
}
