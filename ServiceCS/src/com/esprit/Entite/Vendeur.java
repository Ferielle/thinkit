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
public class Vendeur extends User {

    private int patentId;
    private String socialName;
//user c quoi
    private ArrayList customers, vendors;

    public Vendeur(int patentId, String socialName, ArrayList customers, ArrayList vendors, String login, String password, String email, int id) {
        super(login, password, email, id);
        this.patentId = patentId;
        this.socialName = socialName;
        this.customers = customers;
        this.vendors = vendors;
    }

   

    public int getPatentId() {
        return patentId;
    }

    public void setPatentId(int patentId) {
        this.patentId = patentId;
    }

    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    public ArrayList getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList customers) {
        this.customers = customers;
    }

    public ArrayList getVendors() {
        return vendors;
    }

    public void setVendors(ArrayList vendors) {
        this.vendors = vendors;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "patentId=" + patentId + ", socialName=" + socialName + ", customers=" + customers + ", vendors=" + vendors + '}';
    }

}
