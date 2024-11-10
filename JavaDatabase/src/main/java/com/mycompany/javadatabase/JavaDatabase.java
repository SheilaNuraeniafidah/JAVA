/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javadatabase;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author sheila
 */
public class JavaDatabase {

    public static void main(String[] args) throws SQLException {
       String url = "jdbc:mysql://localhost:3306/databasedemo";
       String username = "root";
       String password = "";
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection koneksi = DriverManager.getConnection(url, username, password);
           Statement st = koneksi.createStatement();
           System.out.println("koneksi berhasil");
           
           String query = "select *from mobil";
           ResultSet rs = st.executeQuery(query);
           
           while(rs.next()){
               System.out.println("mobil " + rs.getString("vendor"));
               System.out.println("tipe " + rs.getString("tipe"));
               System.out.println("cc mesin " + rs.getString("mesin"));
               System.out.println("kecepatan maksimal " + rs.getString(4));
           }
           st.close();
           koneksi.close();
           System.out.println("koneksi ditutup");
       } catch(ClassNotFoundException ex){
           System.out.println(ex.getMessage());
       }
    }
}
