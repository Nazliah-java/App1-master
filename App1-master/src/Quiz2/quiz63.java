package Quiz2;

public class quiz63 {
    public static void main(String[] args) {
        int score = 60;
        switch(score){
            default:
                System.out.println("Not a valid score");
            case score < 70:
                System.out.println("Failed");
            case score >= 70:
                System.out.println("Passed");
            break;
        }
    }

}
//In this case, switch expression [switch (score)] is of int type.
