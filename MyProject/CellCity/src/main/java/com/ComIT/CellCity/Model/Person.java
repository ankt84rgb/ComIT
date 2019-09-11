package com.ComIT.CellCity.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @NotNull (message = "First Name is required")
    private String firstName;

    @NotNull (message = "Last Name is required")
    private String lastName;
    private String address;
    private String city;
    private String province;
    private String postalCode;
    private String mobileNo;
    private String eMail;
    private String password;
    private String cardNo;
    private String cardExpiryDate;
    private String cardCVVNo;

    public Person() { }

    public Person(String firstName, String lastName, String address, String city, String province, String postalCode, String mobileNo, String eMail, String password, String cardNo, String cardExpiryDate, String cardCVVNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.mobileNo = mobileNo;
        this.eMail = eMail;
        this.password = password;
        this.cardNo = cardNo;
        this.cardExpiryDate = cardExpiryDate;
        this.cardCVVNo = cardCVVNo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
}
