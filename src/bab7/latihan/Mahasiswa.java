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
public class Mahasiswa {
    
 private String nim;    
 private String nama; 
 public void setNIM(String inputNIM) {try { 
            nim = inputNIM; if (inputNIM == null) { 
                throw new NullPointerException(); 
            } 
        } catch (NullPointerException npe) { 
            System.out.println("KESALAHAN: " 
                    + "NIM tidak boleh null"); 
        } 
    }  
    public String getNIM() {return nim; 
    }  
    public void setNama(String inputNama) { 
        try { 
            nama = inputNama;  if (nama == null) { 
                throw new NullPointerException(); 
            } 
        } catch (NullPointerException npe) { 
            System.out.println("KESALAHAN: " + "Nama mahasiswa tidak boleh null"); 
        } 
    }  
    public String getNama() {
            return nama; 
    } 
  
     
    public static void main(String[] args) { 
         System.out.println("Nama :Aan Bayu Saputra");
    System.out.println("NIM : 32602000004" );
        Mahasiswa mhs = new Mahasiswa(); 
        mhs.setNIM(null);         mhs.setNama("Nadilla"); 
        System.out.println("\nNIM : " + 
mhs.getNIM()); 
        System.out.println("Nama : " + 
mhs.getNama()); 
    } 

}