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

import java.util.Scanner;

public class Modul2_Tugas1 {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float A, B;
        int Pilih;
        double Penjumlahan, Pengurangan, Perkalian, Pembagian, Modulo;

        // Tampilkan Nama dan NIM
        System.out.println("=================================");
        System.out.println("===== Nama=Aan Bayu Saputra ====");
        System.out.println("===== NIM=32602000004 =====");
        System.out.println("===============================\n");

        System.out.println("==== Program Kalkulator Sederhana ====");
        // Membuat Menu Pilihan
        System.out.print("Masukkan Angka Pertama  : ");
        A = in.nextFloat();
        System.out.print("Masukkan Angka Kedua    : ");
        B = in.nextFloat();
        System.out.println("Pilih Operasi : ");
        System.out.println(" 1. Penjumlahan ");
        System.out.println(" 2. Pengurangan ");
        System.out.println(" 3. Perkalian ");
        System.out.println(" 4. Pembagian ");
        System.out.println(" 5. Modulo");
        System.out.print("Masukkan Pilihan : ");
        Pilih = in.nextInt();

        // Pemilihan Jenis Operator
        switch (Pilih) {
            case 1:
                Penjumlahan = A + B;
                System.out.println("Hasil Penjumlahan: " + Penjumlahan);
                break;
            case 2:
                Pengurangan = A - B;
                System.out.println("Hasil Pengurangan: " + Pengurangan);
                break;
            case 3:
                Perkalian = A * B;
                System.out.println("Hasil Perkalian: " + Perkalian);
                break;
            case 4:
                Pembagian = A / B;
                System.out.println("Hasil Pembagian: " + Pembagian);
                break;
            case 5:
                Modulo = A % B;
                System.out.println("Hasil Modulo: " + Modulo);
                break;
            default:
                System.out.println("Tidak ada dalam menu pilihan");
                break;
        }
    }
    }
