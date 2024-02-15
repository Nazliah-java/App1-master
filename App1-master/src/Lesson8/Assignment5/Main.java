package lesson8.Assignment5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maxx", 2);
        Cat cat = new Cat("Lolo", 3);
        Bird bird = new Bird("Rainbow", 1);

        dog.eat();
        dog.sleep();
        dog.makeSound();
        System.out.println();

        cat.eat();
        cat.sleep();
        cat.makeSound();
        System.out.println();

        bird.eat();
        bird.sleep();
        bird.makeSound();
        System.out.println();
    }
}
