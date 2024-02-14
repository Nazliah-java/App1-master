package Quiz2;

public class quiz49 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1};
        for(int i : arr){
            System.out.println(arr[i]);
        }
    }
}

// Inside enhanced for loop, System.out.println(arr[i]); is used instead of System.out.println(i);
// When loop executes 1st time, i stores the first array element, which is 3 but
// System.out.println statement prints arr[3] and this causes java runtime to throw the
// instance of ArrayIndexOutOfBoundsException.
