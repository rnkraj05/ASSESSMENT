import java.util.Scanner;

class addtwono{
    public static void main(String[] args) {
        //Create a variable to enter two value
        //Perform Operations
        //display results

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("sum is " + (a+b));
        sc.close();
    }
}
