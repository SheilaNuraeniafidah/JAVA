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
public class Bola extends abstrack implements LuasPermukaan, volume {
    
    Bola (double r){
        this.radius = r;
    }
    
    @Override
    public double luasPermukaan() {
       return 4* Math.PI* this.radius*this.radius;
    }

    @Override
    public double volume() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 4/3*Math.PI*this.radius*this.radius*this.radius;
    }

    @Override
    public void printResult() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Hasil luas perumkaan bola adalah " + this.luasPermukaan());
        System.out.println("Hasil volume bola adalah " + this.volume());
    }
    
    
}
