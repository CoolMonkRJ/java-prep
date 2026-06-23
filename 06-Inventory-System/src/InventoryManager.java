import java.util.HashMap;

public class InventoryManager {

    private HashMap<Integer,Product> inventory = new HashMap<>();

    public void addProduct(Product product){
        if(inventory.containsKey(
                product.getProductID())){
            System.out.println("Product Already Exists");

            return;
        }

        inventory.put(product.getProductID(),product);
        System.out.println("Product Added Succesfully");
    }

    //update quantity

    public void updateQuantity( int productId, int newQuantity){
      Product product = inventory.get(productId);

      if(product == null){
          System.out.println("Product Not Found");
         return;
      }
      product.setQuantity(newQuantity);

      System.out.println("Qunatity Updated");

    }

    //find product

    public  void findProduct(int productId){
        Product product =inventory.get(productId);

        if(product == null){
            System.out.println("Product Not Found");
            return;
        }
        product.display();
    }

    //remove product

    public void removeProduct(int productId){
        if (!inventory.containsKey(productId)){
            System.out.println("Product Not Found");
        return;
        }

        inventory.remove(productId);
        System.out.println("Product Remove");
    }

    public void displayAllProducts(){
        if(inventory.isEmpty()){
            System.out.println("Inventory empty");
        return;
        }
        System.out.println("\n ----------All Products --------");

        for(Product product :inventory.values()){
            product.display();
        }
    }
}
