package exam200224;

class Base{
    int id = 1000;

    Base(){
        Base();
    }

    void Base(){
        System.out.println(++id);
    }
}

class Derived extends Base{
    int id = 2000;
    
    Derived(){}

    void Base(){
        System.out.println(--id);
    }
}

public class q27 {
    public static void main(String[] args) {
        Base base = new Derived();
    }
}
