package Quiz2.quiz18;

public class Student {
    String name;
    int age;

    Student(){
        //Student("James", 25);
        this("James", 25);
        //*corrected to use this to call another constructor */
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}


