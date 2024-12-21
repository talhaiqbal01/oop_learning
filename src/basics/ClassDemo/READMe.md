# Class

In OOP, a `Class` is a blueprint for creating objects, defining their data (attributes) and actions (methods).

# Code Explanation

Here, we defined a `Person` class with attributes like `name` (a `String`) and `age` (an `int`). The class also contains methods that describe the behavior of `Person` objects.

```java
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```