public class Arithmetic {
    public static void main(String[] args) {
        try {
            // Example of division by zero
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
