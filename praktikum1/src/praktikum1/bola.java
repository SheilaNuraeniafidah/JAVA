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
public class bola extends class1 implements NewInterface1, NewInterface2{
    bola (double r){
        this.radius = r;
    }
    @Override
    public void hasil() {
        System.out.println("Hasil luas permukaan bola adalah " + this.area());
        System.out.println("Hasil volume bola adalah " + this.volume());
    }

    @Override
    public Double area() {
        return 4* Math.PI* this.radius*this.radius;
    }

    @Override
    public double volume() {
        return 4/3*Math.PI*this.radius*this.radius*this.radius;
    }
    
    
}
