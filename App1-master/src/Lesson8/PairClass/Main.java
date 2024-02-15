package lesson8.PairClass;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Test");

        //Getting and printing
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        //Modifying the elements of the pair
        pair.setFirst(10);
        pair.setSecond("Assignment 2");

        //Getting and printing the modified elements of the pair
        System.out.println("Modified First: " + pair.getFirst());
        System.out.println("Modified Second: " + pair.getSecond());
    }
}

