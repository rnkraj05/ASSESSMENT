//Step 1: Create a Parent Class of Student with rollNo and name.
class Student {
    int rollNo;
    String name;

    //Step 2: Method to get student details.
    void getStudentDetails(int r, String n) {
        rollNo = r;
        name = n;
    }

    //STep 3: Method to display student details.
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

//Step 4: Create a Child Class of College Students (using inheritance) extends with parent class.
class CollegeStudent extends Student {
    //Step 5: Using String method
    String collegeName;

    //Step 6: Method to get College details of students.
    void getCollegeDetails(String cname) {
        collegeName = cname;
    }

    //Step 7: Method to display college details of students.
    void displayCollege() {
        System.out.println("College: " + collegeName);
    }
}

//Step 8: Create a Main Class 
public class College {
    public static void main(String[] args) {

        //Step 9: Object initialization using constructor.
        CollegeStudent cs = new CollegeStudent();

        //Step 10: Using parent class method
        cs.getStudentDetails(112, "Raunak Raj");

        //STep 11: Using child class method
        cs.getCollegeDetails("GNC College");

        //Step 12: Display all details of students.
        cs.displayStudent();
        cs.displayCollege();
    }
}