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
public class ModelBarang {
    
    private int id_barang;
    private int id_kategori;
    private String nama_barang;
    private String merk;
    private BigDecimal harga_beli;
    private BigDecimal harga_jual;
    private String satuan_barang;
    private int stok;
    private String tgl_input;
    private String tgl_update;
    
    //Getter
    public int getId_barang(){
        return id_barang;
    }
    
    public int getId_kategori(){
        return id_kategori;
    }
    
    public String getNama_barang(){
        return nama_barang;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public BigDecimal getHarga_beli(){
        return harga_beli;
    }
    
    public BigDecimal getHarga_jual(){
        return harga_jual;
    }
    
    public String getSatuan_barang(){
        return satuan_barang;
    }
    
    public int getStok(){
        return stok;
    }
    
    public String getTgl_input(){
        return tgl_input;
    }
    
    public String getTgl_update(){
        return tgl_update;
    }
    
    //Setter
    
    public void setId_barang(int id_barang){
        this.id_barang = id_barang;
    }
    
    public void setId_kategori(int id_kategori){
        this.id_kategori = id_kategori;
    }
        
    public void setNama_barang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setHarga_beli(BigDecimal harga_beli){
        this.harga_beli = harga_beli;
    }
    
    public void setHarga_jual(BigDecimal harga_jual){
        this.harga_jual = harga_jual;
    }
    
    public void setSatuan_barang (String satuan_barang){
        this.satuan_barang = satuan_barang;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public void setTgl_input(String tgl_input){
        this.tgl_input = tgl_input;
    }
    
    public void setTgl_update(String tgl_update){
        this.tgl_update = tgl_update;
    }
    
}
