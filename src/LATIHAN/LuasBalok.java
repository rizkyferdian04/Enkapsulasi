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
public class LuasBalok {
    public static void main(String[] args) {
        int p=5;
        int l = 10;
        int t = 5;
        Scanner masukan = new Scanner(System.in);
        System.out.println("nilai panjang balok " +p);
        p = masukan.nextInt();
        System.out.println("nilai lebar balok " +l);
        System.out.println("nilai tinggi balok " +t);
        System.out.println(" ===============================");
        System.out.println("Menghitung luas permukaan balok");
        System.out.println(" ===============================");
        System.out.println("Luas permukaan balok = " +((2*p*l)+(2*p*t)+(2*l*t)));

    }
}
