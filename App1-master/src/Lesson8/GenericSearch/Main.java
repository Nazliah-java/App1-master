package lesson8.GenericSearch;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {1, 2, 3, 4};
        GenericSearch<Integer> intSearch = new GenericSearch<>();
        int linearResult = intSearch.linearSearch(intArray, 3, Comparator.naturalOrder());
        int binaryResult = intSearch.binarySearch(intArray, 3, Comparator.naturalOrder());
        System.out.println("Linear Search (Integer): Index of 3 is " + linearResult);
        System.out.println("Binary Search (Integer): Index of 3 is " + binaryResult);

        // Example usage with String array
        String[] stringArray = {"cow", "cat", "elephant", "dog"};
        GenericSearch<String> stringSearch = new GenericSearch<>();
        int linearStringResult = stringSearch.linearSearch(stringArray, "cow", Comparator.naturalOrder());
        int binaryStringResult = stringSearch.binarySearch(stringArray, "cow", Comparator.naturalOrder());
        System.out.println("\nLinear Search (String): Index of 'cow' is " + linearStringResult);
        System.out.println("Binary Search (String): Index of 'cow' is " + binaryStringResult);
    }
}
