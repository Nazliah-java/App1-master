package Quiz2;

import java.util.ArrayList;
import java.util.List;

public class quiz51 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Array");
        list.add(0, "List");

        System.out.println(list);
    }
}

// list.add(0, "Array"); means list --> [Array],
// list.add(0, "List"); means insert "List" to 0th index and shift "Array" to right. So after this
// operation, list --> [List, Array]. In the console, [List, Array] is printed.

