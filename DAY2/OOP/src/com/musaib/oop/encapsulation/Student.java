package com.musaib.oop.encapsulation;

public class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("Musaib");
        System.out.println("Name :: "+s.getName());
        System.out.println("Roll No. :: "+s.getAge());
    }
}
