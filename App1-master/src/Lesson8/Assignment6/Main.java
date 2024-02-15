package lesson8.Assignment6;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Adlizal", 6389, 5000, 3500);
        Developer developer = new Developer("Nazliah", 6889, 120, 70);
        Intern intern = new Intern("Siti", 2821, 50, 60);

        manager.calculateSalary();
        developer.calculateSalary();
        intern.calculateSalary();

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}