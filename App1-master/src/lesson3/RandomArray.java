package lesson3;

import java.util.Arrays;

public class RandomArray {

    public static void main(String[] args){
        int length = 10;
        int min = 70;
        int max = 99;
        int[] randoms = randomIntArray(length, min, max);
        System.out.println(Arrays.toString(randoms));
    }

    public static int[] randomIntArray(int length, int min, int max){
        
        int[] a = new int[length];

        for (int i = 0; i < length; i++){
            a[i] = (int) Math.round(Math.random() * (max-min) + min);
            // 0 1 => e.g 1 * 89 + 10
            // Random() pseudo random
        }

        return a;
    }
    
}
