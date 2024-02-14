package Quiz2;

public class quiz30 {
    public static void main(String[] args){
        char c = 'z';
        long l = 100_001;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;

        l = c + i;
        f = c * 1 * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;

// l = c + i; => Left side variable 'l' is of long type and right side expression evaluates to an int
// value, which can easily be assigned to long type. No compilation error here.
// f = c * l * i * f; => Left side variable 'f' is of float type and right side expression evaluates to
// float value, which can easily be assigned to float type. Hence, it compiles successfully.
// 30. Consider below code, Does above code compile successfully? *
// f = l + i + c; => Left side variable 'f' is of float type and right side expression evaluates to
// long value, which can easily be assigned to float type. Hence, no issues here.
// i = (int)d; => double can't be assigned to int without explicit casting, right side expression
// `(int)d;` is casting double to int, so no issues.
// f = (long)d; => double can't be assigned to float without explicit casting, right side
// expression `(long)d;` is casting double to long, which can easily be assigned to float type.
// It compiles successfully.

    }
}
