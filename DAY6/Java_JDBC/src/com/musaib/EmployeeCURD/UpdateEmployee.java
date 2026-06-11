package com.musaib.EmployeeCURD;

import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Salary: ");
        double salary = sc.nextDouble();

      	  String url = "jdbc:mysql://localhost:3306/empdb";
            String username = "root";
            String password = "Root@1234"; 


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "UPDATE emp SET name=?, salary=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully!");
            } else {
                System.out.println("Employee ID Not Found!");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}