//Step 1: Create a claa for employee with id, name and salary.
class Employee {
    int empId;
    String empName;
    double salary;

    //Step 2: Using Static variable (shared by all objects).
    static String companyName = "HCL";

    //Step 3: Using Constructor.
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    //Step 4: Method to display details of employee.
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println();
    }
}

public class EmployeeCompany {
    public static void main(String[] args) {

        //Step 5: Object initialization using constructor.
        Employee e1 = new Employee(113, "Rohan", 50000);
        Employee e2 = new Employee(116, "Ram", 60000);

        //Step 6: Display details using display method.
        e1.display();
        e2.display();
    }
}