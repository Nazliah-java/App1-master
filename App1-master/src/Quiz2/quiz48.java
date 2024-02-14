package Quiz2;

import java.util.ArrayList;
import java.util.List;

public class quiz48 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        if(list.remove(2)){
            list.remove("THREE");
        }

        System.out.println(list);
    }
    
}

// list.remove(Object) method returns boolean result but list.remove(int index) returns the
// removed item from the list, which in this case is of String type and not Boolean type and
// hence if(list.remove(2)) causes compilation error.
