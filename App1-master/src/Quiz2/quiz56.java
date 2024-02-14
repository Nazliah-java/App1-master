package Quiz2;

public class quiz56 {
    public static void main(String[] args) {
        int x = 5;
        while(x < 10)
        System.out.println(x);
        x++;
    }
}

// while loop doesn't have curly bracket over here, so only System.out.println(x) belongs to
// while loop.
// Above syntax can be written as follows:
// int x = 5;
// while (x < 10) {
// System.out.println(x);
// }
// x++;
// As x++; is outside loop, hence value of x is always 5 within loop, 5 < 10 is true for all the
// iterations and hence infinite loop.

