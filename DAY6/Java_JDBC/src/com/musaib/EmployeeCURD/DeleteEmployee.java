package com.musaib.EmployeeCURD;
import java.sql.*;
import java.util.Scanner;

public class DeleteEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        String url = "jdbc:mysql://localhost:3306/empdb";
        String username = "root";
        String password = "Root@1234"; 


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "DELETE FROM emp WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully!");
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