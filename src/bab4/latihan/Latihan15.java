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
public class Latihan15 {
    public static void main(String[] args) {
      Pegawai Dhennis = new Pegawai();
Dhennis.nama = "Dhennis Al-MAhandiz";
System.out.println("Nama\t: Aan Bayu Saputra");
System.out.println("Nim\t: 32602000004\n");
System.out.println("Data Karyawan : ");
System.out.println("nama : " + Dhennis.nama);
System.out.println("Bonus lembur : " +
Dhennis.hitungBonusLembur(7));    }}
class Pegawai {
String nama;
final double bonusLembur = 50000;
double hitungBonusLembur(double jumlahLembur) {
return bonusLembur * jumlahLembur;
    }
}

