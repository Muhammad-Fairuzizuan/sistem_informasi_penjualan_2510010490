package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {

    static Connection cn;

    public static Connection getConnection(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/db_penjualan",
                    "root",
                    "Z08u10a05n"
            );

            System.out.println("Koneksi berhasil");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return cn;
    }
}