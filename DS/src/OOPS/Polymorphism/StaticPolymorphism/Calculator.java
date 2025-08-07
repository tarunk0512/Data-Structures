package OOPS.Polymorphism.StaticPolymorphism;

public class Calculator {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}
