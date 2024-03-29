package lesson7.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

    private String fileName, line;

    //constructor
    public CountWords(String fileName){
        this.fileName = fileName;
    }

    //method
    public void countWord() throws IOException{
        int num = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String[] words = line.split("\\s");

            for(String word:words){
                num += !word.isEmpty() ? 1 : 0;
                //System.out.println(word);
            }
        }
        reader.close();

        System.out.println("Number of word = " + num);
    }
}