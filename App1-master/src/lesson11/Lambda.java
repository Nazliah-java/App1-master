package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    static List<Integer> ary = Arrays.asList(1,2);
    static List<Integer> ary_filtered = new ArrayList<>();
    
    static void filter(){
        List<Integer> temp = new ArrayList<>();
        ary.forEach((a) -> {
            if(a.equals(1)){
                ary_filtered.add(a);
            }
        }
        );
    }

    public static void main(String[] args) {
        System.out.println("List of items in array");
        ary.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("Filtered list of items");
        filter();
        ary_filtered.forEach((a) -> System.out.println(a));
        
        /* System.out.println("Sorted list of items in array");
        ary.forEach((a) -> System.out.println(a));

        System.out.println("Mapped list of items in array");
        ary.forEach((a) -> System.out.println(a));

        System.out.println("Reduced list of items in array");
        ary.forEach((a) -> System.out.println(a));
        */
 
        // filter, sort, map, reduce
    }
}