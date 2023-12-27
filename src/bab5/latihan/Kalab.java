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
public class Kalab extends Dosen {
    private String Laboratorium;

    // Inisialisasi
    public Kalab(String NamaX, String NIKX, String JurX, String LabX) {
        super(NamaX, NIKX, JurX);
        Laboratorium = LabX;
    }

    // Menampilkan Informasi
    public void viewKalab() {
        System.out.println("Laboratorium : " + Laboratorium);
    }
}