package Quiz2;

public class quiz55 {
    public String name;
    public void Test(){
        name = "James";
    }
    
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.name);
    }
}

// public void Test() is method and not constructor, as return type is void.
// method can have same name as the class name, so no issues with Test() method
// declaration.
// As there are no constructors available for this class, java compiler adds following
// constructor.
// public Test() {}
// Test obj = new Test(); invokes the default constructor but it doesn't change the value of
// name property (by default null is assigned to name property)
// System.out.println(obj.name); prints null.