
package com.msbank.Backend.DA;

import com.msbank.Config.ConfigManager;
import com.msbank.CustomException.DataStorageException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * CLASS RESPONSIBLE FOR INITIALIZING CONNECTION AND BUILD DATABASE STRUCTURE
 * AND ALL NECESSARY TABLES FOR APPLICATION
 * 
 * @author Mcacisi Sithole
 */
public class BankDA {
     
   
   private BankDA(){}
    
   
   //DECLARE ALL REQUIRED VARIABLES
   private static Connection conn = null;
   private static String driver = ConfigManager.getDriver();
   private static String url = ConfigManager.getUrl();
   private static String username = ConfigManager.getUsername();
   private static String password = ConfigManager.getPassword();
   
   
   static void initializeConnection() throws DataStorageException{
       
        try{
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, username, password);
            
            if (conn == null){
                throw new RuntimeException("CONNECTION VARIABLE IS NULL");
            }
            
            
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "MYSQL DRIVER NOT FOUND\n" + ex.getMessage());
            
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "GETTING CONNECTION FROM DRIVER FAILED\n" +ex.getMessage());
        } 
   }
           
   
   
   
   static void createDatabaseTable() throws DataStorageException{
       
   }
   
   
   
   
   
   
}
