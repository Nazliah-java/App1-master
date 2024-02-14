package Quiz2;

public class quiz35 {
    public static void main(String[] args) {
        String [][] fruits = {{"apple", "mango"}, {"orange", "grape"}};

        for(int i = 0; i < fruits.length; i++)
            for(int j = 0; j < fruits[i].length; j++)
            System.out.println(fruits[i][j] + " ");
    }
}

// Easy question on iterating through 2-dimensional array. Starting index should be 0 and not
// 1. Enhanced for loop syntax is correct.
// As for loops contain 1 statement, hence curly brackets can be ignored.