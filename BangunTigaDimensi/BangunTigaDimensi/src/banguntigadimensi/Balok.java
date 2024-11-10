/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banguntigadimensi;
import interfacedimensitiga.*;
/**
 *
 * @author asus
 */
public class Balok extends abstrack implements LuasPermukaan, volume{
    
    Balok (double p, double l, double t){
        this.Panjang = p;
        this.Lebar = l;
        this.Tinggi = t;
    }
    
    @Override
    public double luasPermukaan() {
        //row new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 2*((this.Panjang *this.Lebar)+ (this.Panjang * this.Tinggi) + (this.Lebar * this.Tinggi));
    }

    @Override
    public double volume() {
       //hrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return this.Panjang * this.Lebar * this.Tinggi;
    }

    @Override
    public void printResult() {
       //hrow new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Hasil luas perumkaan balok adalah"+ this.luasPermukaan());
        System.out.println("Hasil volume balok adalah" + this.volume());
    }
    
}
