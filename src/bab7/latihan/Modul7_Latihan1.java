/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Modul7_Latihan1 {
      public static void main(String[] args) {
        System.out.println("Nama : Aan Bayu Saputra");
    System.out.println("NIM  : 32602000004" );
        int pembilang = 7;         int penyebut = 0; 
        try { 
            int hasil = pembilang / penyebut; 
// SALAH 
// tidak dieksekusi 
            System.out.println("Hasil = " + hasil); 
        } catch (Exception e) { 
            System.out.println("KESALAHAN: " 
                    + "Terdapat pembagian dengan nol");         } 
        System.out.println("Statemen setelah blok trycatch"); 
    } 

    
}
