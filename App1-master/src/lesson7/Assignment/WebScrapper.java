package lesson7.Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScrapper {
    public static void main(String[] args) {
        String url = "https://en.wikipedia.org/wiki/Java";
        String outputFile = "output.txt";

        try {
            //fetch HTML content of the webpage
            String htmlContent = fetchWebpageContent(url);

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Method to fetch HTML content of a webpage
    private static String fetchWebpageContent(String urlString){

    }

}
