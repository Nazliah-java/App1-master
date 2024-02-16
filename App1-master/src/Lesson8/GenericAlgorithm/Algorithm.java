package lesson8.GenericAlgorithm;

import java.util.Arrays;

public class Algorithm<T> {
    public void execute(T[] input){
        Arrays.sort(input);
        System.out.println("Array after sorting: " + Arrays.toString(input));
    }

    public void execute(T[] input, T value){
        if(listSorted(input)){
            Arrays.sort(input);
            System.out.println("Array sorted for searching: " + Arrays.toString(input));
        }

        int index = binarySearch(input, value);

        if(index != -1){
            System.out.println("Element " + value + "found at index: " + index);
        }else{
            System.out.println("Element " + value + "not found in the array.");
        }
    }

}