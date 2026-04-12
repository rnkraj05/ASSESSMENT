import java.util.Scanner;

public class StringStudent {
    public static void main(String[] args) {
        
        //Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        //Ask user to enter student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        //Print original name
        System.out.println("Original Name: " + name);

        //Find and print length of the name
        System.out.println("Length of Name: " + name.length());

        //Convert name to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        //Convert name to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        //Close scanner
        sc.close();
    }    
}
