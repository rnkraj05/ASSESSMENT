/*
Step 1: Define a custom exxception 
*/

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }

    private static void validateAge(int age) throws CustomException{
        if (age < 18){
            throw new CustomException("Age must be at least 18 to register");
        } else {
            System.out.println("Age is valid. Registration Successful");
        }
    }
 }