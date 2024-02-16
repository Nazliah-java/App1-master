package lesson8.GenericAlgorithm;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {2, 5, 1, 8, 6};
        Algorithm<Integer> intAlgorithm = new Algorithm<>();
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        intAlgorithm.execute(intArray);

        String[] stringArray = {"cow", "cat", "rabbit", "elephant", "snake"};
        Algorithm<String> stringAlgorithm = new Algorithm<>();
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        stringAlgorithm.execute(stringArray);

        //Search
        System.out.println();
        Algorithm<String> stringSort = new Algorithm<>();
        stringSort.execute(stringArray, "cat");


        
    
    }
}
