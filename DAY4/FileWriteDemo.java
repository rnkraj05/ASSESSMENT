import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

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

        String fileName = "student.txt";  

        try {
            // WRITE
            FileWriter fw = new FileWriter(fileName);

            fw.write("ID: " + s1.id + "\n");
            fw.write("Name: " + s1.name);

            fw.close();

            System.out.println("Data written successfully!\n");

            // READ
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("Displaying file content:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}