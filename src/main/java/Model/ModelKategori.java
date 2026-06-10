/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan
 */
public class ModelKategori {
    
    private int id_kategori;
    private String nama_kategori;
    private String tgl_input;
    
    //Getter
    public int getId_kategori(){
        return id_kategori;
    }
    
    public String getNama_kategori(){
        return nama_kategori;
    }
    
    public String getTgl_input(){
        return tgl_input;
    }
    
    //Setter
    public void setId_kategori(int id_kategori){
        this.id_kategori = id_kategori;
    }
    
    public void setNama_kategori(String nama_kategori){
        this.nama_kategori = nama_kategori;
    }
    
    public void setTgl_input (String tgl_input){
        this.tgl_input = tgl_input;
    }
    
}
