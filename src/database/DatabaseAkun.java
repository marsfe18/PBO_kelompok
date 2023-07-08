/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import Data.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Second
 */
public class DatabaseAkun {
    
    public static DatabaseAkun instance;
    private List<User> users;
    private User user;

    public DatabaseAkun() {
    }
    
    public static synchronized DatabaseAkun getInstance() {
        if(instance == null) {
            instance = new DatabaseAkun();
        }
        return instance;
    }
    
    public User findById(String username) {
        // DAPATKAN USER DENGAN ID
        return null;
    }
    
    public List<User> findByRole(String role) {
        // DAPATKAN LIST USER BERDASARKAN ROLENYA
        return null;
    }
    
    public List<User> findAll() {
        // DAPATKAN SEMUA USER
        return null;
    }
    
    public User save(User user) {
        // SAVE STAFF BARU DISINI
        return null;
    }
    
    public User edit(User user) {
        // EDIT/UPDATE USER DISINI
        return null;
    }
    
    public List<String> login(String username, String password){
        // BUAT LOGIN DISINI RETURNYA BERUPA LIST STRING 0-NAMA 1-ROLE (2 admin/staff)
        return null;
    }
    
    public void deleteById(Integer id) {
        // DELETE USER
    }
    
    
    
}
