package Quiz2;


abstract class Helper{
    private int num = 100;
    String operation = null;

    protected abstract void help();

    void log(){
        System.out.println("Helper-log");
    }

}

public class LogHelper{
    private int num = 200;
    protected String operation = "LOGGING";

    void help({
        System.out.println("LogHelper-log");
    });
}

public static void main(String[] args){
    
}
