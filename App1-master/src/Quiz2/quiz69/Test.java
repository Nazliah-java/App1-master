package Quiz2.quiz69;

public class Test {
    public static void change(Message m) {
        m.msg = "Happy Holidays!";
        
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }
    
}
