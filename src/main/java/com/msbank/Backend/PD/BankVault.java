
package com.msbank.Backend.PD;

/**
 *CONTAINS USER SECRET INFORMATION LIKE PINS & SAVINGS ACCOUNT NUMBER
 *
 * 
 * @author Mcacisi Sithole
 */

public class BankVault {
   
    private char pin;
    private String accountNumber;
    
    
    public BankVault(){
    pin = 0;
    accountNumber = "";
    }

    
    
    public BankVault(char pin, String accountNumber) {
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
    
    
    
}
