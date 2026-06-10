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
import Model.ModelPenjualan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerPenjualan {
    Connection cn = koneksi.getConnection();
   
   //tombol tambah
    public void tambah(ModelPenjualan penjualan){
        try {
            
            String sql =
            "INSERT INTO penjualan "
            + "(id_penjualan,id_barang,id_member,jumlah,total,tanggal_input) "
            + "VALUES('"
            + penjualan.getId_penjualan()+ "','"
            + penjualan.getId_barang()+ "','"
            + penjualan.getId_member()+ "','"
            + penjualan.getJumlah()+ "','"
            + penjualan.getTotal()+ "','"
            + penjualan.getTgl_input()+ "')";
                
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
    public void edit(ModelPenjualan penjualan){

        try {

            String sql = "UPDATE penjualan SET "
                    + "id_barang='" + penjualan.getId_barang()+ "', "
                    + "id_member='" + penjualan.getId_member()+ "', "
                    + "jumlah='" + penjualan.getJumlah()+ "', "
                    + "total='" + penjualan.getTotal()+ "', "
                    + "tanggal_input='" + penjualan.getTgl_input()+ "' "
                    + "WHERE id_penjualan='" + penjualan.getId_penjualan()+ "'";

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
    public void hapus(int id_penjualan){
        try {
            
            String sql = "DELETE FROM penjualan WHERE id_penjualan=" + id_penjualan;
            
            cn.createStatement().executeUpdate(sql);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Tampilan Tabel
    public void tampil(DefaultTableModel model){

    model.setRowCount(0);

    try {

        String sql =
                "SELECT p.*, b.nama_barang, m.email " +
                "FROM penjualan p " +
                "JOIN barang b ON p.id_barang = b.id_barang " +
                "JOIN member m ON p.id_member = m.id_member";

        ResultSet rs =
                cn.createStatement().executeQuery(sql);

        while(rs.next()){

            Object[] data = {
                rs.getInt("id_penjualan"),
                rs.getInt("id_barang"),
                rs.getInt("id_member"),
                rs.getInt("jumlah"),
                rs.getBigDecimal("total"),
                rs.getString("tanggal_input")
            };

            model.addRow(data);
        }

    } catch (Exception e){

        JOptionPane.showMessageDialog(
                null,
                e.getMessage()
        );
    }
}
}
