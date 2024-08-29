interface Addition {
    int add(int a, int b);
}

interface Multiplication {
    int multiply(int a, int b);
}

interface Subtraction {
    int subtract(int a, int b);
}

class Calculator implements Addition, Multiplication, Subtraction {
    @Override
    public int add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }

    @Override
    public int multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product: " + product);
        return product;
    }

    @Override
    public int subtract(int a, int b) {
        int difference = a - b;
        System.out.println("Difference: " + difference);
        return difference;
    }
    
    void printMessage() {
        System.out.println("This is Calculator implementing multiple operations");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.printMessage();
        calc.add(10, 5);
        calc.multiply(10, 5);
        calc.subtract(10, 5);
    }
}
