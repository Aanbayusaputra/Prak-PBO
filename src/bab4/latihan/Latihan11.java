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
public class Latihan11 {
    String ID, nama, divisi;
    double gaji;
//constructor pertama
    Latihan11(String ID, String nama) {
    this.ID = ID;
    this.nama = nama;
}
//constructor kedua
    Latihan11(String ID, String nama, String divisi,double gaji) {
        this.ID = ID;
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji;
}
    
    double hitungSumbanganZakat() {
        double zakat = gaji * 0.025;
        return zakat;  
}
    
    public static void main(String[] args) {
        
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004      =====");
        System.out.println("======================================\n");

        //instantiasi menggunakan constructor pertama
        Karyawan karyawan001 = new Karyawan("k006","Zaky");
        //instantiasi menggunakan constructor kedua
        Karyawan karyawan002 = new Karyawan("k007","Deva", "Keuangan", 2250000);
        karyawan001.cetakData();
        System.out.println("");
        karyawan002.cetakData();
}
    private static class Karyawan {

        public Karyawan() {
        }
            String ID, nama, divisi;
            double gaji;
            private Karyawan(String k007, String deva, String keuangan, int i) 
        {
            this.ID = k007;
            this.nama = deva;
            this.divisi = keuangan;
            this.gaji =2250000 ;
        }

        private Karyawan(String k006, String zaky) {
         this.ID = k006;
         this.nama = zaky;
        }

        private void cetakData() {
          System.out.println("Data Karyawan :");
          System.out.println("ID : " + ID);
          System.out.println("Nama : " + nama);
          System.out.println("Divisi : " + divisi);
          System.out.println("Gaji : " + gaji);
        }
          
    }
}
  