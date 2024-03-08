package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyajava";
        String username = "root";
        String userpassword = "root";
        //get the connection object
        try (Connection connection = DriverManager.getConnection(url, username, userpassword);
             //create a statement object
             Statement statement = connection.createStatement();) {
            //pass the sql query to be executed
            String sql =
                    "update employee set employeeId=1 where city='bangalore";
            String sql1 =
                    "delete from employee where city='bangalore'";
            boolean result = statement.execute(sql);
            System.out.println("Table created " + !result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
