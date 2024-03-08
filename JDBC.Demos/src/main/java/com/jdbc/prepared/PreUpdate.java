package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String userpassword = "root";
        String sql = "update cab set driver_name=? where cab_number=?";
        try (
                Connection connection = DriverManager.getConnection(url, username, userpassword);
                PreparedStatement statement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner(System.in);
        ) {


                String drivername = scanner.next();
            int cabNumber = scanner.nextInt();
               // Date date1 = Date.valueOf(date);
                // assign values to placeholders
                statement.setString(1,drivername);
            statement.setInt(2,cabNumber);
                boolean result = statement.execute();
                System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
