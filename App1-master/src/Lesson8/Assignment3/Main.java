package lesson8.Assignment3;

public class Main {
    public static void main(String[] args) {
        
        // instances
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.start();
        car.accelerate(25);
        car.brake(10);
        car.stop();

        bicycle.start();
        bicycle.accelerate(15);
        bicycle.brake(5);
        bicycle.stop();
    }
    
}
