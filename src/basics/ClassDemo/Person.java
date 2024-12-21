package basics.ClassDemo;

/// [Person] class
public class Person {
    /// Attributes
    private String name;
    private int age;

    /// Entry point of [Person] class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /// Method to display [Person] details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
