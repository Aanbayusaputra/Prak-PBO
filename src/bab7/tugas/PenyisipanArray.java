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

import java.util.Arrays;
import java.util.Scanner;
public class PenyisipanArray {
    static void printArray(int [] array){
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void main(String[] args) {

       System.out.println("======================================");
        System.out.println("===== Nama   = Aan Bayu Saputra =====");
        System.out.println("===== NIM    = 326002000004      =====");
        System.out.println("======================================\n");

    Scanner input = new Scanner(System.in);

    int [] array = new int[2];

    for (int i = 0 ; i < 2 ; i++){
        System.out.print("indek ke - " + i + " = ");
        array[i] = input.nextInt();
    }
    printArray(array);

    System.out.print("Masukan nilai sisipan = ");
    int sisipan = input.nextInt();
    System.out.print("Masukan indeks sisipan = ");
    int indeksSisipan = input.nextInt();

    int [] arraySisipan = Arrays.copyOf(array, 2);

    try{
        if (indeksSisipan == 0){
            arraySisipan[0] = sisipan;
            arraySisipan[1] = array[0];
            arraySisipan[2] = array[1];
        }else if (indeksSisipan == 1){
            arraySisipan[0] = array[0];
            arraySisipan[1] = sisipan;
            arraySisipan[2] = array[1];
        }else{
            arraySisipan[0] = array[0];
            arraySisipan[1] = array[1];
            arraySisipan[2] = sisipan;
        }
    }catch (Exception e){
    System.err.println("Melampaui RENTANG");
}
printArray(arraySisipan);
}
}
