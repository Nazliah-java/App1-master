package Quiz2;

import java.util.ArrayList;
import java.util.List;

public class quiz50 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
    }
}

// It is possible to add null to ArrayList instant.
// Initially list has 3 elements: [null, null, null].
// remove(int) returns the deleted member of the list. In this case `list.remove(0);` returns
// null as null was deleted from the 0th index. So, list is left with 2 elements: [null, null].
// remove(Object) returns true if deletion was successful otherwise false. In this case
// `list.remove(null)` removes first null from the list and returns true and list is left with just
// one element: [null].
// Hence, the output is: 'null:true'.
