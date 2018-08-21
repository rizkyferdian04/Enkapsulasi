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
public class Latihan4 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int bil1, hasil;
        System.out.println("Masukkan suatu bilangan : ");
        bil1 = masukkan.nextInt();
        hasil = faktorial(bil1);
        System.out.println("Nilai faktorial "+bil1+" adalah "+hasil);
    }

    private static int faktorial(int bil) {
        if (bil==1)
        return 1;
        else 
        return (bil*faktorial(bil-1));
    }
}
