package com.Util;

import java.security.SecureRandom;

/*
 * CLASS THAT DOES EVERYTHING THAT SHOULD BE DONE BY THE BANKING SYSTEM
 * SAVINGS ACCOUNT NUMBER
 * CARD NUMBER
 * CVV CODE
*/


public class SystemServices {
    
    static String generateSavingsAccount(){

         StringBuilder sb = new StringBuilder();
         SecureRandom generateAccount = new SecureRandom();


        //RISTRICT ACCOUNT NUMBER FROM HAVING THE FIRST DIGIT AS 0 OR 10
         sb.append(generateAccount.nextInt(0,8) + 1);


         for(int i = 0; i < 9; i++ ){
          sb.append(generateAccount.nextInt(10));
         }

         return sb.toString();
    }

}
