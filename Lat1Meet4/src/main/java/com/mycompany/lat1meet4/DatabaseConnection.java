/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat1meet4;
import java.sql.*;

/**
 *
 * @author sheila
 */
public class DatabaseConnection {
    String url = "jdbc:mysql://localhost:3306/databasedemo";
    String username = "root";
    String password = "";
    
    //membuat instance singleton
    private static DatabaseConnection instance;
    private static Connection koneksi;
    
    //private constructor agar kelas ini tidak dapat diinstansiasi secara langsung
    public void connect() throws SQLException{
    //melakukan inisialisasi koneksi database disini
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, username, password);
        } catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //method untuk mendapatkan instance singleton
    public static synchronized DatabaseConnection getInstance() throws SQLException{
        if (instance == null){
            instance = new DatabaseConnection();
            instance.connect();
        }
        return instance;
    }
    
    //method lain untuk berinteraksi dengan database
    public static synchronized Connection getConnection(){
        return koneksi;
    }
    
    public void closeConnection() throws SQLException{
        koneksi.close();
    }
}

//mendapatkan instance singleton
//DatabaseConnection databaseconnection = DtabaseConnnection.getInstance();
//menggunakan koneksi database
//databaseconnection.executeQuery("select*from tabel');
