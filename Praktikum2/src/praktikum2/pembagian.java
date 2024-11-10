/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

/**
 *
 * @author sheila
 */
public class pembagian extends bilangan implements Operasi {
    //interface segregation principle//

    @Override
    public double tampil(double bil1, double bil2) {
        if (bil2 == 0){
                System.out.println("bilangan invalid");
            }
            return bil1 / bil2;
        } 
}
