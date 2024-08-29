import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }

        scanner.close();
    }
}
