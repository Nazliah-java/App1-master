package ExercisesDayFive.POJO;

public class Person {
    private String name;
    private int age;
    private String email;

    //Constructor
    public Person(){
        
    }

    //Person = as Pojo (primary key, foreign key)
    //(...) = fields
    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //Add getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}







