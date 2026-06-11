package com.musaib;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
    String designation;

    Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("------------------- Employee Details ------------------- ");

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("------------------- END -------------------");
    }
}

public class EmployeeMGMT {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void insert() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        employees.add(new Employee(id, name, salary, designation));

        System.out.println("Employee Added Successfully!");
    }

    public static void view() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    public static void update() {
        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {
            if (e.id == id) {

                System.out.print("Enter New Name: ");
                e.name = sc.nextLine();

                System.out.print("Enter New Salary: ");
                e.salary = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter New Designation: ");
                e.designation = sc.nextLine();

                System.out.println("Employee Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    public static void delete() {
        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == id) {
                employees.remove(i);
                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert();
                    break;

                case 2:
                    view();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    delete();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

