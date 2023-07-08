/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import data.FormPerusahaan;
import data.Perusahaan;
import java.util.ArrayList;

/**
 *
 * @author Second
 */
public class Database {
    
     public static Database instance;
     private ArrayList<FormPerusahaan> formPerusahaans;

    public Database() {
    }
    
    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
     
    
    public FormPerusahaan getById(int id) {
        // WRITE CODE HERE...
        return null;
    }
    
    public FormPerusahaan save(FormPerusahaan forms) {
        // WRITE CODE HERE...
        return null;
    }
    
    public FormPerusahaan edit(FormPerusahaan forms) {
        // WRITE CODE HERE...
        return null;
    }
    
    public void delete(FormPerusahaan forms, Perusahaan perusahaan) {
        // WRITE CODE HERE...
        return;
    }
    
}
