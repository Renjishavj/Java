// public class CheckArray {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 4, 5};
//         int target = 3;
//         boolean found = false;

//         for (var num=0; num<numbers.length;num++) {
//             if (num == target) {


//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println("Array contains the value " + target);
//         } else {
//             System.out.println("Array does not contain the value " + target);
//         }
//     }
// }


import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array contains the value " + target);
        } else {
            System.out.println("Array does not contain the value " + target);
        }

        scanner.close();
    }
}

