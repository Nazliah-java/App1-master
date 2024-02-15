package lesson7.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String fileName, line;

    //creating an instance of ReadFile with the file name 
    public ReadFile(String fileName){
        this.fileName = fileName;
    }

    //read method
    //creates BufferedReader object by wrapping a FileReader object around the file specified by fileName
    public void read() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        //use while loop to read until reached redline returns null
        while ((line = reader.readLine()) != null) {
            System.out.println(line);   //it print each line to the console
        }
        reader.close(); //close BufferedReader
    }
}
