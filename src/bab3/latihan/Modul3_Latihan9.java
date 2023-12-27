/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Modul3_Latihan9 {
    
    public static void main(String[] args) {
        System.out.println("Nama\t: Aan Bayu Saputra"); 
        System.out.println("NIM\t: 32601900004"); 
        System.out.println("=====================");
        
        String A, B, C;
        A = "Laboratorium ";
        B = "Komputasi ";
        C = "dan Sistem Cerdas";
       
        String kalimatAwal = A + B + C;
        System.out.println("Kalimat Awal : " + kalimatAwal);
        
        // Mengubah ke huruf besar
        String kalimatBesar = kalimatAwal.toUpperCase();
        System.out.println("Diubah ke huruf besar : " + kalimatBesar);
        
        // Mengubah ke huruf kecil
        String kalimatKecil = kalimatAwal.toLowerCase();
        System.out.println("Diubah ke huruf kecil : " + kalimatKecil);
    }

    
}
