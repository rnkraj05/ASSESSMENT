//Step 1: Create a class for employee with employee id , employee name and employee salary.
class Employee {
    int empId;
    String empName;
    double salary;

    //Step 2: Using Constructor method.
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    //Step 3: Method to display details.
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        //Step 4: Object initialization using constructor.
        Employee e1 = new Employee(112, "Raunak", 50000);
        Employee e2 = new Employee(98, "Raj", 60000);

        //Step 5: Display details using display method.
        e1.display();
        //Step 6: This is use for next line.
        System.out.println();
        
        e2.display();
    }
}