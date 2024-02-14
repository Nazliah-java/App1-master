package lesson7.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeleteFile {
    private String fileName;

    public DeleteFile(){
        
    }

    public void delete() throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        this.fileName = scanner.nextLine();

        File file = new File(this.fileName) ;
        if (file.delete()) {
            System.out.println("The file deleted!");
        }else{
            System.out.println("Doesnt found the file!");
        }

        scanner.close();
    }
}