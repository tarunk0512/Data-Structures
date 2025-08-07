package OOPS.Inheritance.MultilevelInheritance;

public class MultiLevelInheritanceImpl {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // Animal
        p.bark();  // Dog
        p.weep();  // Puppy
    }
}