/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Kendaraan {
    protected String nama;
    protected String kecepatan;
    protected String kapasitas_tangki;
    protected String tahun_keluar;
    protected String warna;
    protected String daya_angkut_barang;
    protected String daya_angkut_manusia;
    protected String total_daya_angkut;

    public Kendaraan(String namaX, String kecepatanX, String kapasitas_tangkiX, String tahun_keluarX, String warnaX, String daya_angkut_barangX, String daya_angkut_manusiaX, String total_daya_angkutX) {
        nama = namaX;
        kecepatan = kecepatanX;
        kapasitas_tangki = kapasitas_tangkiX;
        tahun_keluar = tahun_keluarX;
        warna = warnaX;
        daya_angkut_barang = daya_angkut_barangX;
        daya_angkut_manusia = daya_angkut_manusiaX;
        total_daya_angkut = total_daya_angkutX;
    }

    public void view() {
        System.out.println("Kendaraan " + nama);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Kapasitas Tangki : " + kapasitas_tangki);
        System.out.println("Tahun Keluar : " + tahun_keluar);
        System.out.println("Warna : " + warna);
        System.out.println("Daya Angkut Barang : " + daya_angkut_barang);
        System.out.println("Daya Angkut Manusia : " + daya_angkut_manusia);
        System.out.println("Total Daya Angkut : " + total_daya_angkut);
    }
}

class Darat extends Kendaraan {
    public Darat(String namaX, String kecepatanX, String kapasitas_tangkiX, String tahun_keluarX, String warnaX, String daya_angkut_barangX, String daya_angkut_manusiaX, String total_daya_angkutX) {
        super(namaX, kecepatanX, kapasitas_tangkiX, tahun_keluarX, warnaX, daya_angkut_barangX, daya_angkut_manusiaX, total_daya_angkutX);
    }

    public void viewDarat() {
        System.out.println();
    }
}

class Laut extends Kendaraan {
    public Laut(String namaX, String kecepatanX, String kapasitas_tangkiX, String tahun_keluarX, String warnaX, String daya_angkut_barangX, String daya_angkut_manusiaX, String total_daya_angkutX) {
        super(namaX, kecepatanX, kapasitas_tangkiX, tahun_keluarX, warnaX, daya_angkut_barangX, daya_angkut_manusiaX, total_daya_angkutX);
    }

    public void viewLaut() {
        System.out.println();
    }
    
}
