/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan
 */
public class ModelMember {
    
    private int id_member;
    private String alamat_member;
    private String telepon;
    private String email;
    private String gambar;
    private String nik;
    
    //Getter
    public int getId_member(){
        return id_member;
    }
    
    public String getAlamat_member(){
        return alamat_member;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getGambar(){
        return gambar;
    }
    
    public String getNik(){
        return nik;
    }
    
    //Setter
    
    public void setId_member(int id_member){
        this.id_member = id_member;
    }
    
    public void setAlamat_member(String alamat_member){
        this.alamat_member = alamat_member;
    }
    
    public void setTelepon(String telepon){
        this.telepon = telepon;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setGambar(String gambar){
        this.gambar = gambar;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
}
