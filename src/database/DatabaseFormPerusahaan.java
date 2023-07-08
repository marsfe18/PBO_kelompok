/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import data.FormPerusahaan;
import data.Perusahaan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Second
 */
public class DatabaseFormPerusahaan {
    
    public static DatabaseFormPerusahaan instance;
    private List<FormPerusahaan> formPerusahaans;
    private FormPerusahaan formPerusahaan;

    public DatabaseFormPerusahaan() {
    }
    
    public static synchronized DatabaseFormPerusahaan getInstance(){
        if(instance == null){
            instance = new DatabaseFormPerusahaan();
        }
        return instance;
    }
     
    
    public FormPerusahaan getById(int id) {
        // DAPATKAN FORM PERUSAHAAN BERDASARKAN ID-NYA
        return null;
    }
    
    public List<FormPerusahaan> findAll() {
        // QUERY BUAT DAPETIN SEMUA FORM PERUSAHAAN
        return null;
    }
    
    public FormPerusahaan save(FormPerusahaan forms) {
        // NGESAVE FORM, KLO MISAL PERUSAHAAN ADA YANG DISAVE JUGA PAKE INI AJA TAPI MAKE CLASS DatabasePerusahaan
        return null;
    }
    
    public FormPerusahaan edit(FormPerusahaan forms) {
        // EDIT/UPDATE FORM PERUSAHAAN, KLO ADA PERUSAHAAN YG DIUPDATE JUGA MASUKIN QUERYNYA SEKALIAN DISINI (MIRIP SAMA SAVE)
        return null;
    }
    
    public void deleteById(Integer id) {
        // HAPUS FORM;
    }
    
}
