package com.Util;

import org.mindrot.jbcrypt.BCrypt;


/*
 * THIS CLASS WILL HASH ALL PIN CODES OR SENSITIVE INFORMATION
 * TO PREVENT SENSITIVE DATA BEING ACCESSED EASILY IN DATABASE
*/


public class SecretServices {

 
    public static String hashedPinCode ( String plainPinCode) {

        String salt = BCrypt.gensalt(12);

        String hashedPinCode = BCrypt.hashpw(plainPinCode, salt);

        return hashedPinCode;
    }




    public static boolean verifyPinCode ( String plainPinCode, String DbPinCode) {

        return BCrypt.checkpw(plainPinCode, DbPinCode);
    }

    

   

}
