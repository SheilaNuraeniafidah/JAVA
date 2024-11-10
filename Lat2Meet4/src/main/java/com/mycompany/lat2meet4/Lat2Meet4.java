/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lat2meet4;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Sheila
 */
public class Lat2Meet4 {
    private static final String url = "jdbc:mysql://localhost:3306/anggota";
    private static final String username = "root";
    private static final String password = "";
    
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println(" SELAMAT DATANG DIPERPUSTAKAAN UNS :)");
            System.out.println("1. Pendaftaran anggota");
            System.out.println("2. tampilkan daftar anggota");
            System.out.println("3. Keluar");
            System.out.println(" ====================================");
            System.out.print("masukkan perintah : ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice){
                case 1 : 
                    daftarAnggota(scanner);
                    break;
                case 2:
                    tampilkanDataAnggota();
                    break;
                case 3:
                    System.out.println("sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("perintah tidak valid");
            }
        }
    }
    
    private static void daftarAnggota(Scanner scanner) throws SQLException{
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("masukkan nim: ");
            String nim = scanner.nextLine();
            
            System.out.print("masukkan prodi: ");
            String prodi = scanner.nextLine();
            
            String sql = "INSERT INTO anggota (nama, nim, prodi)VALUES (?, ?, ?)";
            PreparedStatement prepare = connection.prepareStatement(sql);
            prepare.setString(1, nama);
            prepare.setString(2, nim);
            prepare.setString(3, prodi);
            
            int result = prepare.executeUpdate();
            if(result > 0){
                System.out.println("data berhasil dibuat!");
            } else{
                System.out.println("gagal membuat data");
            }
            
            prepare.close();
            connection.close();
        } catch(SQLException ex){
            ex.getMessage();
        }
    }
    
    private static void tampilkanDataAnggota(){
        try{
            Connection connnection = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM anggota";
            PreparedStatement preparedStatement = connnection.prepareStatement(sql);
            ResultSet resultset = preparedStatement.executeQuery();
            
            System.out.println("DATA ANGGOTA");
            while(resultset.next()){
                String nama = resultset.getString("nama");
                String nim = resultset.getString("nim");
                String prodi = resultset.getString("prodi");
                System.out.println(nama  + " - " + nim + " - " + prodi);
            }
            
            preparedStatement.close();
            connnection.close();
        } catch(SQLException ex){
            ex.getMessage();
        }
    }
}
