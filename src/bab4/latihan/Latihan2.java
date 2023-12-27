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
public class Latihan2 {
     public static void main(String[] args){
        // Mmebuat Objek Karyawan dengan nama Aurel
        Karyawan Aurel = new Karyawan();
        // Mmebuat Objek Karyawan dengan nama Dhennis
        Karyawan Dhennis = new Karyawan();
        // Mengisi nilai ke dalam data-data Objek Karyawan 1
        Aurel.ID = "K001";
        Aurel.Nama = "Aurel Dian";
        Aurel.Divisi = "Marketing";
        Aurel.Gaji = 2500000;
        // Mengisi nilai ke dalam data-data Objek Karyawan 2
        Dhennis.ID = "K002";
        Dhennis.Nama = "Muhammad Dhennis";
        Dhennis.Divisi = "Keuangan";
        Dhennis.Gaji = 2250000;
        // Tampilkan Nama dan NIM
        System.out.println("======================================");
 System.out.println("===== Nama   = Aan Bayu Saputra =====");
 System.out.println("===== NIM   = 32602000004     =====");
        System.out.println("======================================\n");
        //Mencetak data-data Object Karyawan ke-1
        System.out.println("Data Karyawan Pertama");
        System.out.println("ID      : " + Aurel.ID);
        System.out.println("Nama    : " + Aurel.Nama);
        System.out.println("Divisi  : " + Aurel.Divisi);
        System.out.println("Gaji    : " + Aurel.Gaji);
        //Mencetak data-data Object Karyawan ke-2
        System.out.println("Data Karyawan  Kedua");
        System.out.println("ID      : " + Dhennis.ID);
        System.out.println("Nama    : " + Dhennis.Nama);
        System.out.println("Divisi  : " + Dhennis.Divisi);
        System.out.println("Gaji    : " + Dhennis.Gaji);
    }
}
