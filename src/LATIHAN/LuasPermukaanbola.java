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
public class LuasPermukaanbola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        float r ;
        float hasil ;
        
            System.out.println("Jari jari : ");
            r = masukan.nextFloat();
            hasil = 4*22*r*r/7;
            System.out.println("Luas Permukaan bola : " + hasil);
            
        
    
        
    }
}
