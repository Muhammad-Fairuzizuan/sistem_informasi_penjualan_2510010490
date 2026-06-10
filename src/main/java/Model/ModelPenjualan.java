/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Juan
 */
public class ModelPenjualan {
    
    private int id_penjualan;
    private int id_barang;
    private int id_member;
    private int jumlah;
    private BigDecimal  total;
    private String tanggal_input;
    
    //getter
    public int getId_penjualan(){
        return id_penjualan;
    }
    
    public int getId_barang(){
        return id_barang;
    }
    
    public int getId_member(){
        return id_member;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public BigDecimal getTotal(){
        return total;
    }
    
    public String getTgl_input(){
        return tanggal_input;
    }
    
    //Setter
    public void setId_penjualan(int id_penjualan){
        this.id_penjualan = id_penjualan;
    }
    
    public void setId_barang(int id_barang){
        this.id_barang = id_barang;
    }
    
    public void setId_member(int id_member){
        this.id_member = id_member;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public void setTotal(BigDecimal total){
        this.total = total;
    }
    
    public void setTgl_input(String tanggal_input){
        this.tanggal_input = tanggal_input;
    }
    
    
}
