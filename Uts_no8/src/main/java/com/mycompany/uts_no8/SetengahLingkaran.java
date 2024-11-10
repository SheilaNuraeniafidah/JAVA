/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no8;

/**
 *
 * @author user
 */
public class SetengahLingkaran extends AbstrakClass implements InterfaceVolum {

    @Override
    public double tinggi() {
        return 0;
    }

    @Override
    public double jari() {
        return 5;
    }
    
    @Override
    public double volume(){
        return 1/2 * 4/3 * Math.PI * this.jari() ;
    }
    
}
