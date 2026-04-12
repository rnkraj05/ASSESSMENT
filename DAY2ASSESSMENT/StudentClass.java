//Step 1: Create a student class with rollNo, name and marks.
class Student {
    // Fields (variables)
    int rollNo;
    String name;
    double marks;

    //Step 2: Method to display student details.
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentClass {
    public static void main(String[] args) {

        //Step 3: Create a Object creation.
        Student s1 = new Student();

        //Step 4: Assign the values
        s1.rollNo = 112;
        s1.name = "Raunak";
        s1.marks = 90.5;

        //Step 5: Display the details of students.
        s1.displayDetails();
    }
}