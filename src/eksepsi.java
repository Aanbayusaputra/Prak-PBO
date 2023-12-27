
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class eksepsi  {
public static void main(String[]args){
    System.out.println("Aan Bayu Saputra");
System.out.println("Nim : 32602000004");
try{
int bil=Integer.valueOf(JOptionPane.showInputDialog("Input Bil "));
System.out.println("Nilai Bil = "+bil);
 
System.out.println("Nilai Bil dibagi 0= "+(bil/0));
}
catch(NumberFormatException e){

System.out.println("Catch 1 : Kesalahan : Input harus numerik \n"+e);
} catch(ArithmeticException e){
System.out.println("Catch 2 : Kesalahan : Ada pembagian dengan 0 \n"+e);
} 
catch(Exception e){
System.out.println("Catch 3: Kesalahan : Input harus numerik \n"+e);

}
}
}