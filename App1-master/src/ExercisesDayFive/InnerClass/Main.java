package ExercisesDayFive.InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner("Inner Object");
        System.out.println("Inner name: " + inner.getName());
    }
}
