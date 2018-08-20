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
public class Biodata {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in); 
       String nama,NIS,Tl,Tgl,Jk,alamat,motto;
      
        System.out.print("Biodata");
        System.out.println();
        System.out.print("Nama Lengkap  : ");
        nama = masukan.nextLine();
        System.out.print("NIS           : ");
        NIS = masukan.nextLine();
        System.out.print("Tempat Lahir  : ");
        Tl = masukan.nextLine();
        System.out.print("Tanggal Lahir : ");
        Tgl = masukan.nextLine();
        System.out.print("Jenis Kelamin : ");
        Jk = masukan.nextLine();
        System.out.print("Alamat di Malang : ");
        alamat = masukan.nextLine();
        System.out.print("Motto Hidup   : ");
        motto = masukan.nextLine();
        
    }
}
