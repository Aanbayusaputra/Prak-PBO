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
}



public class Latihan1 {
    public static void main(String[] args) {
        Karyawan aurel = new Karyawan(); // disarankan menggunakan huruf kecil untuk nama variabel
        aurel.ID = "K001";
        aurel.Divisi = "Marketing";
        aurel.Nama = "Aurel Dian";
        aurel.Gaji = 2500000;

        System.out.println("Nama\t: Aan Bayu Saputra");
        System.out.println("Nim\t: 32602000004");
        System.out.println("Data Karyawan ");
        System.out.println("ID      : " + aurel.ID);
        System.out.println("Nama    : " + aurel.Nama);
        System.out.println("Divisi  : " + aurel.Divisi);
        System.out.println("Gaji    : " + aurel.Gaji);
        System.out.println("\n");
    }
}
