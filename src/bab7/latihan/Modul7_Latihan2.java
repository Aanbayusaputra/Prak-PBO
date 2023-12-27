/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7.latihan;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Modul7_Latihan2 {
             public static void cobaEksepsi(int pembilang, int penyebut) {try {
             
            int hasil = pembilang / penyebut;            
            System.out.println("Hasil bagi: " + hasil); 
            int[] Arr = {1, 2, 3, 4, 5}; 
            // array dengan 5 elemen  
            Arr[ 10] = 23; 
            // mengakses indeks ke-10 
        } catch (ArithmeticException eksepsi1) { 
            System.out.println( 
                    "Terdapat pembagian dengan0"); 
        } catch (ArrayIndexOutOfBoundsException 
eksepsi2) { 
            System.out.println("Indeks di luar rentang");         }
        
    }  
        
    public static void main(String[] args) {cobaEksepsi(4, 0); 
    System.out.println("Nama : Aan Bayu Saputra");
    System.out.println("NIM  : 32602000004" );
    
// menimbulkan rithmeticException  
        System.out.println(); 
// menimbulkan ArrayIndexOutOfBoundsException 
        cobaEksepsi(12, 4); 
    } 

}
