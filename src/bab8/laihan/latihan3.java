/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8.laihan;

/**
 *
 * @author Aan Bayu Saputra
 */

import java.io.*;
public class latihan3 {
    public static void main(String[] args) throws IOException {
    String temp;
   System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");
    System.out.print("Masukkan sebuah bilangan bulat :");
    int bilanganInput = 0; InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    temp = br.readLine();
    try{
        bilanganInput = Integer.parseInt(temp);
    }catch (NumberFormatException nfe){
        System.out.println("Nilai yang dimasukkan " + "bukan bilangan bulat");
        System.exit(1);
    }
    System.out.println("Bilangan yang anda masukkan adalah " + bilanganInput);
}    
}

