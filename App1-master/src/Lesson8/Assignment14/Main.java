package lesson8.Assignment14;

public class Main {
    public static void main(String[] args) {
        
        // creating items
        Item skirt = new Item("Skirt", 49.90);
        Item blouse = new Item("Blouse", 120.00);
        Item cap = new Item("Cap", 39.00);

        // Online Shopping Cart
        ShoppingCart onlineCart = new OnlineShoppingCart();
        onlineCart.addItem(skirt);
        onlineCart.addItem(blouse);
        onlineCart.addItem(cap);

        System.out.println("Online Shopping Cart Total: RM " + onlineCart.calculateTotal() + "\n");

        onlineCart.removeItem(cap);

        System.out.println("Online Shopping Cart Total: RM " + onlineCart.calculateTotal()+ "\n");

        //In-Store shopping cart
        ShoppingCart inStoreCart = new InStoreShoppingCart();
        inStoreCart.addItem(skirt);
        inStoreCart.addItem(blouse);
        inStoreCart.addItem(cap);

        System.out.println("In-Store Shopping Cart Total: RM " + inStoreCart.calculateTotal()+ "\n");

        inStoreCart.removeItem(skirt);

        System.out.println("In-Store Shopping Cart Total: RM " + inStoreCart.calculateTotal()+ "\n");


    }
}
