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
public class Modul3_Latihan4 {
        public static void main(String[] args){
       System.out.println("Nama\t: Aan Bayu Saputra"); 
       System.out.println("NIM\t: 32601900004"); 
       System.out.println("====================="); 
        
        String A = "Laboratorium Komputasi dan Sistem Cerdas";
        String B = "LABORATORIUM KOMPUTASI DAN SISTEM CERDAS";
        String C, D, E;
        C = "Laboratorium Komputasi Sistem Cerdas";
        D = "LABORATORIUM KOMPUTASI SISTEM CERDAS";
        E = "Laboratotium Komputasi dan sistem Cerdas";
        
        boolean tes1, tes2, tes3;
        tes1 = A.equals(B);
        tes2 = (A==C);
        tes3 = A.equals(E);
        
        System.out.println("["+A+"]==["+B+"} --> "+tes1);
         System.out.println("["+A+"]==["+C+"} --> "+tes2);
          System.out.println("["+A+"]==["+E+"} --> "+tes3);
           System.out.println("["+A+"]==["+D+"} --> "+B.equals(D));
            System.out.println("["+A+"]==["+B+"} --> "+(C==E));
        
    }
    
}

    

