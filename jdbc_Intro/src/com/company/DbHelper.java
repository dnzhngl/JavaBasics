package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Database connection helper class
public class DbHelper {
    //JDBC --> it is a package, used for database connection.
    private String userName = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error : "+ exception.getMessage());
        System.out.println("Error code : "+ exception.getErrorCode());
    }
}
