/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2pesantiket;

import java.util.Scanner;

/**
 *
 * @author sheila
 */
//open-closed principle bagian extends abstrk karena menerapkan class abstrak dengan menambahkan ekstensi tanpa memodifikasi class abstract//
//interface segregated principle bagian implement karena hanya menerapkan interface yang hanya dibutuhkan tanpa memaksakan interface lain//
public class PaketLibur extends abstrk implements inproses, inoutput{
    private String namaClien;
    private String noHP;
    private String alamat;
    private int pilihpaket;
    private int pembayaran;
    private int kembali;
    private int hargatiket;
    Scanner input = new Scanner(System.in);

    @Override
    void daftarharga() {
        System.out.println("**********daftar paket liburan**********");
        System.out.println("1. paket a(bandung)     : 1.000.000 ");
        System.out.println("2. paket b (bali)       : 2.000.000 ");
        System.out.println("3. paket c (lombok)     : 3.000.000");
        System.out.println("4. paket d (raja ampat) : 4.000.000 ");
        System.out.print(" pilih paket : ");
        pilihpaket = input.nextInt();
    }

    void dataCustomer() {
        System.out.println("***********masukkan data anda***********");
        System.out.print("masukkan nama anda    : ");
        namaClien = input.nextLine();
        System.out.print("masukkan no hp anda   : ");
        noHP = input.nextLine();
        System.out.print("masukkan alamat anda  : ");
        alamat = input.nextLine();
        
    }
    @Override
    public void proses() {
        if (pilihpaket == 1){
            hargatiket = 1000000;
            System.out.println("paket liburan ke bandung ");
            System.out.println("harga tiket 1.000.000");
            System.out.println("***********pembayaran tiket**********");
            System.out.print("bayar : " );
            pembayaran = input.nextInt();
            kembali = pembayaran - hargatiket;
            System.out.println("kembali : " + kembali);
            System.out.println("***********terima kasih**************");
            
        }
        else if (pilihpaket == 2){
            hargatiket = 2000000;
            System.out.println("paket liburan ke bali ");
            System.out.println("harga tiket 2.000.000");
            System.out.println("**********pembayaran tiket**********");
            System.out.print("bayar : " );
            pembayaran = input.nextInt();
            kembali = pembayaran - hargatiket;
            System.out.println("kembali : " + kembali);
            System.out.println("***********terima kasih*************");
        }
        else if (pilihpaket == 3 ){
            hargatiket = 3000000;
            System.out.println("paket liburan ke lombok ");
            System.out.println("harga tiket 3.000.000");
            System.out.println("**********pembayaran tiket**********");
            System.out.print("bayar : " );
            pembayaran = input.nextInt();
            kembali = pembayaran - hargatiket;
            System.out.println("kembali : " + kembali);
            System.out.println("************terima kasih************");
        }
        else if (pilihpaket == 4){
            hargatiket = 4000000;
            System.out.println("paket liburan ke raja mapat");
            System.out.println("harga tiket 4.000.000");
            System.out.println("**********pembayaran tiket**********");
            System.out.print("bayar : " );
            pembayaran = input.nextInt();
            kembali = pembayaran - hargatiket;
            System.out.println("kembali : " + kembali);
            System.out.println("***********terima kasih*************");
        }
        else{
            System.out.println("masukkan pilihan yang benar ! ");
        }
    }

    @Override
    public void output() {
        System.out.println("**********bukti transaksi**********");
        System.out.println("nama : " + namaClien);
        System.out.println("no hp : " + noHP);
        System.out.println("alamat : " + alamat);
        
    }
}
