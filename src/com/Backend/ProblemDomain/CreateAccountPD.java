
package com.Backend.ProblemDomain;

/**
 * @author Mcacisi Sithole
 *
 * 
 * MODEL CLASS WHICH IS THE BLUEPRINT OF THE DESKTOT BANKING APP
 * VARIBALES
 * DEFAULT CONSTRUCTOR
 * PARAMETERIZED CONSTRUCTOR
 * GETTERS & SETTERS
 * TOSTRING METHOD
 */
public class CreateAccountPD {

    private String fullname;
    private String idNumber;
    private String contact;
    private String gender;
    private String savingsAccountNumber;
    private String email;
    private String address;
    private String city;
    private String nationality;


    
    public CreateAccountPD() {
        fullname = "";
        idNumber = "";
        contact = "";
        savingsAccountNumber = "";
        email = "";
        address = "";
        city = "";
        nationality = "";
    }

    
    
    
    
    public CreateAccountPD(String fullname, String idNumber, String contact, String gender, String savingsAccountNumber, String email, String address, String city, String nationality) {
        this.fullname = fullname;
        this.idNumber = idNumber;
        this.contact = contact;
        this.gender = gender;
        this.savingsAccountNumber = savingsAccountNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.nationality = nationality;
    }

    
    
    
    
    public String getFullname() {
        return fullname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getContact() {
        return contact;
    }

    public String getGender() {
        return gender;
    }

    public String getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getNationality() {
        return nationality;
    }

    
    
    
    
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSavingsAccountNumber(String savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }



   

    
    @Override
    public String toString() {
        return "FULLNAME: " + fullname + "\n" +
                "ID NUMBER: " + idNumber + "\n" +
                "CONTACT: " + contact + "\n" +
                "GENDER: " + gender + "\n" +
                "SAVINGS ACCOUNT NUMBER: " + savingsAccountNumber + "\n" +
                "EMAIL: " + email + "\n" +
                "ADDRESS: " + address + "\n" +
                "CITY: " + city + "\n" +
                "NATIONALITY: " + nationality
                ;
    }

}
