package AssignmentDayFive.Inheritance;

public class Animal {
    private String name;
    private String sound;

    // Constructor
    //public  Animal(){

   // }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println(sound);
    }

    // Getter methods
   public String getName() {
      return name;
    }

    public String getSound() {
     return sound;
   }

    // Setter methods
    //public void setName(String name) {
      //  this.name = name;
    //}

    //public void setSound(String sound) {
        //this.sound = sound;
    //}
}



