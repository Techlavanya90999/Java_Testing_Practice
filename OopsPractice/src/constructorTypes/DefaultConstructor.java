package constructorTypes;

class Person {
    String name;
    Integer age;

    // Non-parameterized constructor
    Person() {
        System.out.println("Constructor called");
    }

    // Method to print student info
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {
        // Creating an object of Student class
    	Person S1 = new Person();
        
        // Setting properties
        S1.name = "Aman";
        S1.age = 20;

        // Printing student info
        S1.printInfo();
    }
}
