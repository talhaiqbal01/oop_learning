package basics.ObjectDemo;

public class ObjectDemo {
    public static void main(String[] args) {
        // Creating objects of Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Using objects
        System.out.println("Person 1 Details:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Details:");
        person2.displayInfo();
    }
}
