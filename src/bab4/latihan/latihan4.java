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
public class latihan4 {
    public static void main(String[] args){
        /* Instansiasi 2 objek referensi yang mengacu pada karyawan */
        Karyawan Karyawan001 = new Karyawan();
        Karyawan Karyawan002 = Karyawan001;
        // Mengisi data Objek Karyawan melalui objek referensi 1
        Karyawan001.Nama = "Mischella";
        Karyawan001.Divisi = "HRD";
        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004     =====");
        System.out.println("======================================\n");
        // Mencetak data objek karyawan yang diacukan 2 objek referensi
        System.out.println("Data Karyawan001");
        System.out.println("Nama    : " + Karyawan001.Nama);
        System.out.println("Divisi  : " + Karyawan001.Divisi);
        System.out.println(" ");
        System.out.println("Data Karyawan002");
        System.out.println("Nama    : " + Karyawan002.Nama);
        System.out.println("Divisi  : " + Karyawan002.Divisi);
        // Memindahkan objek referensi ke-2 untuk mengacu objek baru
        Karyawan002 = new Karyawan();
        Karyawan002.Nama = "Yahya Al-Mahandiz";
        Karyawan002.Divisi = "Produksi";
        // Mencetak data objek perubahan referensi
        System.out.println(" ");
        System.out.println("Setelah Perubahan Referensi");
        System.out.println(" ");
        System.out.println("Data Karyawan001");
        System.out.println("Nama    : " + Karyawan001.Nama);
        System.out.println("Divisi  : " + Karyawan001.Divisi);
        System.out.println(" ");
         System.out.println("Data Karyawan002");
        System.out.println("Nama    : " + Karyawan002.Nama);
        System.out.println("Divisi  : " + Karyawan002.Divisi);
    }

    
}
