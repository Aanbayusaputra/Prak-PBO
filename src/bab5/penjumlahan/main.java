/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5.penjumlahan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class main {
    public static void main(String[] args) {
        int x1 = 1, x2 = 15;
        double y1 = 10.5, y2 = 15.8;
        Penjumlahan p = new Penjumlahan();

        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");

        System.out.println(x1 + " + " + x2 + " = " + p.Jumlah(x1, x2));
        System.out.println(y1 + " + " + y2 + " = " + p.Jumlah(y1, y2));
    }
}
