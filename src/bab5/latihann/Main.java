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
public class Main {
    public static void main(String[] args){
        Mahasiswa M = new Mahasiswa();
        // Tampilkan Nama dan NIM
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004     =====");
        System.out.println("======================================\n");
        M.InfoMahasiswa(60, 18, "Kelas A Angkatan 2008");
        M.InfoMahasiswa(1000, 400, 25, 2008);
    }

    
}
