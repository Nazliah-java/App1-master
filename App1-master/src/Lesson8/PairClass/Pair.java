package lesson8.PairClass;

public class Pair<A, B>{
    private A first;
    private B second;

    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }

    //getter method
    public A getFirst(){
        return first;
    }

    public B getSecond(){
        return second;
    }

    //setter method
    public void setFirst(A first){
        this.first = first;
    }

    public void setSecond(B second){
        this.second = second;
    }
}
