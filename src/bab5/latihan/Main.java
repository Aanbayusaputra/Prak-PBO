/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Main {
    public static void main(String[] args) {
        Rektor Rek = new Rektor("Andi", "885230202", "Informatika", 2006, 2);
        Dekan Dek = new Dekan("Ahmad", "995230101", "T. Kimia", "TI");
        Kalab Lab = new Kalab("Indah", "035230302", "Informatika", "KSC");

        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004    =====");
        System.out.println("======================================\n");

        Rek.view();
        Rek.viewRektor();

        Dek.view();
        Dek.viewDekan();

        Lab.view();
        Lab.viewKalab();
    }
}