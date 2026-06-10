/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Juan
 */

//inport
import Koneksi.koneksi;
import Model.ModelKategori;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerKategori {
   Connection cn = koneksi.getConnection();
   
   //tombol tambah
    public void tambah(ModelKategori kategori){
        try {
            
            String sql = "INSERT INTO kategori VALUES('"
                + kategori.getId_kategori()+ "','"
                + kategori.getNama_kategori()+ "','"
                + kategori.getTgl_input()+ "')";
      
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
    public void edit(ModelKategori kategori){

        try {

            String sql = "UPDATE kategori SET "
                    + "nama_kategori='" + kategori.getNama_kategori()+ "', "
                    + "tgl_input='" + kategori.getTgl_input()+ "' "
                    + "WHERE id_kategori='" + kategori.getId_kategori()+ "'";

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
    public void hapus(int id_kategori){
        try {
            
            String sql = "DELETE FROM kategori WHERE id_kategori=" + id_kategori;
            
            cn.createStatement().executeUpdate(sql);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Tampilan Tabel
    public void tampil (DefaultTableModel model){
        
        model.setRowCount(0);
        try {
            
            String sql = "SELECT * FROM kategori";
            
            ResultSet rs = cn.createStatement().executeQuery(sql);
            
            while(rs.next()){
                
                Object[]data = {
                    rs.getInt("id_kategori"),
                    rs.getString("nama_kategori"),
                    rs.getString("tgl_input")
                };
                
                model.addRow(data);
            }
                    
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
