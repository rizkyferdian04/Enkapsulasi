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
public class IfELse {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukan nilai Web : ");
        int nilai = masukan.nextInt();
        if (nilai > 100)
            System.out.println("Error");
                else if (nilai >= 90)
                    System.out.println("Nilai A");
                else if (nilai >= 75)
                    System.out.println("Nilai B");
                else if (nilai >=50)
                    System.out.println("Nilai c");
                else if (nilai >= 35)
                    System.out.println("Nilai D");
                else
                    System.out.println("Nilai E");
    }
}
