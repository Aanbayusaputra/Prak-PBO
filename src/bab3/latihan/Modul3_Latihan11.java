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
public class Modul3_Latihan11 {
    public static void main(String[] args){
        System.out.println(" Nama : Aan Bayu Saputra");
        System.out.println(" NIM  : 32602000004");
        System.out.println("=====================");

        String A = " Laboratorium Sistem Cerdas";
        
        String B = A.replace("a", "A");
        String C = A.replace("i", "u");
        String D = A.trim();
        
        System.out.println("Kalimat asli: "+A);
        System.out.println("Replace a dengan A: "+B);
        System.out.println("Replace i dengan u: "+C);
        System.out.println("Hilangkan spasi awal & akhir: "+D);
        
    }

    
}
