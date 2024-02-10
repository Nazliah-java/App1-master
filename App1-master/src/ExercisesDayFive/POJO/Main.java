package ExercisesDayFive.POJO;

public class Main {
    public static void main(String[] args){

        Person person = new Person();

        //Setting the values using the get() method
        person.setName("Nazliah");
        person.setAge(25);
        person.setEmail("nazliah@gmail.com");

        //Getting the values using the get() method
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
    }
}
