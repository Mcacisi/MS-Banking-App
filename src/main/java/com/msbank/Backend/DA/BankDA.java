
package com.msbank.Backend.DA;

import com.msbank.Backend.PD.BankPD;
import com.msbank.Config.ConfigManager;
import com.msbank.CustomException.DataStorageException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;



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
   private static ArrayList <BankPD> arrBank;
   
   
   static void initializeConnection() throws DataStorageException{
       
        try{
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, username, password);
            
            if (conn == null){
                throw new DataStorageException("CONNECTION VARIABLE IS NULL");
            }
            
            
        } catch (ClassNotFoundException ex){
            throw new DataStorageException("MYSQL DRIVER NOT FOUND\n\n" + ex.getMessage());
            
            
        } catch (SQLException ex){
            throw new DataStorageException("CONNECTION FAILED\n\n" + ex.getMessage());
        } 
   }
           
   
   
   
   static void createDatabaseTable() throws DataStorageException{
       
       String createDB = "CREATE DATABASE vault IF NOT EXISTS ";
   }
   
     
    
   
   
   
}
