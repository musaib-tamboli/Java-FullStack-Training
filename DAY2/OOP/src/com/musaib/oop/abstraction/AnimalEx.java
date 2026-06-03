package com.musaib.oop.abstraction;
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class AnimalEx {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();
        c.sound();
    }
}

