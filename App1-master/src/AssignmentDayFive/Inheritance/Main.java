package AssignmentDayFive.Inheritance;

public class Main {
        public static void main(String[] args) {
          Animal animal = new Animal("Molly", "pening");
          Dog dog = new Dog("Buddy", "Test");
    

            //call makesound method
            //System.out.println();
            //animal.makeSound();

            //Call makeSound method for dog
            System.out.print("Dog Name: ");
            animal.animalName();

            System.out.print("Dog Sound: " );
            dog.makeSound();
    
    
        }
}
