package AssignmentDayFive.Inheritance;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Method to make sound

    public void animalName(){
      System.out.println(name);
    }

    public void makeSound() {
        System.out.println(sound);
    }

}



