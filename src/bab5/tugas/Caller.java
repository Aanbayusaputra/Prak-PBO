/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Caller {
     public static void main(String[] args) {
        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");

        Darat darat = new Darat("Darat", "100 km/jam", "20 ltr", "2010", "Merah", "50 kg", "100 kg", "150 kg");
        Laut laut = new Laut("Laut", "75 km/jam", "20 ltr", "2008", "Hijau", "100 kg", "200 kg", "300 kg");

        System.out.println();
        darat.view();
        darat.viewDarat();
        System.out.println();
        laut.view();
        laut.viewLaut();
    }
    
}
