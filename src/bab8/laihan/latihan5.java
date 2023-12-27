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

import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException;
public class latihan5 {
    public static void main(String[] args) {
        System.out.println("Aan Bayu Saputra\n32602000004\n");
        FileOutputStream foutput = null;
        String data = "Selamat Menempuh Hidup baru \n by : Ilham Hidayat";
        try{
        foutput = new FileOutputStream("E:/Output.txt");
    }catch (FileNotFoundException fnfe){
            System.out.println("Selamat Menempuh Hidup baru");
            return;
    }
        try{
            for (int i=0; i<data.length(); i++) {
                foutput.write((int) data.charAt(i));
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return;
        }
        try{
            foutput.close();
        }catch (IOException ioe){       
        }
    }
}
