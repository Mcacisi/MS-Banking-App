
package com.msbank.Config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * A CLASS USED LOADING DB & APPLICATION SETTINGS PRIVATELY
 * TO IMPROVE APP SECURITY & VULNERABILITY CONCERNS USING CLASSLOADER
 *
 * @PARAM (URL, USERNAME, PASSWORD)
 * CLASS WILL GET THE @PARAMETERS FROM THR CONFIG FILE THROUGH GETTERS
 * 
 * 
 * @author Mcacisi Sithole
 */


public class ConfigManager {
    
    
    private ConfigManager(){}
    
    private static final Properties prop = new Properties();
    
    
    static{
    
        try {
             InputStream input = ConfigManager.class.getClassLoader().getResourceAsStream("config.properties");
        
             if(input == null){
                throw new RuntimeException("config file not found\nCheck backend settings");
             }
        
   
            prop.load(input);
            
        } catch (IOException ex) {
            throw new RuntimeException("CONFIG FILE NOT LOADED PROPERLY\n" + ex.getMessage());
        }  
    }
    
    
    
    //GETTERS
    public static String getDriver(){
        return prop.getProperty("db.driver");
    }
    
    public static String getUrl(){
        return prop.getProperty("db.url");
    }
    
    public static String getUsername(){
        return prop.getProperty("db.username");
    }
    
    public static String getPassword(){
        return prop.getProperty("db.password");
    }
    
    
    
   
}
