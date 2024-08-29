public class OutOfBounds {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Attempt to access an out-of-bounds index
            int value = numbers[5]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
