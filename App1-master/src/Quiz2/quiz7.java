package Quiz2;

import java.util.ArrayList;
import java.util.List;

public class quiz7 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);

    }
}
