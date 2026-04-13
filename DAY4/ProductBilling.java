public class ProductBilling {
    
    //Method 1: Billing for 1 product
    void bill(int p1) {
        System.out.println("Total Bill Of 1 Product: " + (p1));
    }

    //Method 2: Billing for 2 product
    void bill(int p1, int p2) {
        System.out.println("Total Bill Of 2 Product: " + (p1 + p2) );
    }

    //Method 3: Billing for 3 product
    void bill(int p1, int p2, int p3) {
        System.out.println("Total Bill Of 3 Product: " + (p1 + p2 + p3));
    }

    public static void main(String[] args) {
        
        // Step 1: Create Object
        ProductBilling pb = new ProductBilling();

        // Step 2: Call for Constructor mwthod
        pb.bill(100);
        pb.bill(100, 200);
        pb.bill(100, 200, 300);
    }
}