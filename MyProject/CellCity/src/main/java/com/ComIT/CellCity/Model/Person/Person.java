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

}
