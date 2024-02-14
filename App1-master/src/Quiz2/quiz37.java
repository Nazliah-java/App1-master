package Quiz2;

import java.util.function.Predicate;

public class quiz37 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
        Predicate<String> pr1 = s -> s.length() < 4;
        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate){
        for(String str : arr){
            if(predicate.test(str)){
                System.out.println(str);
            }
        }
    }
}

// Though Predicate is a generic interface but raw type is also allowed. Type of the variable
// in lambda expression is inferred by the generic type of Predicate<T> interface.
// In this case, Predicate pr1 = s -> s.length() < 4; Predicate is considered of Object type so
// variable "s" is of Object type and Object class doesn't have length() method. So, s.length()
// causes compilation error.
