package com.musaib.oop.interfaces;
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo Captured");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.takePhoto();
        sp.playMusic();
    }
}
