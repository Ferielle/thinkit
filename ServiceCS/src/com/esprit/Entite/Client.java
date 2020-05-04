/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Entite;

import java.util.ArrayList;

/**
 *
 * @author feriel
 */
public class Client extends User {
private int nationalId,zipCode;

private String firstName,lastName,adresse,region,gender;
private ArrayList vendors;
// c quoi ca user

    public Client(int nationalId, int zipCode, String firstName, String lastName, String adresse, String region, String gender, ArrayList vendors, String login, String password, String email, int id) {
        super(login, password, email, id);
        this.nationalId = nationalId;
        this.zipCode = zipCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.region = region;
        this.gender = gender;
        this.vendors = vendors;
    }

   
    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList getVendors() {
        return vendors;
    }

    public void setVendors(ArrayList vendors) {
        this.vendors = vendors;
    }

    @Override
    public String toString() {
        return "Client{" + "nationalId=" + nationalId + ", zipCode=" + zipCode + ", firstName=" + firstName + ", lastName=" + lastName + ", adresse=" + adresse + ", region=" + region + ", gender=" + gender + ", vendors=" + vendors + '}';
    }




}
