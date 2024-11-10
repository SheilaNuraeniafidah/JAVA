/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nilai jari jari : ");
        double radius = input.nextInt();
        
        bola A = new bola(radius);
        A.hasil();
        
        System.out.print("Masukan nilai panjang : ");
        double Panjang = input.nextInt();
        
        System.out.print("Masukan nilai lebar : ");
        double Lebar = input.nextInt();
        
        System.out.print("Masukan nilai tinggi : ");
        double Tinggi = input.nextInt();
        
        balok B = new balok (Panjang, Lebar, Tinggi);
        B.hasil();
        
        System.out.print("Masukan nilai tinggi prisma : ");
        double TinggiPrisma = input.nextInt();

        System.out.print("Masukan nilai lebar : ");
        double LebarPrisma = input.nextInt();

        System.out.print("Masukan nilai tinggi segitiga : ");
        double TinggiSegi3 = input.nextInt();
        
        prisma C = new prisma  (TinggiPrisma, LebarPrisma, TinggiSegi3);
        C.hasil();
    } 
    
    
}
