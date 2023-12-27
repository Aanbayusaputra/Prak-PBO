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
public class Modul3_latihan13 {
        public static void main(String[] args){
        System.out.println(" Nama : Aan Bayu Saputra");
            System.out.println(" NIM  : 32602000004");
        String A = "Lab. KSC";
        char[] karakter0 = A.toCharArray();
        char[] karakter1 = new char[7];
        A.getChars(2,6, karakter1,1);
        
        System.out.println("Kalimat asli: "+A);
        
        System.out.println("Per Karakter ");
        for (int i=0; i<A.length(); i++)
        {
            System.out.println("Karakter ke-"+(i+1)+": "+karakter0[i]);
            
        }
        
        System.out.println("Karakter ke-2 sampai ke-6");
        for (int i=1; i<karakter1.length; i++)
        {
            System.out.println("karakter ke-"+i+": "+karakter1[i]);
        
        }
    }

    
}
