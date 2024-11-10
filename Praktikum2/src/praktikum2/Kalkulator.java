/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

/**
 *
 * @author Sheila
 */

//single responsibility principle//
class Kalkulator {
    public double pertambahan(double bil1, double bil2){
        return bil1 + bil2;
    }
    public double pengurangan(double bil1, double bil2){
        return bil1 - bil2;
    }
    
//open-closed principle//
class Perkalian implements Operasi{

        @Override
        public double tampil(double bil1, double bil2) {
            return bil1*bil2;
        }
   
 }

 //interface segregation principle//
class Pembagian extends bilangan implements Operasi {

    @Override
    public double tampil(double bil1, double bil2) {
        if (bil2 == 0){
                System.out.println("bilangan invalid");
            }
            return bil1 / bil2;
        } 
}
}

//kelas Kalkulator bertanggungjawab untuk melakukan operasi matematika dasar seperti pertambahan dan pengurangan//
//prinsip SRP diikuti dengan memisahkan tanggung jawan kelas-kelas yang berbeda sesuai dengan fungsinya//
//prinsip OCP diikuti dengan memungkinkan penambahan operasi matematika baru tanpa mengubah kelas-kelas yang sudah ada//
//prinsip ISP untuk memisahkan beberapa method yang hanya diperlukan//
//tujuan dari program aplikasi ini adalah untuk menghitung 2 bilangan sederhana atau istilahnya kalkulator dengan dua bilangan saja yang dioperasikan menjadi perkalian pengurangan, penambahan, dan pembagian//