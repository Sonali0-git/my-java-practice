class Calculator {

    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum (3 numbers): " + (a + b + c));
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.add(10, 20);
        obj.add(10.5, 2.5);
        obj.add(1, 2, 3);
    }
}