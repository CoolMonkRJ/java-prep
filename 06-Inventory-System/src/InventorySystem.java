public class InventorySystem{

    public static void main(String [] args){
        InventoryManager manager =
                new InventoryManager();

        Product laptop = new Product(101,"Laptop",10);
        Product mouse = new Product(102,"Mouse",50);
        Product keyboard =
                new Product(
                        103,
                        "Keyboard",
                        20);

        manager.addProduct(laptop);
        manager.addProduct(mouse);
        manager.addProduct(keyboard);

        manager.displayAllProducts();

        System.out.println("\n --------- Search Product----------");
        manager.findProduct(102);

        System.out.println("\n--------Update Stock---------");
        manager.updateQuantity(102,75);
        manager.findProduct(102);

        System.out.println("\n --------- Remove Product----------");
        manager.removeProduct(103);

        manager.displayAllProducts();
    }
}
