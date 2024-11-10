/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanbatch;
import java.sql.*;
/**
 *
 * @author sheila
 */
public class koneksi {
    String url = "jdbc:mysql://localhost:3306/mahasiswa";
    String username = "root";
    String password = "";
    
    private static koneksi instance;
    private static Connection koneksidata;
    
    public void connect() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksidata = DriverManager.getConnection(url, username, password);
        } catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static synchronized koneksi getInstance() throws SQLException{
        if (instance == null){
            instance = new koneksi();
            instance.connect();
        }
        return instance;
    }
    
    public static synchronized Connection getConnection(){
        return koneksidata;
    }
    
    public void closeConnection() throws SQLException{
        koneksidata.close();
    }
}
