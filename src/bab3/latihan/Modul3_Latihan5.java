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
public class Modul3_Latihan5 {
        public static void main(String[] args){
       System.out.println("Nama\t: Aan Bayu Saputra"); 
       System.out.println("NIM\t: 32601900004"); 
       System.out.println("====================="); 
        
        
        String[] nama = {"Megawati Sukarno Putri",
            "Susilo Bambang Yudoyono",
            "Prabowo subianto",
            "Boediono",
            "Wiranto"};
        
        String sementara;
        int N = nama.length;
        
        System.out.println("Daftar nama sebelum diurutkan");
        for (int i=0; i<N; i++)
        {
            System.out.println((i+1)+". "+nama[i]);
        }
        for (int i=0; i<=N-2; i++)
        {
            for (int j=i+1; j<N-1; j++)
        {
            
            if (nama[i].compareTo(nama[j])>0)
            {
                sementara = nama[i];
                nama[i]   = nama[j];
                nama[j]   = sementara;
            }
        }
    }
    
    System.out.println("Daftar nama setelah diurutkan");
    for (int i=0; i<N; i++)
    {
        System.out.println((i+1)+". "+nama[i]);
    }
}  

    
}
