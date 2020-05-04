/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Entite;

/**
 *
 * @author feriel
 */
public class User {

    private String login, password, role, email;
    private int id,phone;

    public User(int id,String login, String password, String role, String email, int phone) {
        this.id=id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phone = phone;
    }

    public User(String login, String password, String email, int id) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", role=" + role + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
   
    
    
    
}
