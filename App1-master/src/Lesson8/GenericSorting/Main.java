package lesson8.GenericSorting;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {3, 5, 9, 1, 4};
        GenericSorting<Integer> intSorter = new GenericSorting<>();
        intSorter.sort(intArray, Comparator.naturalOrder());
        System.out.println("Sorted Integer Array: " + java.util.Arrays.toString(intArray));
        
        // Example usage with String array
        String[] stringArray = {"cat", "cow", "elephat", "rabbit"};
        GenericSorting<String> stringSorter = new GenericSorting<>();
        stringSorter.sort(stringArray, Comparator.naturalOrder());
        System.out.println("Sorted String Array: " + java.util.Arrays.toString(stringArray));
    }
}
