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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class latihan4 {
    public static void main(String[] args) {
        int data;
        FileInputStream finput = null;
        try{
            finput = new FileInputStream("E:/Input.txt");
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Aan Bayu Saputra\n32602000004\n");
            return;
        }
        try{
            while ((data = finput.read()) != -1) {
                System.out.print((char) data);
            }
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return;
        }
        try{
            finput.close();
        }
        catch (IOException ioe){
        }
    }    
}


