/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;
import packinterface.*;
/**
 *
 * @author user
 */
public class balok extends class1 implements NewInterface1, NewInterface2{
    balok (double p, double l, double t){
        this.Panjang = p;
        this.Lebar = l;
        this.Tinggi = t;
    }
    @Override
    public void hasil() {
        System.out.println("Hasil luas permukaan balok adalah"+ this.area());
        System.out.println("Hasil volume balok adalah" + this.volume());
    }

    @Override
    public Double area() {
        return 2*((this.Panjang *this.Lebar)+ (this.Panjang * this.Tinggi) + (this.Lebar * this.Tinggi));
    }

    @Override
    public double volume() {
       return this.Panjang * this.Lebar * this.Tinggi;
    }
    
}
