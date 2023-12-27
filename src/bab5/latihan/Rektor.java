/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Rektor extends Dosen {
    private int Tahun_Mulai;
    private int Jabatan_Ke;

    // Inisialisasi
    public Rektor(String NamaX, String NIKX, String JurX, int ThnX, int KeX) {
        super(NamaX, NIKX, JurX);
        Tahun_Mulai = ThnX;
        Jabatan_Ke = KeX;
    }

    // Menampilkan Informasi
    public void viewRektor() {
        System.out.println("Tahun mulai jabatan    : " + Tahun_Mulai);
        System.out.println("Jabatan Rektor ke-     : " + Jabatan_Ke);
    }
}

