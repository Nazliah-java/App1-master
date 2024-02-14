package Quiz2.quiz27;

class Parent {
    public String toString(){
        return "Inner";
    }
}

class Child extends Parent{
    public String toString(){
        return super.toString().concat("Peace!");
    }
}
