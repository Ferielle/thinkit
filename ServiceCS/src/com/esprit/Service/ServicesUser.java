/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Service;


import com.esprit.Entite.User;
import com.esprit.IService.IService;
import com.esprit.utils.DataBase;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class ServicesUser implements IService<User> {

    private Connection con = DataBase.getInstance().getConnection();
    private Statement ste;

    public ServicesUser() {

        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public boolean ajouter(User t) throws SQLException {
        boolean etat = false;
        String requete = "INSERT INTO `User` (`login`, `password`, `email`) "
                + "VALUES ( '" + t.getLogin()+ "', '" + t.getPassword() + "', '" + t.getEmail() + "');";

        int res = ste.executeUpdate(requete);
        if (res != 0) {
            etat = true;
        }

        return etat;
    }



 @Override
    public boolean update(User t) throws SQLException {
        boolean   etat=false;
        String requdate="UPDATE `user` SET `login`  = `"+t.getLogin()+"' WHERE `Personne`.`id` = '"+t.getId()+"');";
                 
           int res= ste.executeUpdate(requdate);
             if (res != 0) {
            etat = true;
             }
       return etat;
    }


    @Override
    public boolean supprimer(User u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
