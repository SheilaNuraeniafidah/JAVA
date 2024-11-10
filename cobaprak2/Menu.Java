package cobaprak2;
import java.util.*;


Public Class Menu(){
    System.out.println("*************kalkulator sederhana dua bilangan*************");
    Scanner input = new Scanner(System.in);

    void bilangan1(){
        System.out.print('masukkan bilangan : ');
        bil1 = input.nextint();
    }

    void operasi(){
        System.out.println("pilih + / - / x / : / % ");
        choose = input.nextchar();
    }

    void bilangan2(){
        System.out.print("masukkan bilangan : ");
        bil2  = input.nextint();
    }
}
//penerapan Single responsibility principle//