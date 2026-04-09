import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // int count = 10;
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci series of " + n  + "numbers ");

        int i = 1;
        while (i <= n){
            System.out.print(num1 + " ");
        
        //Logic: Calculate next term and swap values
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
        i++;
        }
    }    
}
  