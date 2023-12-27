/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */
public class Modul7_Tugas {
     public static void main(String[] args) {  
         
         System.out.println("Nama\t: Aan Bayu Saputra"); 
        System.out.println("NIM\t: 32601900004"); 
        System.out.println("====================="); 
        try  
        {  
        int arr[]= {1,2};
        
        System.out.println(arr[3]); //may throw exception   
        }  
            // handling the array exception  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Array berubah {1,3,2}");  
    }  
    
}
