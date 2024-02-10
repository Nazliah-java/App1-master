package AssignmentDayFive.Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Adlizal", 35, 1063);

        //using setter method to set values
        student.setName("Siti Nazliah Binti Borhan");
        student.setAge(25);
        student.setRollNumber(1068);

        //using getter method to retrieve values
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
