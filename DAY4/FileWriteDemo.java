// Student class (no need to make it public here)

import java.io.FileWriter;
import java.io.IOException;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class FileWriteDemo {
    public static void main(String[] args) {
        
        // Create Student Object
        Student s1 = new Student(1, "Raunak");

        try {
            FileWriter fw = new FileWriter("student.txt");

            //Write object data
            fw.write("ID: " + s1.id + "\n");
            fw.write("Name: " + s1.name);

            fw.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {   
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
