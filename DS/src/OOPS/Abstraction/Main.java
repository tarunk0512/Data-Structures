package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();  // Abstract method implemented in Dog
        animal.sleep();  // Concrete method from abstract class

        Animal animal2 = new Cat();
        animal2.sound(); // Animal class doesn't know how the method sound will be implemented for
        //different animals, but it knows that every animal will have a sound.
        animal2.sleep(); // Concrete method from abstract class

        //Animal is abstract: It doesn’t know how sound() will be implemented.
        //
        //Dog provides the actual implementation.
        //
        //It hides the "how" until the subclass defines it.
    }
}
