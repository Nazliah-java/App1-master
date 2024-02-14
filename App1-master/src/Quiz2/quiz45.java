package Quiz2;

import java.util.ArrayList;
import java.util.List;

public class quiz45 {
    public static void main(String[] args) {
        List<Integer> list new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));

        System.out.println(list);
    }
}

//So, 4 items gets added to the list: [100, 200, 100, 200]. list.remove(new Integer(100));
//removes the first occurrence of 100 from the list, which means the 1st element of the list.
