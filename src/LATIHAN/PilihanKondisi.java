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
public class PilihanKondisi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Silahkan pilih angka 1-3 :");
        int bil = masukan.nextInt();
        switch (bil){
            case 1 : System.out.println("satu");
            switch (bil){
            case 2 : System.out.println("dua");
            switch (bil){
            case 3 : System.out.println("tiga");
        }
    }
   
        }
    }
}
