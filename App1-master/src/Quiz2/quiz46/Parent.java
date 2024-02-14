package Quiz2.quiz46;

public class Parent {
    int i = 10;
    Parent(int i){
        super();
        this.i = i;
    } 
}

class Child extends Parent{
    int j = 20;

    Child(int j){
        super(0);
        this.j = j;
    }

    Child(int i, int j){
        super(i);
        this(j);
    }
}

// Child(int, int) constructor has both super(i) and this(j) statements. A constructor should
// have super(...) or this(...) but not both. Hence Child(int, int) causes compilation failure.

