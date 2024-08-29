class A {
    int add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }
    
    
}

class B extends A {
    int multiply(int a, int b) {
        int product = a * b;
        System.out.println("Product: " + product);
        return product;
    }
    
    void factorial(int a, int b) {
        int sum = add(a, b);
        int fact = 1;
        for (int i = 1; i <= sum; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + sum + " is: " + fact);
    }
    
   
}

class C extends B {
    int subtract(int a, int b) {
        int difference = a - b;
        System.out.println("Difference: " + difference);
        return difference;
    }
    
    void cube(int a, int b) {
        int product = multiply(a, b);
        int cubeValue = product * product * product;
        System.out.println("Cube of " + product + " is: " + cubeValue);
    }
    
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C objC = new C();
      
        objC.add(4, 3);       // From class A
        objC.multiply(4, 3);  // From class B
        objC.factorial(4, 3); // From class B
        objC.subtract(10, 4); // From class C
        objC.cube(2, 3);      // From class C
    }
}
