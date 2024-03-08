package com.jdbc.prepared;

import javax.xml.transform.Result;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String userpassword = "root";
        String sql = "select * from cab";
        try (
                Connection connection = DriverManager.getConnection(url, username, userpassword);
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery();
                Scanner scanner = new Scanner(System.in);
        ) {


              while (resultSet.next()){
                  int cabNo = resultSet.getInt("cab_number");
                  String droploc = resultSet.getString("drop_loc");
                  String pickup = resultSet.getString("pickup");
                  Time time = resultSet.getTime("pickup_time");
                  LocalTime pickuptime = LocalTime.parse(time.toString());
                  LocalDate pickupdate = LocalDate.parse(resultSet.getDate("pickup_date").toString());
                  String drivername = resultSet.getString("driver_name");


                  System.out.println(cabNo+" "+droploc+" "+pickup+" "+pickuptime+" "+pickupdate+" "+drivername);
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
