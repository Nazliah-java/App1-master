package Quiz2;

import java.util.ArrayList;
import java.util.List;

public class quiz31 {
    public static void main(String[] args){
        List<StringBuilder> days = new ArrayList<>();
        StringBuilder s = new StringBuilder("Sunday");
        days.add(s);
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if((new StringBuilder("Sunday").equals(s))){
            days.add(new StringBuilder("Wednesday"));
        }
        System.out.println(days.size());

    }
}

// StringBuilder class doesn't override equals(Object) method and hence days.contains(new
// StringBuilder("Sunday")) returns false.
// Code inside if-block is not executed and days.size() returns 3.
