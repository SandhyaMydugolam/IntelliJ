package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String userpassword = "root";
        String sql = "insert into cab values(?,?,?,?,?,?)";
        try (
                Connection connection = DriverManager.getConnection(url, username, userpassword);
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++){
                int cabNumber = scanner.nextInt();
                String drop = scanner.next();
                String pickup = scanner.next();
                String time = scanner.next();
                String date = scanner.next();
                String drivername = scanner.next();
               // Date date1 = Date.valueOf(date);

                // assign values to placeholders
                statement.setInt(1,cabNumber);
                statement.setString(2,drop);
                statement.setString(3,pickup);
                statement.setTime(4, Time.valueOf(time));
                statement.setDate(5,Date.valueOf(date));
                statement.setString(6,drivername);
                boolean result = statement.execute();
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
