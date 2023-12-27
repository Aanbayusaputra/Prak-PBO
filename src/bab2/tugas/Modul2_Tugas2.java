/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Modul2_Tugas2 {
   public static void main (String[] args){
  boolean A = false, B = true;     // Nilai Boolean A dan B
        boolean AND     = A && B;               // A AND B
        boolean OR      = A || B;               // A OR B
        boolean NOT_A   = !A;                   // NOT A
        boolean NOT_B   = !B;                   // NOT A
       // Tampilkan Nama dan NIM
     System.out.println("=================================");
  System.out.println("===Nama=Aan BAyu Saputra===");
  System.out.println("===== NIM = 32602000004 ====");
  System.out.println("===============================\n");
        
  System.out.println("A = False ");
  System.out.println("A = True ");
  System.out.println("======= Operator Dasar Logika =======");
        
  // Tampilan Hasil
  System.out.println(A + " AND " + B + "  => " + AND);
  System.out.println(A + " OR  " + B + "  => " + OR);
  System.out.println("NOT " + A + "       => " + NOT_A);
System.out.println("NOT " + B + "      => " + NOT_B);
}

}
