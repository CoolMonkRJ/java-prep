public class Product {

    private int productID;
    private String productName;
    private int quantity;

    public Product(int productId,String productName,int quantity){
        this.productID=productId;
        this.productName=productName;
        this.quantity=quantity;
    }

    public int getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }

    public int getQuantity(){
        return quantity;
    }
    //setters

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void display(){
        System.out.println(
                "Id :"+ productID +
                        "Name :"+ productName +
                        "Quantity :" + quantity
        );
    }
}
