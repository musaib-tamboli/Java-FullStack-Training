package com.musaib.oop.abstraction;
abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary = 50000");
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary = 15000");
    }
}

public class EmployeeSalary  {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}

