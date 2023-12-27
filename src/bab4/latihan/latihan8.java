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
class Karyawaan{
    String ID, NAMA, DIVISI;
double GAJI;
//constructor kelas karyawan
 Karyawaan (){
ID = "k001";
NAMA = "Budi";
DIVISI = "Produksi";
GAJI = 1750000;}
void cetakData() {
System.out.println("Data Karyawan :");
System.out.println("ID : " + ID);
System.out.println("Nama : " + NAMA);
System.out.println("Divisi : " + DIVISI);
System.out.println("Gaji : " + GAJI);
}
double hitungSumbanganZakat() {
double zakat = GAJI * 0.025;
return zakat;}}
public class latihan8 {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004 =====");
        System.out.println("======================================\n");
        Karyawaan karyawaaaKaryawaan = new Karyawaan();
       karyawaaaKaryawaan.cetakData();  
         }
}
