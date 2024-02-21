package exam200224;

import java.util.ArrayList;
import java.util.List;

public class q20 {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>();//line n1
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4));//line n2
        System.out.println(list);
    }
}

//line n1 = [A, E, I, O, U]
//subList(0,4), four element= [A,E,I,O]
