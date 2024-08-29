// Define a functional interface


@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;

      
        System.out.println("10 + 5 = " + addition.operation(10, 5));
        System.out.println("10 - 5 = " + subtraction.operation(10, 5));
    }
}


//2.with string
// Define a functional interface for string operations
@FunctionalInterface
interface StringOperation {
    String operate(String str);

    
    default String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    
    static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}


public class FunctionalInterface1 {
    public static void main(String[] args) {
       
        StringOperation removeSpaces = str -> str.replaceAll("\\s", "");

        String inputString = "Hello World";

        System.out.println("Original String: " + inputString);
        System.out.println("String with no spaces: " + removeSpaces.operate(inputString));
       
        
        System.out.println("Reversed String: " + removeSpaces.reverse(inputString));

      
        System.out.println("Uppercase String: " + StringOperation.toUpperCase(inputString));
    }
}
