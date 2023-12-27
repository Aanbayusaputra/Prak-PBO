/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
class Pembagian {
   // Method dengan dua parameter bertipe int
    int bagi(int a, int b){
        return a / b;
    }
    // Method dengan dua parameter bertipe double
    double bagi(double a, double b){
        return a / b;
    }
}  

public class latihan10 {
    public static void main(String[] args){
    Pembagian b = new Pembagian();
    int x = b.bagi(10, 4);
    double y = b.bagi(10.0, 4.0);
   // Tampilkan Nama dan NIM
    System.out.println("======================================");
    System.out.println("===== Nama   = Aan Bayu Saputra =====");
    System.out.println("===== NIM    = 32602000004      =====");
    System.out.println("======================================\n");
    System.out.println("Hasil bagi tipe int     = " + x);
    System.out.println("Hasil bagi tipe double  = " + y);
    }

}
