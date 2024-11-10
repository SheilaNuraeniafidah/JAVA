/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lat1meet4;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author sheila
 */
public class Lat1Meet4 {

    public static void main(String[] args) throws SQLException {
       Scanner scan = new Scanner(System.in);
       DatabaseConnection dbaseConnection = DatabaseConnection.getInstance();
       Connection connect = dbaseConnection.getConnection();
       System.out.println("koneksi berhasil");
       try{
           Statement st = connect.createStatement();
           
           String query = "select * from mobil";
           ResultSet rs = st.executeQuery(query);
           while (rs.next()){
               System.out.println("id " + rs.getInt(1));
               System.out.println("mobil " + rs.getString("vendor"));
               System.out.println("tipe " + rs.getString("tipe"));
               System.out.println("cc mesin " + rs.getString("mesin"));
               System.out.println("kecepatan maksimal " + rs.getInt(4));
           }
           boolean exit=false;
           while(!exit){
               System.out.println("apakah ingin menambahkan data? ");
               System.out.println("1. ya");
               System.out.println("2. tidak");
               System.out.print("jawaban : ");
               int ans = scan.nextInt();
               scan.nextLine();
               
               switch(ans){
                   case 1 ->{
                       System.out.print("masukkan ID : ");
                       int id = scan.nextInt();
                       
                       scan.nextLine();
                       
                       System.out.print("masukkan nama vendor : ");
                       String vendor = scan.nextLine();
                       
                       System.out.print("masukkan tipe mobil : ");
                       String tipe = scan.nextLine();
                       
                       System.out.print("masukkan cc mesin mobil : ");
                       String mesin = scan.nextLine();
                       
                       System.out.print("kecepatan maksimal :  ");
                       int maxspeed = scan.nextInt();
                       
                       String insertQuery = "INSERT INTO mobil (id, vendor, tipe, mesin, maxspeed) VALUE (?,?,?,?,?)";
                       
                       PreparedStatement prepare = connect.prepareStatement(insertQuery);
                       prepare.setInt(1, id);
                       prepare.setString(2, vendor);
                       prepare.setString(3, tipe);
                       prepare.setString(4, mesin);
                       prepare.setInt(5, maxspeed);
                       
                       int rowInserted = prepare.executeUpdate();
                       if (rowInserted > 0){
                           System.out.println("data berhasil ditambahkan!");
                       } else{
                           System.out.println("data gagal ditambahkan");
                       }
                   }
                   case 2 ->{
                       System.out.println("ok terima kasih");
                       exit = true;
                   }
                   default ->{
                       System.out.println("pilihan tidak valid");
                   }
               }
           }
           st.close();
           dbaseConnection.closeConnection();
           System.out.println("koneksi ditutup");
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
    }
}
