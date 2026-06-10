/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Juan
 */
import Koneksi.koneksi;
import Model.ModelMember;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerMember {
   Connection cn = koneksi.getConnection();
   
   //tombol tambah
    public void tambah(ModelMember member){
        try {
            
            String sql = "INSERT INTO member VALUES('"
                + member.getId_member() + "','"
                + member.getAlamat_member() + "','"
                + member.getTelepon() + "','"
                + member.getEmail() + "','"
                + member.getGambar() + "','"
                + member.getNik() + "')";
            
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
    public void edit(ModelMember member){

        try {

            String sql = "UPDATE member SET "
                    + "alamat_member='" + member.getAlamat_member()+ "', "
                    + "telepon='" + member.getTelepon()+ "', "
                    + "email='" + member.getEmail()+ "', "
                    + "gambar='" + member.getGambar()+ "', "
                    + "nik='" + member.getNik()+ "' "
                    + "WHERE id_member='" + member.getId_member() + "'";

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
    public void hapus(int id_member){
        try {
            
            String sql = "DELETE FROM member WHERE id_member=" + id_member;
            
            cn.createStatement().executeUpdate(sql);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Tampilan Tabel
    public void tampil (DefaultTableModel model){
        
        model.setRowCount(0);
        try {
            
            String sql = "SELECT * FROM member";
            
            ResultSet rs = cn.createStatement().executeQuery(sql);
            
            while(rs.next()){
                
               Object[] data = {
                    rs.getInt("id_member"),
                    rs.getString("alamat_member"),
                    rs.getString("telepon"),
                    rs.getString("email"),
                    rs.getString("gambar"),
                    rs.getString("nik")
                };
                
                model.addRow(data);
            }
                    
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Cari Gambar
  public String cariGambar(int id_member){
    
    String gambar = "";

    try {

        String sql = "SELECT gambar FROM member "
                + "WHERE id_member=" + id_member;

        ResultSet rs = cn.createStatement().executeQuery(sql);

        if(rs.next()){
            gambar = rs.getString("gambar");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }

    return gambar;
}
}
