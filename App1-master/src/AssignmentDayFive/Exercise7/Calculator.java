package AssignmentDayFive.Exercise7;

public class Calculator {
    
    //Add two integers
    public int add(int a, int b){
        return a + b;
    }

    //Add two floating-point numbers
    public double add(double a, double b){
        return a + b;
    }

    //Square of an integer
    public int square(int a){
        return a * a;
    }

    //square of floating-point number
    public double square(double a){
        return a * a;
    }

    //average of three integer
    public int average(int a, int b, int c){
        return (a + b + c) / 3;
    }

    //average of three floating-point numbers
    public double average(double a, double b, double c){
        return (a + b + c) / 3;
    }
}
