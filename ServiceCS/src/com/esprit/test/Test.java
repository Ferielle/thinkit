/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.test;

import com.esprit.Entite.User;
import com.esprit.Service.ServicesUser;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sana
 */
public class Test {

    public static void main(String[] args) {

        ServicesUser ser = new ServicesUser();
        User p1 = new User("ben fadhel", "sana", "dora@dora.tn",22);

        try {
            boolean t = ser.ajouter(p1);
            System.out.println(t);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
