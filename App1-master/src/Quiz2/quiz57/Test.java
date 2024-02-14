package Quiz2.quiz57;

public class Test {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        System.err.println(obj.getRegistrationNumber());
    }

}

// class Car doesn't extend from Vehicle class, this means Vehicle is not super type of Car.
// Hence, Vehicle obj = new Car(); causes compilation error.
