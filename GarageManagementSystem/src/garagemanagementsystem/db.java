/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagemanagementsystem;

import java.sql.*;

/**
 *
 * @author Dean
 */
public class db {
    
    public static Connection Connect(){
    
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\itsde\\Desktop\\Development\\Garage-Management-System\\GarageManagementSystem\\GarageDB.db");
            return conn;
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
    
    
}
