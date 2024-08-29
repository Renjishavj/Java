// Define an interface with abstract, default, and static methods

import java.util.Scanner;


interface Calculator {

   
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);

    
    default double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    
    static int square(int a) {
        return a * a;
    }
}


class SimpleCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

   
}


public class Interface1{
    public static void main(String[] args) {
        
        Calculator calc = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        int sum = calc.add(num1, num2);
        int difference = calc.subtract(num1, num2);
        int product = calc.multiply(num1, num2);
        double quotient = calc.divide(num1, num2);

        
        System.out.print("Enter a number to calculate its square: ");
        int numForSquare = scanner.nextInt();
        int square = Calculator.square(numForSquare);

       
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println("Square of " + numForSquare + " = " + square);

       
        scanner.close();
    }
}
