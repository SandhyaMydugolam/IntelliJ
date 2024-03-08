package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelectOne {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String userpassword = "root";
        String sql = "select * from cab where drop_loc=?";
        try (
                Connection connection = DriverManager.getConnection(url, username, userpassword);
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
statement.setString(1,"r");
try (ResultSet resultSet = statement.executeQuery();) {

    while (resultSet.next()) {
        int cabNo = resultSet.getInt("cab_number");
        String droploc = resultSet.getString("drop_loc");
        String pickup = resultSet.getString("pickup");
        Time time = resultSet.getTime("pickup_time");
        LocalTime pickuptime = LocalTime.parse(time.toString());
        LocalDate pickupdate = LocalDate.parse(resultSet.getDate("pickup_date").toString());
        String drivername = resultSet.getString("driver_name");


        System.out.println(cabNo + " " + droploc + " " + pickup + " " + pickuptime + " " + pickupdate + " " + drivername);
    }


}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
