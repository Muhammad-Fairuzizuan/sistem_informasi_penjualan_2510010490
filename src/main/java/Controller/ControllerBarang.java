/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Juan
 */

//import
import Koneksi.koneksi;
import Model.ModelBarang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerBarang {
    Connection cn = koneksi.getConnection();
   
   //tombol tambah
    public void tambah(ModelBarang barang){
        try {
            
            String sql = "INSERT INTO barang VALUES('"
                + barang.getId_barang()+ "','"
                + barang.getId_kategori() + "','"
                + barang.getNama_barang() + "','"
                + barang.getMerk() + "','"
                + barang.getHarga_beli() + "','"
                + barang.getHarga_jual() + "','"
                + barang.getSatuan_barang() + "','"
                + barang.getStok() + "','"
                + barang.getTgl_input() + "','"
                + barang.getTgl_update() + "')";
                
            cn.createStatement().executeUpdate(sql);
            
            JOptionPane.showMessageDialog(
                    null,
                    "Data berhasil ditambahkan"
            );
 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }
    
    //tombol edit
    public void edit(ModelBarang barang){

        try {

            String sql = "UPDATE barang SET "
                    + "id_kategori='" + barang.getId_kategori()+ "', "
                    + "nama_barang='" + barang.getNama_barang()+ "', "
                    + "merk='" + barang.getMerk()+ "', "
                    + "harga_beli='" + barang.getHarga_beli()+ "', "
                    + "harga_jual='" + barang.getHarga_jual()+ "', "
                    + "satuan_barang='" + barang.getSatuan_barang()+ "', "
                    + "stok='" + barang.getStok()+ "', "
                    + "tgl_input='" + barang.getTgl_input()+ "', "
                    + "tgl_update='" + barang.getTgl_update()+ "' "
                    + "WHERE id_barang='" + barang.getId_barang()+ "'";

            cn.createStatement().executeUpdate(sql);

            JOptionPane.showMessageDialog(
                    null,
                    "Data berhasil diubah"
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage()
            );
        }
    }
    
    //Tombol Hapus
    public void hapus(int id_barang){
    try {

        String sql =
                "DELETE FROM barang WHERE id_barang="
                + id_barang;

        cn.createStatement().executeUpdate(sql);

        JOptionPane.showMessageDialog(
                null,
                "Data berhasil dihapus"
        );

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );
    }
}
    
    //Tampilan Tabel
    public void tampil (DefaultTableModel model){
        
        model.setRowCount(0);
        try {
            
            String sql = "SELECT b.*, k.nama_kategori\n" +
                         "FROM barang b\n" +
                         "JOIN kategori k\n" +
                         "ON b.id_kategori = k.id_kategori";
            
            ResultSet rs = cn.createStatement().executeQuery(sql);
            
            while(rs.next()){
                
                Object[]data = {
                    rs.getInt("id_barang"),
                    rs.getInt("id_kategori"),
                    rs.getString("nama_barang"),
                    rs.getString("merk"),
                    rs.getBigDecimal("harga_beli"),
                    rs.getBigDecimal("harga_jual"),
                    rs.getString("satuan_barang"),
                    rs.getInt("stok"),
                    rs.getString("tgl_input"),
                    rs.getString("tgl_update")
                };
                
                model.addRow(data);
            }
                    
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
