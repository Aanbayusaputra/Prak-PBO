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
public class Dekan extends Dosen {
    private String Fakultas;

    // Inisialisasi
    public Dekan(String NamaX, String NIKX, String JurX, String FakX) {
        super(NamaX, NIKX, JurX);
        Fakultas = FakX;
    }

    // Menampilkan Informasi
    public void viewDekan() {
        System.out.println("Fakultas : " + Fakultas);
    }
    
}
