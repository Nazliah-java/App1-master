package lesson8.GenericMaximizer;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        
        //Integer
        Integer[] intArray = { 6, 8, 1, 9, 9};
        Maximizer<Integer> intMaximizer = new Maximizer<>();
        Integer intMax = intMaximizer.findMaximum(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Maximum value: " + intMax);

        //Double
        Double[] doubleArray = { 6.8, 6.3, 9.9, 8.9, 28.8};
        Maximizer<Double> doubleMaximizer = new Maximizer<>();
        Double doubleMax = doubleMaximizer.findMaximum(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("Maximum value: " + doubleMax);
    }
}
