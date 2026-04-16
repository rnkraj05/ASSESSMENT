//Step 1: Create a class for product billing.
class ProductBilling {

    //Step 2: Method for 1 product.
    void bill(int p1) {
        int total = p1;
        System.out.println("Total for 1 product: " + total);
    }

    //STep 3: Method for 2 products.
    void bill(int p1, int p2) {
        int total = p1 + p2;
        System.out.println("Total for 2 products: " + total);
    }

    //Step 3: Method for 3 products.
    void bill(int p1, int p2, int p3) {
        int total = p1 + p2 + p3;
        System.out.println("Total for 3 products: " + total);
    }
}

public class Product {
    public static void main(String[] args) {

        //Step 4: Create a object creation.
        ProductBilling pb = new ProductBilling();

        //Step 5: Assign the values of products.
        pb.bill(100);             // 1 product
        pb.bill(100, 200);        // 2 products
        pb.bill(100, 200, 300);   // 3 products
    }
}