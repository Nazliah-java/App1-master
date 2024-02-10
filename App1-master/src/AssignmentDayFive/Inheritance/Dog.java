package AssignmentDayFive.Inheritance;

// Dog class inherits from Animal class
public class Dog extends Animal {

    // Constructor
    public Dog(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }

}


