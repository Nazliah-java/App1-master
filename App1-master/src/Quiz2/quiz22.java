package Quiz2;

public class quiz22 {
    public static void main(String[] args){
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2); //compared different object, different memory
        System.out.println(name2 == name3); //compared same object

        //to get true
        //put final at String lName = "Gosling";
    }
}
