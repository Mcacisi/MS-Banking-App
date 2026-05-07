
package com.msbank.Extra;

import java.security.SecureRandom;
import org.mindrot.jbcrypt.BCrypt;

/**
 *THIS CLASS IS RESPONSIBLE FOR DOING INTERNAL SERVICES LIKE HASHING, GENERATING VALUES/VARIABLES
 *NEEDED BY THE SYSTEM TO OPERATE AND TO IMPROVE SECURITY FOR FRAGILE USER DATA
 *     GENERATING SAVINGS ACCOUNT NUMBER FOR USER, FIRST DIGIT MUST NEVER BE ZERO 
 * 
 *     HASHING BANK PINCODE
 * @param PLAIN_CODE
 * 
 *     VERIFY IF STORED PIN CODE == ENTERED PIN CODE
 * @param PLAIN_CODE
 * @param STORED_PIN
 * 
 * @author Mcacisi Sithole
 */


public class SystemServices {
    
    private SystemServices(){}
    
    
    public static String generateSavingsAccount(){
        
        StringBuilder sb = new StringBuilder();
        SecureRandom genAccountNo = new SecureRandom();
        
       
        sb.append(genAccountNo.nextInt(0, 8) + 1);
        
        for (int i = 0 ; i < 9; i++){
         
            sb.append(genAccountNo.nextInt(0, 8));
        }
        
       return sb.toString(); 
    }
    
    
    
    
    public static String hashing( String plainCode ){
        
        String salt = BCrypt.gensalt(12);
        
        String hashedPin = BCrypt.hashpw(plainCode, salt);
        
        return hashedPin;
    }
    
    
   
    public static Boolean verifyPinCode( String plainCode, String dbPinCode){
        
        boolean isVerified = BCrypt.checkpw(plainCode, dbPinCode);
        
        return isVerified;  
    }
   
}
