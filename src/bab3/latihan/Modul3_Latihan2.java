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
public class Modul3_Latihan2 {
    public static void main(String[] args) {
        System.out.println("Nama\t: Aan Bayu Saputra"); 
        System.out.println("NIM\t: 32601900004"); 
        System.out.println("====================="); 

        double nilai[][] = {
            {50, 60, 70},
            {70, 75, 87},
            {89, 90, 90},
            {65, 76, 89},
            {65, 70, 80}
        };

        int N = nilai.length;
        char huruf;

        for (int i = 0; i < N; i++) {
            int M = nilai[i].length;
            double totNilai = 0;

            for (int j = 0; j < M; j++) {
                totNilai += nilai[i][j];
            }

            double rata2 = totNilai / M;

            if (rata2 > 80.0d) {
                huruf = 'A';
            } else if (rata2 > 70.0d) {
                huruf = 'B';
            } else if (rata2 > 60.0d) {
                huruf = 'C';
            } else if (rata2 > 50.0d) {
                huruf = 'D';
            } else {
                huruf = 'E';
            }

            System.out.println("Nilai Mahasiswa ke- " + i + " = " + rata2 + " ( " + huruf + " ) ");
        }
    }
}