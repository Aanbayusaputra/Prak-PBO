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
public class Latihan14 {
     public static void main(String[] args) {
     RobotStatic.nama = "Gathotkaca";
     RobotStatic.asalNegara = "Indonesia";
     RobotStatic.test();   }}
     class RobotStatic {
    static String nama;
    static String asalNegara;
    static void test() {
    System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 32602000004      =====");
        System.out.println("======================================\n");
    System.out.println("Hello..");
    System.out.println("Saya adalah robot " + nama);
    System.out.println("Saya berasal dari " + asalNegara);
    }
}
