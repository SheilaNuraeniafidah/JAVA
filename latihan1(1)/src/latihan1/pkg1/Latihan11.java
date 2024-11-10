/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1.pkg1;
import java.io.*;
/**
 *
 * @author user
 */
public class Latihan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //membuat file baru dengan nama input.txt
            File inputFile = new File("input.txt");
            inputFile.createNewFile();
            
            //menulis text pada file tsb
            FileWriter filewriter = new FileWriter(inputFile);
            filewriter.write("tugas latihan 1");
            filewriter.close();
            
            //membaca isi dari file dan menkonversi ke uppercase
            FileReader filereader = new FileReader(inputFile);
            StringBuilder stringbuilder = new StringBuilder();
            int karakter;
            
            while((karakter = filereader.read()) != -1){
                stringbuilder.append((char)karakter);
            }
            filereader.close();
            String upperCaseText = stringbuilder.toString().toUpperCase();
            
            //menulis text uppercase ke file baru dengan nama output.txt
            File outputFile = new File("output.txt");
            outputFile.createNewFile();
            FileWriter outputFileWriter = new FileWriter(outputFile);
            outputFileWriter.write(upperCaseText);
            outputFileWriter.close();
            
           
        } catch (IOException e){
            e.printStackTrace();
            }
    }
    
}
