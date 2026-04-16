//Step 1: Create a class of student marks.
public class StudentMarks {
    public static void main(String[] args) {

        //Step 2: Create array of size 5 contain the 5 marks.
        int marks[] = new int[5];

        //Step 3: Assign values using indexing method.
        marks[0] = 80;
        marks[1] = 75;
        marks[2] = 90;
        marks[3] = 85;
        marks[4] = 70;

        //Step 4: Display the marks of students using for loop.
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of student " + (i + 1) + ": " + marks[i]);
        }
    }
}