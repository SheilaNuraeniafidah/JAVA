/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.updatedeletesql;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author user
 */
public class UpdateDeleteSql {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/databasedemo";
        String username = "root";
        String password = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, username, password);
            System.out.println("koneksi berhasil");
            
            //query mengubah data dengan id = 2
            String query = "UPDATE mobil SET vendor = ?, tipe = ?, mesin = ?, maxSpeed = ? WHERE id = ?";
            PreparedStatement st = koneksi.prepareStatement(query);
            st.setString(1, "Buggati");
            st.setString(2, "veyron");
            st.setString(3, "8000");
            st.setInt(4, 254);
            st.setInt(5, 2);
            st.executeUpdate();
            System.out.println("data berhasil diubah");
            
            //query menghapus data
            String del = "DELETE FROM mobil WHERE id = ?";
            PreparedStatement delete = koneksi.prepareStatement(del);
            delete.setInt(1, 3);
            delete.executeUpdate();
            System.out.println("data berhasil dihapus");
            
            
            //close koneksi
            st.close();
            delete.close();
            koneksi.close();
            System.out.println("koneksi ditutup");
            
        } catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
