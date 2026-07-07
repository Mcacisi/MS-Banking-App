
package com.msbank.Backend.DA;

import com.msbank.CustomException.DataStorageException;

/**
 *
 * RESPONSIBLE FOR DIRECTICTING TRAFFIC, DEALING WITH REQUESTS & RESPONSES FROM USERS AND THE DATABASE
 * THIS IS THE ONLY CLASS THAT WILL COMMUNICATE WITH THE DA DIRECTLY FOR SECURITY REASONS
 * 
 * 
 * @author Mcacisi Sithole
 */

public class ServiceLayer {
    
    
    public static void initializeConnection() throws DataStorageException{
        BankDA.initializeConnection();
    }
    
    
    
}
