public class ArrayStudent {
        public static void main(String[] args) {
            //Create an array to store marks of 10 students
            int[] marks = {78, 85, 92, 67, 88, 45, 65, 22, 12, 10};

            //Print heading
            System.out.println("Student Marks: ");

            //Use for loop to access each element of the array
            for(int i=0; i<marks.length; i++) {
                
                //Print student number and corresponding marks
                System.out.println("Studnet " + (i + 1) + "Marks = " 
            + marks[i]);
            }
        }
}
