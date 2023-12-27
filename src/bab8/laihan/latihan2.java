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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan2{
    public static void main(String[] args) throws IOException {
       System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");
        System.out.print("Masukkan Nama Anda : "); String namaInput;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); 
        namaInput = br.readLine();
        System.out.println("Halo "+ namaInput + "...");
        System.out.println("Semoga Anda Sukses Selalu..");
    }    
}


