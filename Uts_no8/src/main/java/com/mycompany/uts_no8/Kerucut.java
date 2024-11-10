/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no8;

/**
 *
 * @author user
 */
public class Kerucut extends AbstrakClass implements InterfaceVolum{

    @Override
    public double tinggi() {
        return 12;
    }

    @Override
    public double jari() {
        return 5;
    }
    @Override
    public double volume(){
       return 1/3 * Math.PI * this.jari() * this.jari() * this.tinggi();
    }
    
}
