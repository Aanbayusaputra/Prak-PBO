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
class Mahasiswa {
int nim;
public String nama;
double IPK;
public void setipk(double nilai) {
IPK = nilai;
}
public double getIPK() {
return IPK;
}}
public class Latihan13 {
    static int dataA = 10;
    static int dataB = 7;
    int dataC = 4;//data non-statik
    static void test() {
    int dataC = dataA + dataB;
        System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004      =====");
        System.out.println("======================================\n");
    System.out.println("dataA + dataB = " + dataC);
    //System.out.println("dataC = "+dataC);
    //SALAH, karena dataC non-statik
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test();
    }
}

