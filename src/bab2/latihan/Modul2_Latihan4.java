/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab2.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Modul2_Latihan4 {
     public static void main(String[] args) {
        // TODO code application logic here
        boolean A=true, B=false;
        
        boolean o_and = A && B;
        boolean o_or  = A || B;
        boolean o_notA = !A;
        boolean o_notB = !B;
        
        System.out.println(A+"AND" +B+ "=>"+o_and);
        System.out.println(A+"OR " +B+ "=>"+o_or);
        System.out.println(A+"NOT" +B+ "=>"+o_notA);
        System.out.println(A+"NOT" +B+ "=>"+o_notB);
        
    }
    
}
