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
}

class C extends A {
    int subtract(int a, int b) {
        int difference = a - b;
        System.out.println("Difference: " + difference);
        return difference;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Operations with class A instance:");
       
        objA.add(10, 5);

        System.out.println("\nOperations with class B instance:");
        
        objB.add(10, 5);       // Inherited from A
        objB.multiply(10, 5);  // Defined in B

        System.out.println("\nOperations with class C instance:");
       
        objC.add(10, 5);       // Inherited from A
        objC.subtract(10, 5);  // Defined in C
    }
}
