package modulpraktikumlanjutan;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Latihan3 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program Menjalankan 2 Nilai");
        System.out.println("Masukkan nilai a : ");
        a = masukkan.nextInt();
        System.out.println("Masukkan nilai b : ");
        b = masukkan.nextInt();
        System.out.println("Masukkan nilai c : ");
        c = masukkan.nextInt();
        System.out.println("");
        System.out.println("Jumlah a + b :"+(jumlah(a,b)));
        System.out.println("Jumlah b + c :"+(jumlah(b,c)));
        System.out.println("Jumlah a + c :"+(jumlah(a,c)));
    }

    private static int jumlah(int a, int b) {
        int hasil = a+b;
        return hasil;
    }
}
