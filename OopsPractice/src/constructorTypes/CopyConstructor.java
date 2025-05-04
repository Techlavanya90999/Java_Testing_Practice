package constructorTypes;

class student {
    String name;
    Integer age;

    // Method to print student info
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Copy Constructor
    student(student S2) {
        this.name = S2.name;
        this.age = S2.age;
    }

    // Default Constructor
    student() {
    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        // Creating a student object and setting values
        student S1 = new student();
        S1.name = "Aanand";
        S1.age = 24;

        // Using copy constructor to create a new object
        student S2 = new student(S1);

        // Printing the copied object's info
        S2.printInfo();
    }
}
