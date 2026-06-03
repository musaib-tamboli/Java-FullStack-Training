package com.musaib.oop.abstraction;
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Started");
    }

    void stop() {
        System.out.println("Car Stopped");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started");
    }

    void stop() {
        System.out.println("Bike Stopped");
    }
}

public class VehicleStartStop {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}
