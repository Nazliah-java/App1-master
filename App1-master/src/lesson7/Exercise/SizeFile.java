package lesson7.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SizeFile {
    private String fileName;

    public SizeFile(){
        
    }

    public void size() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        this.fileName = scanner.nextLine();

        System.out.println("File size: " + Files.size(Paths.get(fileName)));

        scanner.close();        
    }
}