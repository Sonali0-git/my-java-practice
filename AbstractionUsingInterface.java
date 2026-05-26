//Abstraction using Interface

interface Animal {
    void sound();  // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}