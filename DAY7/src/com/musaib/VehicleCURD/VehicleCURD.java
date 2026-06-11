package com.musaib.VehicleCURD;

import java.sql.*;
import java.util.Scanner;

public class VehicleCURD {

    static Scanner sc = new Scanner(System.in);

    static String url = "jdbc:mysql://localhost:3306/vehicle_db";
    static String username = "root";
    static String password = "Root@1234";

    // CREATE
    static void addVehicle() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.print("Enter Vehicle ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Vehicle Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Vehicle Type (Car/Bike): ");
            String type = sc.nextLine();

            System.out.print("Enter Rent Per Day: ");
            double rent = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Availability (Available/Rented): ");
            String availability = sc.nextLine();

            String sql =
                    "INSERT INTO vehicle(vehicle_id, vehicle_name, vehicle_type, rent_per_day, availability) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, type);
            ps.setDouble(4, rent);
            ps.setString(5, availability);

            int rows = ps.executeUpdate();

            System.out.println(rows + " Vehicle Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // READ
    static void displayVehicles() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM vehicle";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n------------------------------------------------------------");
            System.out.println("ID\tNAME\t\tTYPE\tRENT/DAY\tSTATUS");
            System.out.println("------------------------------------------------------------");

            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println(
                        rs.getInt("vehicle_id") + "\t" +
                        rs.getString("vehicle_name") + "\t\t" +
                        rs.getString("vehicle_type") + "\t" +
                        rs.getDouble("rent_per_day") + "\t\t" +
                        rs.getString("availability"));
            }

            if (!found) {
                System.out.println("No Vehicles Found!");
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // UPDATE
    static void updateVehicle() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.print("Enter Vehicle ID to Update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Vehicle Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Vehicle Type: ");
            String type = sc.nextLine();

            System.out.print("Enter New Rent Per Day: ");
            double rent = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter New Availability: ");
            String availability = sc.nextLine();

            String sql =
                    "UPDATE vehicle SET vehicle_name=?, vehicle_type=?, rent_per_day=?, availability=? WHERE vehicle_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, type);
            ps.setDouble(3, rent);
            ps.setString(4, availability);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Vehicle Updated Successfully!");
            else
                System.out.println("Vehicle ID Not Found!");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE
    static void deleteVehicle() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.print("Enter Vehicle ID to Delete: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM vehicle WHERE vehicle_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Vehicle Deleted Successfully!");
            else
                System.out.println("Vehicle ID Not Found!");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Driver Not Found!");
            return;
        }

        int choice;

        do {
            System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicles");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;

                case 2:
                    displayVehicles();
                    break;

                case 3:
                    updateVehicle();
                    break;

                case 4:
                    deleteVehicle();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}