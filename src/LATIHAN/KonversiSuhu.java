/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author Rizky17
 */
import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float r,f,k;
        System.out.println("Masukkan nilai Celcius : ");
        float c= masukan.nextByte();
        System.out.println("Pilih konversi ke K,R,F :");
        String pilihan = masukan.next();
        switch (pilihan) {
        case "K" :
            
            System.out.println("Hasil : " + (k = c+273));
            break;
            case "R" :
            System.out.println("Hasil : " + (r = c*4/5));
            break;
            case "F" :
            System.out.println("Hasil : " + (k = c*9/5+32));
            break;
    }
    }
    
}
