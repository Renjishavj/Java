import java.util.Scanner;

public class SeasonCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String month = scanner.nextLine().trim().toLowerCase();

        switch (month) {
            case "september":
            case "october":
            case "november":
                System.out.println("The season is Autumn.");
                break;
            case "december":
            case "january":
            case "february":
                System.out.println("The season is Winter.");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("The season is Spring.");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("The season is Summer.");
                break;
            default:
                System.out.println("Invalid month entered.");
        }

        scanner.close();
    }
}
