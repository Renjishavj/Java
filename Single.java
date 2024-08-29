class A {
    int add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }
}

class B extends A {
    void factorial(int a, int b) {
        int sum = add(a, b);
        int fact = 1;
        for (int i = 1; i <= sum; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + sum + " is: " + fact);
    }
}

public class Single {
    public static void main(String[] args) {
        B objB = new B();
        objB.factorial(1, 4); 
    }
}
