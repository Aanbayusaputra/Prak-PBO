/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5.latihann;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Mahasiswa {
        // Informasi Tentang Mahasiswa Kelas A
    public void InfoMahasiswa(int Laki2, int Perempuan, String Kelas){
        int Jumlah = Laki2 + Perempuan;
        System.out.println(Kelas + " , Jumlah Mahasiswa = " + Jumlah);
    }
    // Informasi Tentang Mahasiswa sampai tahun 2008
    public void InfoMahasiswa(int MhsLama, int MhsBaru, int MhsCuti, int Angkatan){
        int Jumlah = MhsLama + MhsBaru + MhsCuti;
        System.out.println("Sampai Tahun " + Angkatan + ", Jumlah Mahasiswa = " + Jumlah);
    }

}
