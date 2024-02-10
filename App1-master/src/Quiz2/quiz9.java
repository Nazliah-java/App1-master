package Quiz2;

import java.util.ArrayList;
//import java.lang.Integer;

public class quiz9 {
    public static void main(String[] args){
        //specify 
        ArrayList<Integer> original = new ArrayList<>();
        original.add(10);

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i1 = cloned.get(0);
        ++i1;

        System.out.println(cloned);
    }
}
