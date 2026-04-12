//Step 1: Create a class for product with id , name and price.
class Product {
    //Step 2: Private variables (data hiding)
    private int productId;
    private String productName;
    private double price;

    //Step 3: USing Setter methods (to set values)
    public void setProductId(int id) {
        productId = id;
    }

    public void setProductName(String name) {
        productName = name;
    }

    public void setPrice(double price) {
        if (price > 0) {   // validation
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    //STep 4: Using Getter methods (to get values)
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class ProductPrice {
    public static void main(String[] args) {

        //Step 5: Object initialization using constructor. 
        Product p1 = new Product();

        //Step 6: Setting values using setters method.
        p1.setProductId(115);
        p1.setProductName("LAPTOP");
        p1.setPrice(90000);

        //Step 7: Getting values using getters method.
        System.out.println("Product ID: " + p1.getProductId());
        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Price: " + p1.getPrice());
    }
}