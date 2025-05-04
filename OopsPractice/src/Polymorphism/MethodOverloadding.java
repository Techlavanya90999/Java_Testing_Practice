package Polymorphism;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverloadding {
    public static void main(String[] args) {
        Animal animal;  // Reference of superclass

        animal = new Dog();
        animal.makeSound();   // Dog's makeSound() is called

        animal = new Cat();
        animal.makeSound();   // Cat's makeSound() is called
    }
}
