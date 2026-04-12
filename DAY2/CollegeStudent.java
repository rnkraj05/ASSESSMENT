//Parent class
class StudentParent {
    // Parent class properties
    int rollNo = 112;
    String name = "Raunak";

    //Parent class method
    void showStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

//Child class inherits Parent Class
public class CollegeStudent extends StudentParent {

    // Child class property
    String collegeName = "GNC College";

    // Child class method
    void showCollegeDetails() {
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        
        //Create Object of child class
        CollegeStudent cs = new CollegeStudent();

        //Access parent class method
        cs.showStudentDetails();

        //Access child class method
        cs.showCollegeDetails();

    }
}
