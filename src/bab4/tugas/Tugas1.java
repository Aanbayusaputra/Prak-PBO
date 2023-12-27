/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4.tugas;

/**
 *
 * @author Aan Bayu Saputra
 */
import java.util.Scanner;
public class Tugas1 {
    public static void daftar(double[]nilai, char[]huruf, int[] sks){
        System.out.println("==================================================");
        System.out.println("MatKuliah       Nilai       Huruf           Sks");
        System.out.println("==================================================");
        System.out.println("PAI             "+nilai[0]+"          "+huruf[0]+"              "+sks[0]);
        System.out.println("Pancasila       "+nilai[1]+"          "+huruf[1]+"              "+sks[1]);
        System.out.println("Bahasa Inggris  "+nilai[2]+"          "+huruf[2]+"              "+sks[2]);
        System.out.println("Sistem Operasi  "+nilai[3]+"          "+huruf[3]+"              "+sks[3]);
        System.out.println("Basis Data      "+nilai[4]+"          "+huruf[4]+"              "+sks[4]);
    }//Sub Program daftar yang akan diprint. berisi parameter nilai, huruf dan sks.

    public static void ip(double[]nilai, char[]huruf, int[] sks, int[] angka)
    {
        double Total1=0;
        for (int i = 0; i <= 4; i++) {
            double total2=sks[i]*angka[i];
            Total1=Total1+total2;
        }//Berisi For untuk mengalikan masing-masing sks dengan nilai angka sesuai dengan angka huruf.

        double totalsks=sks[0]+sks[1]+sks[2]+sks[3]+sks[4];
        double ip=Total1/totalsks;
        System.out.println("");
        System.out.println("IPK = "+ip);
        System.out.println("\n");
    }//Menghitung hasil ip yang akan diprint. dengan cara membagi total nilai dengan total jumlah sks.

    public static void main(String[] args) {
        
        System.out.println("Nama\t: Aan Bayu Saputra");
   System.out.println("Nim\t: 32602000004\n");
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
//Sistem inputan nilai menggunakan inptan Scanner.

        double nilai[]=new double[5];
        int angka[]=new int[5];
        char huruf[]=new char[5];
        int sks[]=new int[5];
//Pendeklarasi an tipe data nilai, angka, huruf dan sks menggunakan Array.

        System.out.print("Masukkan Nilai PAI : ");
        nilai[0]=input.nextDouble();
        System.out.print("Jumlah SKS         : ");
        sks[0]=input1.nextInt();
        System.out.println("");
//Memberi inputan pada varibel nilai dan sks.

        System.out.print("Masukkan Nilai Pancasila: ");
        nilai[1]=input.nextDouble();
        System.out.print("Jumlah SKS              : ");
        sks[1]=input1.nextInt();
        System.out.println("");
//Memberi inputan pada varibel nilai dan sks.

        System.out.print("Masukkan Nilai Bahasa Inggris : ");
        nilai[2]=input.nextDouble();
        System.out.print("Jumlah SKS                    : ");
        sks[2]=input1.nextInt();
        System.out.println("");
//Memberi inputan pada varibel nilai dan sks.

        System.out.print("Masukkan Nilai Sistem Operasi : ");
        nilai[3]=input.nextDouble();
        System.out.print("Jumlah SKS                    : ");
        sks[3]=input1.nextInt();
        System.out.println("");
//Memberi inputan pada varibel nilai dan sks.

        System.out.print("Masukkan Nilai Basis Data : ");
        nilai[4]=input.nextDouble();
        System.out.print("Jumlah SKS                : ");
        sks[4]=input1.nextInt();
        System.out.println("");
//Memberi inputan pada varibel nilai dan sks.

        for (int i = 0; i <= 4; i++) {
            if(nilai[i]<40){
                angka[i]=0;
                huruf[i]='E';
            }
            else if(nilai[i] >= 40 && nilai[i] <= 54){
                angka[i]=1;
                huruf[i]='D';
                }
            else if(nilai[i] >= 55 && nilai[i] <= 69){
                angka[i]=2;
                huruf[i]='C';
                }
            else if(nilai[i] >= 70 && nilai[i] <= 84){
                angka[i]=3;
                huruf[i]='B';
                }
            else if(nilai[i] >= 85 && nilai[i] <= 100){
                angka[i]=4;
                huruf[i]='A';
                }
        }//Menentukan batasan nilai angka dan nilai huruf menggunakan For dan If.

        daftar(nilai, huruf, sks);
        ip(nilai, huruf, sks, angka);
//Memanggil Sub Program daftar dan ip yang akan diprint.

    }
}
