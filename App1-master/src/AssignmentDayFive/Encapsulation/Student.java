package AssignmentDayFive.Encapsulation;

public class Student {
    
    private String name;
    private int age;
    private int rollNumber;

    //Constructor
    public Student(){

    }

    public Student(String name, int age, int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    //Add getter method
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }  

    public int getRollNumber(){
        return rollNumber;
    }

    //Add setter method
    public void setAge(int age){
        this.age = age;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setName(String name){
        this.name = name;
    }
}
