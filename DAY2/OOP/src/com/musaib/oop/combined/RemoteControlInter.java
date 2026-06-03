package com.musaib.oop.combined;
interface RemoteControl {
    void turnOn();
    void turnOff();
}

class Projector implements RemoteControl {
    public void turnOn() {
        System.out.println("Projector ON");
    }

    public void turnOff() {
        System.out.println("Projector OFF");
    }
}

class AirConditioner implements RemoteControl {
    public void turnOn() {
        System.out.println("AC ON");
    }

    public void turnOff() {
        System.out.println("AC OFF");
    }
}

public class RemoteControlInter {
    public static void main(String[] args) {
        RemoteControl tv = new Projector();
        RemoteControl ac = new AirConditioner();

        tv.turnOn();
        tv.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}

