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
public class illegal_access{
    
      public static void cobaEksepsi(int pembilang, int penyebut) {
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil bagi: " + hasil);
            int[] arr = {1, 2, 3, 4, 5};
            // array dengan 5 elemen
            arr[4] = 23; // mengakses indeks ke-4 (indeks dimulai dari 0)
        } catch (ArithmeticException eksepsi1) {
            System.out.println("Terdapat pembagian dengan 0");
        } catch (ArrayIndexOutOfBoundsException eksepsi2) {
            System.out.println("Indeks di luar rentang");
        } finally {
            System.out.println("Ini adalah statemen dalam blok finally");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nama : Aan Bayu Saputra");
        System.out.println("NIM  : 32602000004");
        cobaEksepsi(4, 0); // menimbulkan ArithmeticException
        System.out.println();
        cobaEksepsi(12, 4); // menimbulkan ArrayIndexOutOfBoundsException
    }
    
    
}
