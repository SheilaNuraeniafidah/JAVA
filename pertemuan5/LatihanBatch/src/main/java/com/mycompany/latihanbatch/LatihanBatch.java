/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanbatch;
import java.sql.*;
/**
 *
 * @author sheila
 */
public class LatihanBatch {

    public static void main(String[] args) throws SQLException {
        koneksi connects = koneksi.getInstance();
        Connection con = connects.getConnection();
        System.out.println("koneksi berhasil");
        
        String sql = "INSERT INTO mahasiswa (nama, nim, prodi) VALUES (?, ?, ?) ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Nurcahya");
            ps.setString(2, "K352222");
            ps.setString(3, "PTIK");
            ps.addBatch();
            ps.setString(1, "Sulaiman");
            ps.setString(2, "K352230");
            ps.setString(3, "PTIK");
            ps.addBatch();
            int[]jml = ps.executeBatch();
            System.out.println("batch proceesing berhasil");
            
            ps.close();
            connects.closeConnection();
            System.out.println("koneksi ditutup");
        } catch(SQLException ex){
            ex.getMessage();
        }
    }
}
