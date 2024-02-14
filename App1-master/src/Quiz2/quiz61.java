package Quiz2;

public class quiz61 {

    public static boolean flag = !true;

    public static void main(String[] args) {
        System.out.println(!flag ? args[0] : args[1]);
    }
    
}

// There is no compilation error. When Test class is loaded by JVM to invoked main(String [])
// method, static variable declaration and initialization statement is executed and false is
// assigned to flag as !true is false.
// As java Test AM PM command is used, so args[0] --> "AM" and args[1] --> "PM".
// In ternary operator, boolean expression is evaluated first, !flag evaluates to true and
// therefore agrs[0] is returned.
// AM is printed on to the console