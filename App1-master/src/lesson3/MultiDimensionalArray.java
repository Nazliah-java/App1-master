package lesson3;

public class MultiDimensionalArray {
    public static void main(String[] args) { 
        int [][][] a = {{{1,2,3},{4,5},{6}},{{7,8},{9}}}; 
        System.out.println("a.length = "+a.length); //print the length of dimensional array
   

    for (int i = 0; i < a.length; i++){ //outer loops
        System.out.println("a[" + i +"].length = " + a[i].length);

    for (int j = 0; j < a[i].length; j++){ //middle loops
        System.out.println("a[" + i + "][" + j + "].length = " + a[i][j].length);

    for (int k = 0; k < a[i][j].length; k++){ //inner loops
        System.out.print("a[" + i +"][" + j + "][" + k + "] = " + a[i][j][k] + ", ");
    }
    System.out.println();
    }

    }
}}
