package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//import java.util.Collections;

public class AssignmentDay4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");         //use scanner to get input for length, max number, min number
        int len = scanner.nextInt();

        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();

        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();

        //validate input to ensure maximum number is greater than minimum number
        if (max <= min){
            System.out.println("Maximum number must be greater than minimum number!");
            return;
        }

       int [] randoms = generateRandomArray(len, max, min);

       //sorting the array
       Arrays.sort(randoms);

        //print the generated random numbers
        System.out.println(Arrays.toString(randoms));

        //calculate the mean of the genarted random number
        double mean = calculateMean(randoms);
        //print the mean
        System.out.println("Mean values: " + mean);

        //find mod
        int mod = findMod(randoms);
        //print the mod
        System.out.println("Mod of this array is: " + mod);

        //Median
        double med = findMedian(randoms);
        //print the median
        System.out.println("Median of this array is: " + med);
    }

    //method to generate an array of random numbers
    public static int[] generateRandomArray(int length, int max, int min){
        int[] array = new int[length];
        Random random = new Random();
        
        for(int i = 0; i < length; i++){
            int rand = random.nextInt(max);
            array[i] = rand > min ? rand : rand + min;
        }

        return array;
    }

    //Method to calculate the mean of an array
    public static double calculateMean(int[] numbers){
        if(numbers.length == 0){    //check the array is empty
            return 0;
        }

        int sum = 0;
        for(int num : numbers){
            sum += num;             //summing up all numbers
        }

        return(double) sum / numbers.length; //dividing the sum by the total number of elements in the array
    }

    //Method to find the mod of an array
    public static int findMod(int[] d){
        int k, count;
        int n = d.length;
        int maxCount = 0;
        int mod = d[0];

        for (int i = 0; i < n; i++){
            k = d[i];
            count = 0;
            for (int j = 0; j < n; j++){
                if (d[j] == k){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                mod = d[i];
            }
        }

        if(maxCount == 1){
            mod = maxCount; //salah
        }
    

        return mod;
    }
    

        public static double findMedian(int[] d){
            double med;
            int n = d.length;

            if (n % 2 == 0){
                int i = (n -1) / 2;
                int i2 = n / 2;
                med = ((double)d[i] + (double)d[i2]) / 2;
                //return(double)d[n/2];}
            }else{
                int i = n/2;
                med = d[i];
                //return(double)(d[(n - 1) / 2]);
            }
            return med;
        }


        }
    
    
