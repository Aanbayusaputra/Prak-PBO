/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab6.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class main {
    public static void main(String[] args){
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");
        Kendaraan P;
        pesawat psw = new pesawat ("Boeing 707","Pesawat Komersial");
        mobil mbil1 = new mobil ("Toyota Kijang","Jeep");
        mobil mbil2 = new mobil ("Suzuki Baleno","Sedan");
        mobil mbil3 = new mobil ("VW Combi");
        kapal kpl   = new kapal ("Queen Mary 2","Kapal Pesiar");
        
        P = psw;
        P.informasi();
        P = mbil1;
        P.informasi();
        P = mbil2;
        P.informasi();
        P = mbil3;
        P.informasi();
        P = kpl;
        P.informasi();
        
    }
}

