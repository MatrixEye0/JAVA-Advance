interface Animal {
    // All variables are implicitly public, static, and final (constants)
    String CATEGORY = "Living Being"; 

    void makeSound(); 

    default void sleep() {
        System.out.println("Sleeping... Zzz");
    }
}

// 2. Implement the interface in a concrete class
class Dog implements Animal {
  
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Create an instance of the implementing class
        Animal myDog = new Dog(); // Polymorphic initialization
        
        // Call the implemented abstract method
        myDog.makeSound(); 
        
        // Call the default method inherited from the interface
        myDog.sleep(); 
        
        // Access the interface constant
        System.out.println("Category: " + Animal.CATEGORY);
    }
}
