abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}