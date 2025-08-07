package OOPS.Polymorphism.DynamicPolymorphism;

public class DynamicImpl {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Parent reference, Dog object
        Animal a2 = new Cat();  // Parent reference, Cat object

        a1.sound(); // Dog's version called → "Dog barks"
        a2.sound(); // Cat's version called → "Cat meows"
    }
}
