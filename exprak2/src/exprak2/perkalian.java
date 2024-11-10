/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exprak2;

/**
 *
 * @author sheila
 */
//open closed principle karena mengextends dari class menu//
//interface segregated principle karena mengimplementasi interface yang dibutuhkan//
public class perkalian extends Menu implements inoperasi, inhasil{
    
    @Override
    public double inoperasi(double bil1, double bil2) {
        return this.bil1 * this.bil2;
    }
    @Override
    public void hasil() {
        System.out.println("hasil dari " + this.bil1 + " x " + this.bil2 + " = " + this.inoperasi(bil1, bil2));
    }
}
