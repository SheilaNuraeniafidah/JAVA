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
public class Prisma extends abstrack implements LuasPermukaan, volume{
    
    public double TinggiPrisma;
    public double TinggiSegi3;
    
    public double luasSelimut(){
        return 3 *(this.TinggiPrisma * this.Lebar);
    }
    
    
    public double luasAlasPrisma(){
        return 2 * 1/2 * this.Lebar * this.TinggiSegi3;
    }
    
    Prisma (double tp, double lp, double ts) {
        this.TinggiPrisma = tp;
        this.Lebar = lp;
        this.TinggiSegi3 = ts;
    }
    
    @Override
    public double luasPermukaan() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.luasSelimut() + this.luasAlasPrisma();
    }

    @Override
    public double volume() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.luasAlasPrisma() * this.TinggiPrisma;
    }

    @Override
    public void printResult() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Hasil luas perumkaan prisma adalah " + this.luasPermukaan());
        System.out.println("Hasil volume prisma adalah " + this.volume());
    }
    
}
