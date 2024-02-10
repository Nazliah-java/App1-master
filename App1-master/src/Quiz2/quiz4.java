package Quiz2;

import java.util.function.Predicate;

public class quiz4 {
    public static void main(String[] args){
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        //predicates means pass the function
        //p will take every value
        //when return true, print true
        //
        Predicate <String> func = p -> true;
        Predicate <String> func2 = g -> g == "A";
        
        processStringArray(arr, func, func2);
    }

    //predicate function has test function
    public static void processStringArray(String [] arr, Predicate <String> predicate,  Predicate<String> prediacte2){

        for(String str : arr){
            if(predicate.test(str)){
                System.out.println(str);
            }
        }
    } 

}
