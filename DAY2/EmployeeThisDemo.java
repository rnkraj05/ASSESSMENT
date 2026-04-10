public class EmployeeThisDemo {
    
    // Instance variable
    int empId;
    String empName;

    // Constructor with same variable name as instance variable
    EmployeeThisDemo(int empId, String empName) {

        // Use 'this' to refer to current object variables
        this.empId = empId;
        this.empName = empName;
    }

    // Display method
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {
        
        // Create object
        EmployeeThisDemo e1 = new EmployeeThisDemo(301, "Raunak");

        //Display
        e1.display();

    }
}
