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
public class Beasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.println("Masukan nilai bahasa inggris : ");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85 )&&(BahasaInggris > 80))
            System.out.println("siswa dapat beasiswa");
        else
            System.out.println("siswa tidak dapat beasiswa");
    }
}
