package com.Backend.ProblemDomain;

/*
 * MODEL CLASS FOR CREDENTIALS
 * VARIBALES
 * DEFAULT CONSTRUCTOR
 * PARAMETERIZED CONSTRUCTOR
 * GETTERS & SETTERS
 * TOSTRING METHOD
 */
public class CredentialPD {

    private String savingsAccountNumber;
    private String pin;
    

    public CredentialPD() {
        savingsAccountNumber="";
        pin="";
    }



    public CredentialPD(String savingsAccountNumber, String pin) {
        this.savingsAccountNumber = savingsAccountNumber;
        this.pin = pin;
    }



    public String getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    public String getPin() {
        return pin;
    }



    public void setSavingsAccountNumber(String savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    
    @Override
    public String toString() {
        return "SAVINGS ACCOUNT NUMBER: " + savingsAccountNumber + "\n" +
                "PIN CODE: " + pin;
    }

}
