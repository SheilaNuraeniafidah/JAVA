/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
/**
 *
 * @author sheila
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while(true){
           System.out.println("manajemen file ");
           System.out.println("1. buat file ");
           System.out.println("2. ubah nama file ");
           System.out.println("3. hapus file ");
           System.out.println("4. keluar");
           System.out.print("masukkan perintah : ");
           int choice = scanner.nextInt();
           scanner.nextLine(); //baris baru
           switch(choice){
                case 1:
                   createFile(scanner);
                   break;
                case 2:
                    renameFile(scanner);
                    break;
                case 3:
                    deleteFile(scanner);
                    break;
                case 4:
                    System.out.println("sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("masukkan pilihan yang benar");
           }
           System.out.println("");
       }
    }
    public static void createFile(Scanner scanner){
        System.out.print("buat nama file : ");
        String filename = scanner.nextLine();
        try{
            File file = new File(filename);
            if(file.createNewFile()){
                System.out.print("isi file : ");
                String isi = scanner.nextLine();
                PrintWriter write = new PrintWriter(file);
                write.print(isi);
                write.close();
                System.out.println("file berhasil dibuat");
            } else{
                System.out.println("file sudah ada");
            }
        } catch(IOException e){
            System.out.println("terjadi error ketika membuat file");
        }
    }
    public static void renameFile(Scanner scanner){
        System.out.print("nama file yang akan diubah : ");
        String currentFilename = scanner.nextLine();
        File currentFile = new File(currentFilename);
        if(!currentFile.exists()){
            System.out.println("file tidak tersedia");
            return;
        }
        System.out.print("nama file yang baru : ");
        String newFilename = scanner.nextLine();
        File newFile = new File(newFilename);
        if(currentFile.renameTo(newFile)){
            System.out.println("nama file berhasil diubah");
        } else{
            System.out.println("tidak bisa mengubah nama file");
        }
    }
    public static void deleteFile(Scanner scanner){
        System.out.print(" nama file yang akan dihapus: ");
        String filename = scanner.nextLine();
        File file = new File(filename);
        if (file.exists()){
            if(file.delete()){
                System.out.println("file berhasil dihapus");
            } else{
                System.out.println("tidak bisa menghapus file");
            }
        } else{
            System.out.println("file tidak tersedia");
        }
    }
}
