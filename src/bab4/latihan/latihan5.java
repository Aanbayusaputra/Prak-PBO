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
class Karyawan{
String ID,nama,divisi; double gaji;
void cetakData() {
System.out.println("Data Karyawan ");
System.out.println("ID : " + ID);
System.out.println("Nama : " + nama);
System.out.println("Divisi : " + divisi);
System.out.println("Gaji : " + gaji);
}}
public class latihan5 {
   public static void main(String[] args) {
  System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004     =====");
        System.out.println("======================================\n");
     //instansiasi objek karyawan
    Karyawan karyawan001 = new Karyawan();
    //mengisi data pada objeck karyawan
    karyawan001.ID = "K001";
    karyawan001.nama = "Agus Ramadhan";
    karyawan001.divisi = "Keuangan";
    karyawan001.gaji = 185000.0;
    //memanggil method cetakData();
    karyawan001.cetakData();
}
}
