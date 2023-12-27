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
public class Latihan16 {
    public static void main(String[] args) {
        Notebook myNotebook = new Notebook();
myNotebook.cetakdata();    }}
 class Notebook {
private String merk = "Lenovo";
class SistemOperasi {
private String namaOS = "Windows 7";
public void cetakData() {
    System.out.println("Nama\t:Aan Bayu Saputra");
   System.out.println("Nim\t: 32602000004\n");
System.out.println("Merk notebook : " +
merk);
System.out.println("Sistem operasi : " +namaOS);}}
public void cetakdata() {
SistemOperasi OS = new SistemOperasi();
OS.cetakData();
    }
}
