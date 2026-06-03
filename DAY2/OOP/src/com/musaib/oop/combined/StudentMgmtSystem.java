package com.musaib.oop.combined;
class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class StudentMgmtSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.setId(1);
        s.setName("Musaib");

        s.display();
    }
}
