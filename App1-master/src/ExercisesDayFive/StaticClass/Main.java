package ExercisesDayFive.StaticClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result of adding 10 and 5 is: " + MathUtils.Add(10, 5));
        System.out.println("Result of subtracting 8 from 15 is: " + MathUtils.Subtract(15, 8));

        int number = 17;
        if(MathUtils.isEven(number))
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
        
    }
}
