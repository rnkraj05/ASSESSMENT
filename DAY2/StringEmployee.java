class StringEmployee {
    String name;
    int id;
    
    //Static variable
    static String company = "TCS";   // static variable (shared)

    // Constructor 
    StringEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Company: " + company);
        System.out.println();
    }
     public static void main(String[] args) {
        StringEmployee e1 = new StringEmployee("Rahul", 101);
        StringEmployee e2 = new StringEmployee("Amit", 102);

        // Display values
        e1.display();
        e2.display();
    }
}