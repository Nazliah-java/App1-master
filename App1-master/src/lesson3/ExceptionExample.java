package lesson3;

//import java.util.Scanner;
import java.io.IOException; //add throws IOException
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionExample {

    public static void main(String[] args)throws IOException{ //adding throws IOException to handle posibility IOException been thrown when using readLine()
        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your first name: ");
        //String firstName = scanner.nextLine();
        String firstName = reader.readLine(); //used readLine to read user input from the console

        System.out.print("Enter your last name: ");
       //String lastName = scanner.nextLine();
       String lastName = reader.readLine();

        System.out.println("Welcome, " + firstName + " " + lastName + ".");
    }
    
}
