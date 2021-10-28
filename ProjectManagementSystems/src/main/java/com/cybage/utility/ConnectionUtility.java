package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
    private static String url = "jdbc:mysql://localhost:3306/newdb";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "root";
    private static Connection connection;
    
    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {               
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found."); 
        }
        return connection;
    }
}