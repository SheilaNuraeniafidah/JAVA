/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan bilangan 1 : ");
        double bil1 = input.nextInt();
        System.out.print("masukkan bilangan 2 : ");
        double bil2 = input.nextInt();
        
        Kalkulator a = new Kalkulator();
        a.pertambahan(bil1, bil2);
        a.pengurangan(bil1, bil2);
        
        pembagian b = new pembagian();
        b.tampil(bil1, bil2);
        
        perkalian c = new perkalian();
        c.tampil(bil1, bil2);
        
        
        System.out.println("hasil pertambahan : " + a.pertambahan(bil1, bil2));
        System.out.println("hasil pengurangan : " + a.pengurangan(bil1, bil2));
        System.out.println("hasil pembagian : " + b.tampil(bil1, bil2));
        System.out.println("hasil perkalian : " + c.tampil(bil1, bil2));
    }
    
}
