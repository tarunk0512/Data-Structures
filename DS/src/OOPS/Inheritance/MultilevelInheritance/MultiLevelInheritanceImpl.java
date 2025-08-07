package OOPS.Inheritance.MultilevelInheritance;

public class MultiLevelInheritanceImpl {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // Animal
        p.bark();  // Dog
        p.weep();  // Puppy
        // Here Animal is the parent class, Dog is the child class of Animal, and Puppy is the child class of Dog.
        // This is an example of multilevel inheritance where Puppy inherits from Dog, and Dog inherits
        // from Animal. The Puppy class can access methods from both the Dog and Animal classes.
        // This demonstrates the concept of multilevel inheritance in Java.
  }
}