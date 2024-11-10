/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banguntigadimensi;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BangunTigaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nilai jari jari : ");
        double radius = input.nextInt();
        
        Bola A = new Bola(radius);
        A.printResult();
        
        System.out.print("Masukan nilai panjang : ");
        double Panjang = input.nextInt();
        
        System.out.print("Masukan nilai lebar : ");
        double Lebar = input.nextInt();
        
        System.out.print("Masukan nilai tinggi : ");
        double Tinggi = input.nextInt();
        
        Balok B = new Balok (Panjang, Lebar, Tinggi);
        B.printResult();
        
        System.out.print("Masukan nilai tinggi prisma : ");
        double TinggiPrisma = input.nextInt();

        System.out.print("Masukan nilai lebar : ");
        double LebarPrisma = input.nextInt();

        System.out.print("Masukan nilai tinggi segitiga : ");
        double TinggiSegi3 = input.nextInt();
        
        Prisma C = new Prisma  (TinggiPrisma, LebarPrisma, TinggiSegi3);
        C.printResult();
    }
    
}
