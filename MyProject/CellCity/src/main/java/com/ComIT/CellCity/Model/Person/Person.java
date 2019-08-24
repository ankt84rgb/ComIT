package com.ComIT.CellCity.Model.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String mobileNo;
    private String eMail;
    private String password;
    private String creditCardNo;
    private String creditExpiryDate;
    private String creditCVVNo;
    private String debitCardNo;
    private String debitExpiryDate;
    private String debitCVVNo;

    public Person() { }

    public Person(String firstName, String lastName, String address, String postalCode, String mobileNo, String eMail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.mobileNo = mobileNo;
        this.eMail = eMail;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public String getCreditExpiryDate() {
        return creditExpiryDate;
    }

    public void setCreditExpiryDate(String creditExpiryDate) {
        this.creditExpiryDate = creditExpiryDate;
    }

    public String getCreditCVVNo() {
        return creditCVVNo;
    }

    public void setCreditCVVNo(String creditCVVNo) {
        this.creditCVVNo = creditCVVNo;
    }

    public String getDebitCardNo() {
        return debitCardNo;
    }

    public void setDebitCardNo(String debitCardNo) {
        this.debitCardNo = debitCardNo;
    }

    public String getDebitExpiryDate() {
        return debitExpiryDate;
    }

    public void setDebitExpiryDate(String debitExpiryDate) {
        this.debitExpiryDate = debitExpiryDate;
    }

    public String getDebitCVVNo() {
        return debitCVVNo;
    }

    public void setDebitCVVNo(String debitCVVNo) {
        this.debitCVVNo = debitCVVNo;
    }
}
