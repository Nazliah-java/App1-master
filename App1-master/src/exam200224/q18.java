package exam200224;

public class q18 {
    public static void main(String[] args) {
        int num = 10;
        if(num++ == num++){
            System.out.println("EQUAL" + num);
        }else{
            System.out.println("NOT EQUAL" + num);
        }
    }
}

//num++(left) = 11
//num++(right) = 11+1=12
//11 != 12 
//NOT EQUAL
