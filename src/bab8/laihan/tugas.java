/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8.laihan;

/**
 *
 * @author Aan Bayu Saputra
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class tugas {
public static void main(String[] args) {
    int input;
    Scanner baca = new Scanner(System.in);
   System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");
    System.out.println("Memilih Opsi Program :");
    System.out.println("1. Membuat File");
    System.out.println("2. Mengisi File");
    System.out.println("3. Rename File");
    System.out.println("4. Menghapus File");
    System.out.print("Masukkan Opsi :");
    input = baca.nextInt();

    System.out.println();
    FileOutputStream foutput = null;
    if (input == 1) {
            System.out.println("Membuat file baru");
            System.out.println("=================");
            try {
                foutput = new FileOutputStream("E:/tugas8.txt");
                foutput = new FileOutputStream("E:/tugas8.dat");
                System.out.println("Pembuatan  file berhasil...");
            } catch (FileNotFoundException fnfe) {
                System.out.println("File tidak terbentuk.");
                return;
            }
    } else if(input == 2) {
        System.out.println("Mengisi data pada file");
        System.out.println("======================");
        String teks = "Assalamualaikum\n";
        try {
            foutput = new FileOutputStream("D:/programfiles/netbeans/praktikumPBO-sakinah/Bab8/tugas1/tugas8txt");
            for (int i = 0; i < teks.length(); i++)
            {
                foutput.write((int)teks.charAt(i));
            }
            System.out.println("File berhasil di isi data...");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }
    } else if(input == 3) {
        System.out.println("Mengganti Nama Pada File");
        System.out.println("========================");
        File coba = new File("E:/tugas8.txt");
        File baru = new File("E:/tugas8baru.txt");
        coba.renameTo(baru);
        System.out.println("file berhasil diganti nama...");
    } else if(input == 4) {
        System.out.println("Menghapus File");
        System.out.println("==============");
        File data = new File("E:/tugas8.dat");
        data.delete();
        System.out.println("file berhasil dihapus...");
    } else {
        System.out.println("\n Opsi tidak sesuai dengan pilihan di atas...");
            }
    }
}

