package exam200224;

public class q23 {
    public static void main(String[] args) {
        System.out.println(new RuntimeException());
        System.out.println(new RuntimeException("HELLO"));
        System.out.println(new RuntimeException(new RuntimeException("HELLO")));
    }
}
