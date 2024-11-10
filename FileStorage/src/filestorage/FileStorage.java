/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filestorage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class FileStorage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File filenya = new File("plaintext.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter(filenya);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("ini adalah judul");
            bw.newLine();
            bw.write("ini adalah paragraf 1 \n");
            bw.write("ini adalah paragraf 2 \n");
            bw.close();
            System.out.println("selesai menulis file");
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
