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
public class Dosen {
     protected String Nama;
    protected String NIK;
    protected String Jurusan;

    // Membuat Constructor
    public Dosen(String NamaX, String NIKX, String JurX) {
        Nama = NamaX;
        NIK = NIKX;
        Jurusan = JurX;
    }

    // Menampilkan Informasi
    public void view() {
        System.out.println("Nama    : " + Nama);
        System.out.println("NIK     : " + NIK);
        System.out.println("Jurusan : " + Jurusan);
    }
    
}
