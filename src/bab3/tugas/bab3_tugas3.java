/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */
import java.util.Scanner;

public class bab3_tugas3 {
    public static int n, z = 0;
    public static int cari;
    public static int[] x;
    public static boolean found = false;

    public static void main(String[] args) {
        searchingArray();

        System.out.println(" Nama : Aan Bayu Saputra");
        System.out.println(" NIM  : 32602000004");
        System.out.println("=====================");
        
        System.out.println("Sebelum Dilakukan Sorting dari terkecil");
        displayArray(x);

        System.out.println();
        sortAscending(x);
        System.out.println();

        sortDescending(x);
        System.out.println();
    }

    private static void sortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sesudah Dilakukan Sorting dari terkecil");
        displayArray(array);
    }

    private static void sortDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sesudah Dilakukan Sorting dari terbesar");
        displayArray(array);
    }

    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void searchingArray() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input jumlah N: ");
        n = s.nextInt();
        x = new int[n];

        for (int index = 0; index < n; index++) {
            System.out.print("Input angka ke-" + (index + 1) + ": ");
            x[index] = s.nextInt();
        }

        System.out.print("Input data yang dicari: ");
        cari = s.nextInt();

        for (int index = 0; index < n; index++) {
            if (x[index] == cari) {
                found = true;
                z = index + 1;
                System.out.println("Data ditemukan di Index ke :" + z);
            }
        }

        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
