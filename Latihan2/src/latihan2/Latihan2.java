/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author user
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // membaca gambar asli
            File originalPicture = new File("gambar asli.jpg");
            FileInputStream fis = new FileInputStream(originalPicture);
            // membuat file baru untuk menduplikasi gambar
            File duplicatedPicture = new File("gambar duplikat.jpg");
            FileOutputStream fos = new FileOutputStream(duplicatedPicture);
            // mencopy gambar dari file gambar asli.jpg ke file gambar duplkat
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            // menutup streams
            fis.close();
            fos.close();
            // mencetak pesan hasil console
            System.out.println("The picture has been duplicated.");
        } catch (IOException e) {
            // mencetak pesan error dari hasil console
            System.err.println("An error occurred while duplicating the picture.");
            e.printStackTrace();
        }
    }    
}
