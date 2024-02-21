package exam200224;

interface Blogger{
    default void blog() throws Exception{
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger{
    public void blog(){
        System.out.println("TRAVEL");
    }
}

public class q14 {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger();//line n1
        ((TravelBlogger)blogger).blog();//line n2
    }
}

//line n1: blogger refer to travelblogger