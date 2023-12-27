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
public class Modul3_Latihan10 {
        public static void main(String[] args){
        System.out.println(" Nama : Aan Bayu Saputra");
        System.out.println(" NIM  : 32602000004");
        System.out.println("=====================");

        String A = "Laboratorium Komputasi dan Sistem Cerdas";
        
        String penggal1 = A.substring(10);
        String penggal2 = A.substring(20);
        String penggal3 = A.substring(10,30);
        String penggal4 = A.substring(20,25);
        
        System.out.println("Kalimat asli: "+A);
        System.out.println("Pemenggalan mula karakter ke-10: "+penggal1);
        System.out.println("Pemenggalan mula karakter ke-20: "+penggal2);
        System.out.println("Pemenggalan mula karakter ke-10 sampai ke-30: "+penggal2);
        System.out.println("Pemenggalan mula karakter ke-20 sampai ke-25: "+penggal4);
    }

    
}
