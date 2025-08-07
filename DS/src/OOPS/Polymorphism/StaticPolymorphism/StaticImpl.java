package OOPS.Polymorphism.StaticPolymorphism;

public class StaticImpl {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add 2 ints: " + calc.add(2, 3));          // 5
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));       // 6
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.5));   // 6.0
    }
}
