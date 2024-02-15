package lesson8.GenericMap;

public class Main {
    public static void main(String[] args) {
        
        GenericMap<String, Double> storeMap = new GenericMap<>();

        //add key-value pairs
        storeMap.add("Fan", 129.90);
        storeMap.add("Air-conditioner", 3590.00);
        storeMap.add("Lamp", 159.00);

        //retrieve value
        System.out.println("The price for fan is: ");
        System.out.println("RM" + storeMap.get("Fan"));

        //check if key exists
        System.out.println("\nIs there Lamp in the store?");
        System.out.println(storeMap.containsKey("Lamp"));

        //remove key-value pair
        System.out.println("Attention: Fan is removed");
        storeMap.remove("Fan");

        //check updated map
        System.out.println("\nIs there Fan in the store?");
        System.out.println(storeMap.containsKey("Fan"));


    }
}
