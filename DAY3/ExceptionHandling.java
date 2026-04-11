
class ExceptionHandling {
    public static void main(String[] args) {
        try {
	// int x = 10/0;
    //  int x = 10/2;
    } catch (ArithmeticException e) {
        System.out.println("Error Handles");
    } finally {
        System.out.println("Always runs");
    }

    }
}


