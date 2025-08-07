package OOPS.Encapsulation;


// File: Main.java
public class EncapMain {
    public static void main(String[] args) {
        EncapsulationImpl p = new EncapsulationImpl();

        // Using setter methods to set values
        p.setName("Tarun");
        p.setAge(25);
        p.name = "Tarun11"; // Since I have changed the value of name to public, this will work
        //But p.age = 30; // This will not work as age is private

        // Using getter methods to get values
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
