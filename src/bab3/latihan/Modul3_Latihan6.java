/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
import java.util.Random;

public class Modul3_Latihan6 {
       public static void main(String[] args){
        System.out.println(" Nama : Aan Bayu Saputra");
        System.out.println(" NIM  : 32602000004");
        String A = "Laboratoriumm Komputasi dan Sistem cerdas";
        Random rand = new Random();
        for (int i=1; i<=10; i++)
        {
            int ke = rand.nextInt(A.length());
            System.out.println("Karakter ke-"+ke+" = "+A.charAt(ke));
        }
    }

}
