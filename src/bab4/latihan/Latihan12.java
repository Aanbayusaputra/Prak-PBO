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
class Mahasiswa {
    int nim;
    public String nama;
    private double ipk = -1; // Nilai default untuk menunjukkan belum diatur

    public void setIPK(double nilai) {
        // Validasi jika nilai IPK negatif
        if (nilai >= 0) {
            ipk = nilai;
        } else {
            System.out.println("Error: Nilai IPK tidak valid");
        }
    }

    public double getIPK() {
        return ipk;
    }
}

public class Latihan12 {
    public static void main(String[] args) {
        Mahasiswa yahya = new Mahasiswa();
        
        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004"
                + "     =====");
        System.out.println("======================================\n");

        // Set dan tampilkan NIM dan Nama
        yahya.nim = 1009;
        yahya.nama = "Yahya Al-Mahandiz";
        System.out.println("NIM   : " + yahya.nim);
        System.out.println("Nama  : " + yahya.nama);

        // Set dan tampilkan IPK
        yahya.setIPK(3.77);
        System.out.println("IPK   : " + yahya.getIPK());
    }
}
