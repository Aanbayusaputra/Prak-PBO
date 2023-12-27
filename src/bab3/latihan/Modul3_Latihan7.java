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
public class Modul3_Latihan7 {
    public static void main(String[] args){
        String A = "Laboratorium Komputasi dan Sistem cerdas";
        
       System.out.println("Nama\t: Aan Bayu Saputra"); 
       System.out.println("NIM\t: 32601900004"); 
       System.out.println("=====================");
       
        System.out.println("Karakter s terletak pada posisi ke:"+A.indexOf('s'));
        System.out.println("Karakter a terletak pada posisi ke:"+A.indexOf('a'));
        System.out.println("Karakter v terletak pada posisi ke:"+A.indexOf('v'));
        System.out.println("setelah posisi ke-10, karakter s terletak pada " + "posisi ke:"+A.indexOf('s',10));
        System.out.println("setelah posisi ke-10, karakter a terletak pada " + "posisi ke:"+A.indexOf('a',10));
        
    }

    
}
