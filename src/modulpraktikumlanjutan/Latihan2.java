/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulpraktikumlanjutan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do{
            System.out.println("\nMENU LUAS BAGUN\n");
            System.out.println("1. Menghitung Luas Persegi ");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.println("Masukkan Pilihan Anda : ");
            pilihan = masukan.nextInt();
        switch(pilihan){
            case 1 : luaspersegi();break;
            case 2 : luaspersegipanjang();break;
        }
        }while(pilihan != 3);
    }

    private static void luaspersegi() {
        Scanner masukan = new Scanner(System.in);
        float sisi, luas;
        System.out.println("Masukkan nilai sisi : ");
        sisi = masukan.nextFloat();
        luas = sisi * sisi;
        System.out.println("Luas Persegi adalah: "+luas);
    }

    private static void luaspersegipanjang() {
        Scanner masukan = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.println("Masukkan nilai panjang : ");
        panjang = masukan.nextFloat();
        System.out.println("Masukkan nilai lebar : ");
        lebar = masukan.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah: "+luas);
    }
}
