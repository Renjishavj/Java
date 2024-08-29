public class functionOverload {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        functionOverload math = new functionOverload();
        System.out.println("add(int, int): " + math.add(1, 2));
        System.out.println("add(int, int, int): " + math.add(1, 2, 3));
        System.out.println("add(double, double): " + math.add(1.3, 2.0));
    }

}
