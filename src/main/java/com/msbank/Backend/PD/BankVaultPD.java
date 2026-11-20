
package com.msbank.Backend.PD;

/**
 *CONTAINS USER SECRET INFORMATION LIKE PINS & SAVINGS ACCOUNT NUMBER
 *
 * 
 * @author Mcacisi Sithole
 */

public class BankVault {
   
    private String pin;
    private String accountNumber;
    
    
    public BankVault(){
    pin = "";
    accountNumber = "";
    }

    
    
    public BankVault(String pin, String accountNumber) {
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    
    
    public String getPin() {
        return pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    
    
    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    
    @Override
    public String toString() {
        return "ACCOUNT NUMBER: " + accountNumber + "\n" +
               "PIN CODE: " + pin;
    }
    
    
    
}
