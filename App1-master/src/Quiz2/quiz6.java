package Quiz2;

public class quiz6 {
    public static void main(String[] args){
        
        //declare as character sequence
        CharSequence chaSeq = "char";
        String iStr = new String("nazlaih");
        m1(chaSeq);
        //null is no value, so it cant detect
        //null means absent
        m1(null);
        m1("String");
        m1('a');
    }

    static void m1(CharSequence s){
        System.out.println("CharSequence");
    }

    static void m1(String s){
        System.out.println("String");
    }

    static void m1(Object s){
        System.out.println("Object");
    }
    
}

//this is call overloading because have 3
