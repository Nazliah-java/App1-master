package exam200224;

public class q24 {

    public static void convert(String s)
    throws IllegalArgumentException, RuntimeException, Exception{
        if(s.length() == 0){
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
        }
    }

    public static void main(String[] args) {
        try{
            convert("");
        }
        //catch(IllegalArgumentException, RuntimeException, Exception)
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //follow exception hierarchy
}
