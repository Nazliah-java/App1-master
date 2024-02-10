package Quiz2;

import java.time.LocalDate;
import java.time.Period;

public class quiz11 {
    public static void main(String[] args){
        //parse character sequence, do for day check
        LocalDate date = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));
    }
}
