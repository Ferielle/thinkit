/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.IService;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sana
 */
public interface IService<U> {
    
    boolean ajouter(U u) throws SQLException;
    
    boolean update(U u) throws SQLException;
    
    boolean supprimer(U u) throws SQLException;
    
    List<U> readAll() throws SQLException;
    
   
}
