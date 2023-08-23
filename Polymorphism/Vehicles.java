package Polymorphism;

//method overriding
public class Vehicles {
    void run() {
        System.out.println("Vehicle is running");
    }

}

// class Bike extends Vehicles {
// void run() {
// System.out.println("Bike is running");
// }

// }

class Test extends Vehicles {
    public static void main(String[] args) {
        Test b1 = new Test();
        b1.run();

    }

}
