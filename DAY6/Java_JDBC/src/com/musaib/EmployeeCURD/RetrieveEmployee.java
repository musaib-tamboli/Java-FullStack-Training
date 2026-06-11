package com.musaib.EmployeeCURD;

import java.sql.*;

public class RetrieveEmployee {

    public static void main(String[] args) {
    	  String url = "jdbc:mysql://localhost:3306/empdb";
          String username = "root";
          String password = "Root@1234"; 


        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // SQL Query
            String sql = "SELECT * FROM emp";

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery(sql);

            System.out.println("ID\tNAME\tSALARY");
            System.out.println("---------------------");

            // Display Records
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + "\t" + name + "\t" + salary);
            }

            // Close Resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}