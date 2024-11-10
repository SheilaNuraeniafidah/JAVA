/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak1.meet3;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Prak1Meet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File filenya = new File("text.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan nim anda : ");
        String nim = scan.nextLine();
        System.out.println("masukkan nilai anda : ");
        Double nilai = scan.nextDouble();
        try{
            PrintWriter writer = new PrintWriter(filenya);
            writer.println("nilai praktikum pemrograman");
            writer.printf("nim: %s \n", nim);
            writer.print(nilai);
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
//beda printwriter sama filewriter : method nya //
