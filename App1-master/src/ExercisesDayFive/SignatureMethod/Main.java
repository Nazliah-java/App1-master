package ExercisesDayFive.SignatureMethod;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

       int resultA = calculator.add(1, 2);
       System.out.println("Result of adding two integers: " + resultA);

       double resultB = calculator.add(3.6, 4.1);
       System.out.println("Result of adding two floating-point numbers: " + resultB);

        int resultC = calculator.square(2);
        System.out.println("Result of square two integers: " + resultC);

        double resultD = calculator.square(2.6);
        System.out.println("Result of floating-point numbers: " + resultD);

        int resultE = calculator.average(4, 6, 2);
        System.out.println("Average of three integers: " + resultE);

        double resultF = calculator.average(4.3, 6.1, 2.4);
        System.out.println("Average of three floating-point numbers: " + resultF);
    }
}
