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

class Karyawan {
    String ID, Nama, Divisi;
    double Gaji;

    void cetakData() {
        System.out.println("Data Karyawan");
        System.out.println("ID      : " + ID);
        System.out.println("Nama    : " + Nama);
        System.out.println("Divisi  : " + Divisi);
        System.out.println("Gaji    : " + Gaji);
    }

    double hitungSumbanganZakat() {
        double zakat = Gaji * 0.025;
        return zakat;
    }
}

public class latihan6 {
    public static void main(String[] args) {
        // Instansi Objek Karyawan
        Karyawan karyawan001 = new Karyawan();

        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004=====");
        System.out.println("======================================\n");

        // Mengisi data pada objek karyawan
        karyawan001.ID = "K001";
        karyawan001.Nama = "Agus Ramadhan";
        karyawan001.Divisi = "Keuangan";
        karyawan001.Gaji = 1850000;

        // Memanggil method cetakData();
        karyawan001.cetakData();

        // Memanggil method hitungSumbanganZakat();
        double sumbanganZakat = karyawan001.hitungSumbanganZakat();
        System.out.println("Sumbangan Zakat : " + sumbanganZakat);
    }
}