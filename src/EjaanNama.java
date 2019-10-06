/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class EjaanNama {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          
          System.out.print("Masukkan nama depan anda untuk di eja : ");
          String nama = scanner.next();
          
          System.out.println("Ejaan untuk " + nama + " adalah : ");
          for(int i = 0; i < nama.length(); i++){
             System.out.println("Huruf ke-" + (i+1) + " : " + nama.substring(i, i+1));
          }
      
    }
}
