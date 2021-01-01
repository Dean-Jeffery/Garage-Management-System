/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagemanagementsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Dean
 */
public class GarageManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection conn = db.Connect();
            String sql = "SELECT * from tbl_user";
            
            PreparedStatement pStatement = conn.prepareStatement(sql);
            
            ResultSet rs = pStatement.executeQuery();
            
            int count = 0;
            
            while(rs.next()) {
                System.out.println("id:" + rs.getString("id"));
                System.out.println("username: " + rs.getString("username"));
                System.out.println("role: " + rs.getString("role"));
                
                count++;
            }
            System.out.println("-------");
            System.out.println("Total Number of Users = " + count);
        
        }
        catch (Exception e) {
            System.out.println("Error:" + e);
        }        
        
    }
    
}
