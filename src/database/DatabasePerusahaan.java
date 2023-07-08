/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import data.FormPerusahaan;
import data.Perusahaan;
import java.util.List;

/**
 *
 * @author Second
 */
public class DatabasePerusahaan {
    
    public static DatabasePerusahaan instance;
    private List<Perusahaan> perusahaans;
    private Perusahaan perusahaan;

    public DatabasePerusahaan() {
    }
    
    public static synchronized DatabasePerusahaan getInstance(){
        if(instance == null){
            instance = new DatabasePerusahaan();
        }
        return instance;
    }
    
    public List<Perusahaan> findAll() {
        // DAPATKAN SEMUA PERUSAHAAN DARI DATABASE
        return null;
    }
    
    public Perusahaan findById(Integer id) {
        // DAPATKAN PERUSAHAAN BERDASARKAN ID-NYA (PRIMARY KEY)
        return null;
    }
    
    public List<Perusahaan> findByFormPerusahaanId(Integer formPerusahaanId) {
        // DAPATKAN LIST PERUSAHAAN DARI FORM ID
        return null;
    }
    
    public Perusahaan save(Perusahaan perusahaan) {
        // SAVE PERUSAHAAN
        return null;
    }
    
    public Perusahaan edit(Perusahaan perusahaan) {
        // EDIT PERUSAHAAN
        return null;
    }
    
    public void deleteById(Integer id) {
        // DELETE PERUSAHAAN
    }
    
}
