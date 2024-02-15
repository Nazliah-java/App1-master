package Lesson8.Example;

//border abstract class ialah extends kalau guna enheritance
//implement kena ada override

public class Circle extends Border implements Shape {

    private double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * this.radius;
    }

}
