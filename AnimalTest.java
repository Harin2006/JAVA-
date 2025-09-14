// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

// Main class to test the program
public class AnimalTest {
    public static void main(String[] args) {
        // Create object references of type Animal
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        // Call the makeSound method on each
        myDog.makeSound();
        myCat.makeSound();
        myCow.makeSound();

        // Call a concrete method from abstract class
        myDog.sleep();
    }
}
