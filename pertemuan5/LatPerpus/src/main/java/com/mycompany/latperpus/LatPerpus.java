/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latperpus;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author sheila
 */
public class LatPerpus {
    private static Connection connection;

    public static void main(String[] args) {
      try{
          String url = "jdbc:mysql://localhost:3306/anggota";
          String username= "root";
          String password="";
          connection = DriverManager.getConnection(url, username, password);
          
          Scanner input = new Scanner(System.in);
          
          while (true){
              System.out.println("SELAMAT DATANG DI PERPUSTAKAAN PUSAT UNS");
              System.out.println("1. Pendaftaran anggota");
              System.out.println("2. Tampilkan semua data anggota");
              System.out.println("3. Ubah data anggota");
              System.out.println("4. Hapus data anggota");
              System.out.println("5. Keluar");
              System.out.println("===============================");
              System.out.print("Masukkan perintah : ");
              int choice = input.nextInt();
              input.nextLine();
              
              switch (choice) {
                    case 1:
                        daftarAnggota(input);
                        break;
                    case 2:
                        tampilkanDataAnggota();
                        break;
                    case 3:
                        ubahDataAnggota(input);
                        break;
                    case 4:
                        hapusDataAnggota(input);
                        break;
                    case 5:
                        System.out.println("Sampai jumpa!");
                        System.exit(0);
                    default:
                        System.out.println("Perintah tidak valid.");
                }
                System.out.println("===============================");
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                if (connection != null){
                    connection.close();
                }
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    
    private static void daftarAnggota (Scanner input) throws SQLException{
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        String prodi = input.nextLine();
        
        String sql = "INSERT INTO anggota (nama, nim, prodi) VALUES (?, ?, ?)";
        PreparedStatement prepare = connection.prepareStatement(sql);
        prepare.setString(1, nama);
        prepare.setString(2, nim);
        prepare.setString(3, prodi);
        
        int rowsInserted = prepare.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Data berhasil dibuat");
        }
    }
    
    private static void tampilkanDataAnggota() throws SQLException{
        String sql = "SELECT * FROM anggota";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        System.out.println("[DATA ANGGOTA]");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nama = resultSet.getString("nama");
            String nim = resultSet.getString("nim");
            String prodi = resultSet.getString("prodi");
            System.out.println(id + " - " +nama + " - " + nim + " - " + prodi);
        }
    }
    
    private static void ubahDataAnggota(Scanner input) throws SQLException{
        tampilkanDataAnggota();
        
        System.out.print("Masukkan no ID : ");
        int id = input.nextInt();
        input.nextLine();
        
        String sql = "SELECT * FROM anggota WHERE id = ?";
        PreparedStatement selectStatement = connection.prepareStatement(sql);
        selectStatement.setInt(1, id);
        
        ResultSet resultSet = selectStatement.executeQuery();

         if (resultSet.next()){
            String namaLama = resultSet.getString("nama");
            String nimLama = resultSet.getString("nim");
            String prodiLama = resultSet.getString("prodi");

            System.out.println("[DATA ANGGOTA LAMA]");
            System.out.println(namaLama + " - " + nimLama + " - " + prodiLama);

            System.out.print("Masukkan Nama baru : ");
            String namaBaru = input.nextLine();
            System.out.print("Masukkan NIM baru : ");
            String nimBaru = input.nextLine();
            System.out.print("Masukkan Prodi baru : ");
            String prodiBaru = input.nextLine();
            
            sql = "UPDATE anggota SET nama = ?, nim = ?, prodi = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(sql);
            updateStatement.setString(1, namaBaru);
            updateStatement.setString(2, nimBaru);
            updateStatement.setString(3, prodiBaru);
            updateStatement.setInt(4, id);
            
            int rowsUpdated = updateStatement.executeUpdate();
            if (rowsUpdated > 0){
                System.out.println("Data berhasil diperbarui");
                System.out.println("[DATA ANGGOTA BARU]");
                System.out.println(namaBaru + "-" + nimBaru + "-" + prodiBaru);
            }
            } else{ 
                System.out.println("Data tidak ditemukan.");
            }
        }     
    private static void hapusDataAnggota(Scanner input) throws SQLException{
        tampilkanDataAnggota();

        System.out.print("Masukkan no ID : ");
        int id = input.nextInt();
        input.nextLine();
        
        String sql = "SELECT * FROM anggota WHERE id = ?";
        PreparedStatement selectStatement = connection.prepareStatement(sql);
        selectStatement.setInt(1, id);
        
        ResultSet resultSet = selectStatement.executeQuery();
        
        if (resultSet.next()) {
            String nama = resultSet.getString("nama");
            String nim = resultSet.getString("nim");
            String prodi = resultSet.getString("prodi");
            
            System.out.println("[DATA ANGGOTA]");
            System.out.println(nama + " - " + nim + " - " + prodi);
            
            System.out.print("Apakah data ini yang ingin Anda hapus (y/n)? : ");
            String confirm = input.nextLine();
            
            if (confirm.equalsIgnoreCase("y")) {
                sql = "DELETE FROM anggota WHERE id = ?";
                PreparedStatement deleteStatement = connection.prepareStatement(sql);
                deleteStatement.setInt(1, id);

                int rowsDeleted = deleteStatement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Data berhasil dihapus!");
                }
            } else {
                System.out.println("Penghapusan dibatalkan.");
            }
            } else {
            System.out.println("Data tidak ditemukan.");
            }
        }
    }


