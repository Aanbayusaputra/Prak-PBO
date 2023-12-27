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
    String ID, nama, divisi;
    double gaji;

    // Constructor kelas Karyawan
    Karyawan(String kode, String Nama, String Div, double Gaji) {
        ID = kode;
        nama = Nama;
        divisi = Div;
        gaji = Gaji;
    }

    void cetakData() {
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004 =====");
        System.out.println("======================================\n");
        System.out.println("Data Karyawan :");
        System.out.println("ID : " + ID);
        System.out.println("Nama : " + nama);
        System.out.println("Divisi : " + divisi);
        System.out.println("Gaji : " + gaji);
    }

    double hitungSumbanganZakat() {
        double zakat = gaji * 0.025;
        return zakat;
    }
}

public class Latihan9 {
    public static void main(String[] args) {
        Karyawan karyawan001 = new Karyawan("k005", "Bella", "HRD", 2150000);
        karyawan001.cetakData();
    }
}