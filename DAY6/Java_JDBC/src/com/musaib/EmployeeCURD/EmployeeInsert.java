package com.musaib.EmployeeCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class EmployeeInsert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            String url = "jdbc:mysql://localhost:3306/empdb";
            String username = "root";
            String password = "Root@1234";
            Connection con = DriverManager.getConnection(url, username, password);

            String sql =
                    "INSERT INTO emp(id, name, salary) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee inserted successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}