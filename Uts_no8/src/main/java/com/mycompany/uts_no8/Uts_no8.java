/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_no8;

/**
 *
 * @author user
 */
public class Uts_no8 {

    public static void main(String[] args) {
        Kerucut a = new Kerucut();
        a.volume();
        
        Tabung b = new Tabung();
        b.volume();
        
        SetengahLingkaran c = new SetengahLingkaran();
        c.volume();
        
        System.out.println("volume total \t: " + a.volume() + b.volume() + c.volume());
    }       
}
