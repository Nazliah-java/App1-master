package Quiz2;

import java.time.LocalDate;

public class quiz60 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-1-01");
        System.out.println(date);
    }
}

// LocalDate.parse(CharSequence) method accepts String in "9999-99-99" format only.
// Single digit month and day value are padded with 0 to convert it to 2 digits.
// To represent 9th June 2018, format String must be "2018-06-09".
// If correct format string is not passed then an instance of
// java.time.format.DateTimeParseException is thrown.

