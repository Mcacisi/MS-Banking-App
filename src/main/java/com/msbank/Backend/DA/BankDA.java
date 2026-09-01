
package com.msbank.Backend.DA;

import com.msbank.Backend.PD.BankPD;
import com.msbank.Config.ConfigManager;
import com.msbank.CustomException.DataStorageException;
import com.msbank.CustomException.DuplicateRecordException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
       
       
       //CREATE APPLICATION DATABASE
       String createDB = "CREATE DATABASE IF NOT EXISTS vault ";
       String useDB = "USE vault";
       
       try {
           
             PreparedStatement ps = conn.prepareStatement(createDB);
             ps.executeUpdate();
             
             ps = conn.prepareStatement(useDB);
             ps.execute();
             
       } catch (SQLException ex){
           
           throw new DataStorageException("db not created" + ex.getMessage());
       }
       
       
       //CREATE APPLICATION TABLES
       String createTable = "CREATE TABLE IF NOT EXISTS PersonalDetails ("
                          + "Fullname VARCHAR(255),"
                          + "Id_Number VARCHAR(13) UNIQUE,"
                          + "Contact VARCHAR(10),"
                          + "Gender VARCHAR(6),"
                          + "Email VARCHAR(255) NOT NULL,"
                          + "Address VARCHAR(255),"
                          + "Nationality VARCHAR(255) NOT NULL,"
                          + "City VARCHAR(255),"
                          + "AccountNo VARCHAR(10) PRIMARY KEY"
                          + ")";
       
       try{
           
           PreparedStatement ps = conn.prepareCall(createTable);
           ps.executeUpdate();
           
           
       } catch(SQLException ex){
           
          throw new DataStorageException( "CHECK Personal table\n\n" + ex.getMessage());
       }
       
               
   }
   
   
   
   
   static void addNewClient(BankPD bank) throws DuplicateRecordException, DataStorageException{
       
       String addClient = "INSERT INTO PersonalDetails(Fullname, Id_Number, Contact, Gender, Email, Address, Nationality, City, AccountNo) "
                        + "VALUES(?,?,?,?,?,?,?,?,?) ";
       
       
       try{
           
           PreparedStatement ps = conn.prepareStatement(addClient);
           ps.setString(1, bank.getFullname());
           ps.setString(2,bank.getIdNumber());
           ps.setString(3,bank.getContact());
           ps.setString(4,bank.getGender());
           ps.setString(5,bank.getEmail());
           ps.setString(6,bank.getAddress());
           ps.setString(7,bank.getNationality());
           ps.setString(8,bank.getCity());
           ps.setString(9,bank.getAccountNumber());
           
           ps.executeUpdate();
           
       }catch (SQLException ex){
           throw new DataStorageException("ADDING CLIENT....\n\n" + ex.getMessage());
       }
       
       
   }
     
    
   
     
}




/* BANK FEATURES
   loginAccount()
   checkBalane()
   withdraw()
   Deposit()
   blockAccount()
   */ 