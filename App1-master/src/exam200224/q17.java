package exam200224;

public class q17 {
    public static void test() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {
        try{
            test();
        }catch (Exception e){
            System.out.println("GAME ON");
        }
    }
}
