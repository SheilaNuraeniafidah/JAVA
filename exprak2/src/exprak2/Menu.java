/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exprak2;

import java.util.Scanner;

/**
 *
 * @author sheila
 */
public class Menu extends abstrk{
    Scanner input = new Scanner(System.in);
    
    //Single responsibility principle//
    public void bilangan1(){
        System.out.println("**********kalkulator sederhana dua bilangan**********");
        System.out.print("masukkan bilangan : ");     
        bil1 = input.nextDouble();
    }
    
    public void bilangan2(){
        System.out.print("masukkan bilangan : ");
        bil2 = input.nextDouble();
    }
    
    public void pilihan(){
        System.out.print("pilih operasi /1.+/2.-/3.:/4.x/5.%/  : ");
        Scanner scr = new Scanner(System.in);       
        int pilih = scr.nextInt();
        
        if (pilih == 1){
            penjumlahan a = new penjumlahan();
            a.inoperasi(bil1, bil2);
            a.hasil();
        }
        else if (pilih == 2){
            pengurangan b = new pengurangan();
            b.inoperasi(bil1, bil2);
            b.hasil();
        }
        else if (pilih == 3){
            perkalian c = new perkalian();
            c.inoperasi(bil1, bil2);
            c.hasil();
        }
        else if (pilih == 4){
            pembagian d = new pembagian();
            d.inoperasi(bil1, bil2);
            d.hasil();
        }
        else if (pilih == 5){
            modulo e = new modulo();
            e.inoperasi(bil1, bil2);
            e.hasil();
        }
        else{
            System.out.println("invalid");
        }
    }    
}
