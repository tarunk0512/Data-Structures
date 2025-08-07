package OOPS.Inheritance.HierarchicalInheritance;

public class HierarchicalInheritanceImpl {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
        // Both the classes Dog and Cat inherit the eat method from Animal class
        // and have their own specific methods (bark for Dog and meow for Cat).

    }
}
